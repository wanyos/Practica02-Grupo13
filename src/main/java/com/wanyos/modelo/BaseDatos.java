
package com.wanyos.modelo;

import com.wanyos.gestionapp.Init;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
    
     private String jdbcUrl = "jdbc:derby:C:/Derby/gestion-app;create=true";
     //private String jdbcUrl = "jdbc:derby:memory:gestion-app;create=true";
    
    private void createBD(){
        Connection cx;
        try {
            cx = DriverManager.getConnection(jdbcUrl);
        } catch (SQLException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Creada la bd...");
    }
    
      
    private void createTable(){
         Connection cx = null;
         Statement st = null;    
         try {
             cx = DriverManager.getConnection(jdbcUrl);
             st = cx.createStatement();
            String sqlCreateTableUsers =
             "CREATE TABLE users ( " +
             "FirstName VARCHAR(20) NOT NULL, " +
             "LastName VARCHAR(20) NOT NULL, " +
             "idUser INTEGER NOT NULL CONSTRAINT idUser_PK PRIMARY KEY " +
             ")";
            st.execute(sqlCreateTableUsers);
            st.close();
         } catch (SQLException ex) {
             Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (cx != null) {
                    cx.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
    
     
    private void insert() {
        Connection cx = null;
        Statement st = null;

        try {
            cx = DriverManager.getConnection(jdbcUrl);
            cx.createStatement();
            st.executeUpdate("INSERT INTO users VALUES('Juanjo', 'Romero', 1)");
            st.executeUpdate("INSERT INTO users VALUES('Maria', 'Hoz', 2)");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (cx != null) {
                    cx.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     private void select() {
        Connection cx = null;
        Statement st = null;

        try {
            cx = DriverManager.getConnection(jdbcUrl);
            cx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                Integer idUser = rs.getInt("idUser");
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                System.out.println(idUser + " se llama: " + first + " " + last);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (cx != null) {
                    cx.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
       }
    
}
