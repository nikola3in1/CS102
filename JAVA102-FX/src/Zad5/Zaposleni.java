package Zad5;

import java.sql.*;

public class Zaposleni {
    private static Connection con = null;
    private static final String url = "jdbc:mysql://localhost:3306/Oktobar5zad";
    private static final String user = "root";
    private static final String pass ="n14031997";
    private static String query = "";

    String ime;
    String prezime;
    Integer godine;
    String pozicija;

    public Zaposleni(String ime, String prezime, Integer godine, String pozicija) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.pozicija = pozicija;
    }

    public void addToDB(){
        try{
            connect();
            Statement st = con.createStatement();
            st.execute("INSERT INTO zaposleni (ime,prezime,godine,pozicija) VALUES ('" + ime + "','" + prezime + "','" + godine + "','" + pozicija + "')");
            st.close();
            disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void printDB(int type){
        try{
            connect();
            Statement st= con.createStatement();
            if(type==1){
                query="SELECT * FROM `zaposleni` ORDER BY ime";
            }
            else if(type==2){
                query="SELECT * FROM `zaposleni` ORDER BY prezime";
            }
            else if(type ==3){
                query="SELECT * FROM `zaposleni` ORDER BY godine";
            }
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                Integer godine = rs.getInt("godine");
                String pozicija = rs.getString("pozicija");
                System.out.println("ime: "+ime+" prezime:"+prezime+" godine:"+godine+" pozicija:"+pozicija);
            }
            disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void connect(){
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void disconnect(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
