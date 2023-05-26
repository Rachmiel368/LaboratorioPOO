/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Conn.ConexionBD;
import java.sql.SQLException;

/**
 *
 * @author rachm
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/nombre_basedatos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        ConexionBD gestorBD = new ConexionBD(url, usuario, contraseña);
        gestorBD.conectar();

        //Aqui se realizan las operaciones en la base de datos.

        gestorBD.desconectar();
    }
}
