/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.digitalsolutions.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private static final String host = "bancobiblioteca-sabrina-40e4.aivencloud.com";
    private static final String port = "11750";
    private static final String user = "avnadmin";
    //maquinas da USJT: senha anima123
    private static final String password = "AVNS_edQSfPhQZ4w6l0qR5Zx";
    private static final String db = "defaultdb";
    
    public static Connection conectar() throws Exception {
        //http://dontpad.com:80/bossini
        //String de conexão
        //String s = "jdbc:mysql://" + host + ":" + port + "/" + db;
        String s = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, db
        );
        
        Connection c = DriverManager.getConnection(
                s, 
                user, 
                password
        );
        return c;
    }
    
}
