package clases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de la comunicación entre el programa y la base de datos
 * @author erick
 */
public class datos{
    Connection cn;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela","root","");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error:\n"+e.getMessage(),"Error",JOptionPane.WARNING_MESSAGE);
        }catch(ClassNotFoundException x){
            JOptionPane.showMessageDialog(null,"Error:\n"+x.getMessage(),"Error",JOptionPane.WARNING_MESSAGE);
        }
        return cn;
    }
}