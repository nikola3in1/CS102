
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baza
{

    private static java.sql.Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/Dz12";
    private static String user = "root";
    private static String pass = "";
    private static String query = "";

    public static void connect()
    {
        try
        {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex)
        {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void disconnect()
    {
        try
        {
            con.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public static ArrayList<Student> getAllUsers(int smerId)
    {
        String sId = "'"+smerId+"'";
        ArrayList<Student> users = new ArrayList<Student>();

        try
        {
            Statement st = con.createStatement();
            query = "SELECT studenti.*" +
                    "FROM `studenti`" +
                    "LEFT JOIN smerovi ON studenti.id_smera = smerovi.id" +
                    " WHERE studenti.id_smera="+sId;
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                int brIndexa= rs.getInt("br_indexa");
                int id = rs.getInt("id_smera");
                int espb = rs.getInt("broj_polozenih_espb");
                Student u = new Student(ime,prezime,brIndexa,id,espb);
                users.add(u);
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;

    }

}