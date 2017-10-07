
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Baza {
    private static java.sql.Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/Dz11";
    private static String username = "root";
    private static String password = "n14031997";
    public static List<Restoran> getAllKontakt(){
        ArrayList<Restoran> kontakti=new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, username, password);
            String query="SELECT * FROM Restoran";
            Statement st = (Statement) con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                String naziv =rs.getString("naziv");
                String brTel=rs.getString("broj_telefona");
                String radnoVreme=rs.getString("radno_vreme");
                String lokacija=rs.getString("lokacija");
                kontakti.add(new Restoran(naziv,brTel,radnoVreme,lokacija));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return kontakti;
    }

    public static void addKontakt(Restoran r){
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = (Statement) con.createStatement();
            st.execute("INSERT INTO Restoran (naziv,broj_telefona,radno_vreme,lokacija) "
                    + "" + "VALUES ('" + r.getNaziv() + "','" + r.getBroj()
                    +"','" + r.getRadnoVreme()+ "','" + r.getLokacija()+"')");
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void deleteKontakt(String s){
        try {
            con = DriverManager.getConnection(url, username, password);
            String query="DELETE FROM Restoran WHERE naziv=?";
            PreparedStatement st =  con.prepareStatement(query);
            st.setString(1, s);
            st.executeUpdate();
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void editKontakt(String naziv,String brTel,String lokacija,String radnoVreme){
        try {
            con = DriverManager.getConnection(url, username, password);
            String query="UPDATE Restoran SET naziv=?,broj_telefona=?,radno_vreme=?,lokacija=? WHERE naziv=?";
            PreparedStatement st =  con.prepareStatement(query);
            st.setString(1, naziv);
            st.setString(2, brTel);
            st.setString(3, radnoVreme);
            st.setString(4, lokacija);
            st.setString(5,naziv);
            st.executeUpdate();
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}