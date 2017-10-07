package B92;

import java.sql.*;
import java.util.ArrayList;

public class Baza {
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/B92";
    private static String user = "root";
    private static String pass = "n14031997";

    public static void connect() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex){
        }

    }

    public static void disconnect() {
        try {
            con.close();
        } catch (SQLException ex){}
    }

    public static void addTo(String vest){
        try{
            Statement st = con.createStatement();
            st.execute("INSERT INTO `vesti`(`vest`) VALUES ('" + vest + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<String> loadVesti(){
        connect();
        ArrayList<String> vesti = new ArrayList<>();
        try{
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery("SELECT vest FROM `vesti`");
            while (rs.next()){
                vesti.add(rs.getString("vest"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
        return vesti;
    }

}
