package co.edu.sena.web2.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final  String USERNAME="root";
    private static final  String PASSWORD="";
    private static final  String  CONN_STRING="jdbc:mysql://localhost/ejemplo";

    public static Connection getConnectionToDataBase() {
        Connection con = null;


        try {
            con= DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);



        } catch (SQLException e) {
            System.out.println("Problemas al establecer la conexion");

            e.printStackTrace();
        }
        if (con != null) {
            System.out.println("Conexion a la base de datos");

        }

        return con;
    }



}//fin de clase Main