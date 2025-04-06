/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.senati;
import java.sql.*;
/**
 *
 * @author TOROJ
 */
public class Conexion_Juegos {
    public Connection conectar(){
        
        String url = "jdbc:mysql://localhost:3306/senati?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
        
        Connection cn = null;
        try{
            cn = DriverManager.getConnection(url, user, password);
            if (cn != null ){
                System.out.println("conectado");
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
        
        
        return cn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Conexion cn=new Conexion();
        cn.conectar();
    }
}
