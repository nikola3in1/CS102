package Zad2;

import java.sql.*;
import java.util.ArrayList;

public class Baza {
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/Zad2";
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
    public static void addTo(String ime,String cena, String prozivodjac,String datum){
        connect();
        try {
            Statement st = con.createStatement();
            st.execute("INSERT INTO Sok (ime,cena,proizvodjac,datum_proizvodnje) VALUES ('"+ime+"','"+cena+"','"+prozivodjac+"','"+datum+"'"+")");
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();

    }

    public static void update(String ime,String cena){
        connect();
        try {
            Statement st = con.createStatement();
            st.execute("UPDATE `Sok` SET cena='"+cena+"' WHERE ime='"+ime+"'");
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();

    }

    public static void delete(String ime){
        connect();
        try {
            Statement st = con.createStatement();
            st.execute("DELETE FROM Sok WHERE ime='"+ime+"'");
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();

    }
    public static ArrayList<String> print (){
        connect();
        ArrayList<String> proizvodi = new ArrayList<>();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Sok");
            while(rs.next()){
                proizvodi.add(rs.getString("ime"));
                proizvodi.add(rs.getString("cena"));
                proizvodi.add(rs.getString("proizvodjac"));
                proizvodi.add(rs.getString("datum_proizvodnje"));
            }
            st.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
        return proizvodi;
    }


}
