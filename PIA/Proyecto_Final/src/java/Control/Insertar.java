/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Control;

import Class.Usuario;
import Conn.ConexionBD;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rachm
 */
@WebServlet(name = "Insertar", urlPatterns = {"/Insertar"})
public class Insertar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        Usuario usr = new Usuario();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Insertar</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            usr.setFname(request.getParameter("fname"));
            usr.setLname(request.getParameter("lname"));
            usr.setColor(request.getParameter("color"));
            usr.setID(request.getParameter("IDusuario"));
            
            String IDUsuario = usr.getID();
            
            int ID = Integer.parseInt(IDUsuario);
            
            String url = "jdbc:mysql://localhost:3306/pia_datos";
            String usuario = "root";
            String contraseña = "12345678";

            ConexionBD conexionBD = new ConexionBD(url, usuario, contraseña);
            conexionBD.conectar();
            Connection conexion = conexionBD.getConnection();    
            
            String query = "INSERT INTO usuario (IDusuario, FName, LName, Color) " + "VALUES ("+ID+", '" + usr.getFname() + "', '" + usr.getLname() + "', '" + usr.getColor()+"')";
            
            Statement st = conexion.createStatement();
            st.executeUpdate(query);
            
            conexionBD.desconectar();
            out.println("<table>");
            out.println("<tr><th>IDUsuario</th><th>Nombre</th><th>Apellido</th><th>Color</th></tr>");
            out.println("<tr><td>" + ID + "</td><td>" + usr.getFname() + "</td><td>" + usr.getLname() + "</td><td>" + usr.getColor() + "</td></tr>");
            out.println("</table>");
            out.println("<h1>El registro se ha añadido con exito.</h1><br>"
                    + "<button onclick=\"window.location.href = 'index.html';\">Regresar</button> ");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
