package Zad1;

import java.sql.*;
import java.util.ArrayList;

public class Baza {
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/Zad1";
    private static String user = "root";
    private static String pass = "n14031997";

    public static void connect() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex){
//            System.out.println(ex.toString());
        }

    }

    public static void disconnect() {
        try {
            con.close();
        } catch (SQLException ex){}
    }

    public static void addNew(String ime, String prezime, String godine, String zvanje){
        connect();
        try {
            Statement st = con.createStatement();
            st.execute("INSERT INTO zaposleni (ime,prezime,godine,zvanje) VALUES ('"+ime+"','"+prezime+"','"+godine+"','"+zvanje+"')");
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
    }

    public static void update(String ime, String prezime){
        connect();
        try {
            Statement st = con.createStatement();
            st.execute("UPDATE `zaposleni` SET prezime="+"'"+prezime+"'"+"WHERE ime ="+"'"+ime+"'");
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
    }
    public static ArrayList<String> print(){
        connect();
        ArrayList<String> podaci = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery("SELECT * FROM zaposleni");
            while (re.next()){
                podaci.add(re.getString("ime"));
                podaci.add(re.getString("prezime"));
                podaci.add(re.getString("godine"));
                podaci.add(re.getString("zvanje"));
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
        return podaci;
    }

    public static void delete(String ime){
        connect();
        try {
            Statement st = con.createStatement();
            st.execute("DELETE FROM `zaposleni` WHERE ime='" + ime + "'");
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        disconnect();
    }
}
