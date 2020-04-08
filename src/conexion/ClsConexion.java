/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.*;
import java.sql.SQLException;

/**
 *
 * @author JUAN
 */
public class ClsConexion {
    private static Connection conection=null;
    public Connection getConection(){
        try{
            MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
            ds.setServerName("localhost");
            ds.setPort(3306);
            ds.setDatabaseName("basemusica");
            conection=ds.getConnection("root","");
        }catch(SQLException ex){
           ex.printStackTrace();
        }
        return conection;
    }
}