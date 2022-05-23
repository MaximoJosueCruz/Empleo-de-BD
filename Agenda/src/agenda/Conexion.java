/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Chumy
 */
public class Conexion {
    Connection con= null;
    public Connection conexion(){
        try{
            //Driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Tipo de conexión, el servidor, base de datos, usuario, password (usuario y password de xampp)
                                                                                                                                  //verificar usuario y contraseña
            con= DriverManager.getConnection("jdbc:mysql://localhost/contactos_bd","root","");
            System.out.println("Conexión realizada");
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexión: \n"+e);
        }
        return con;
    }
}
