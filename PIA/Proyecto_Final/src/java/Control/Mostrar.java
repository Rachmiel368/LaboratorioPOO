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
import java.sql.ResultSet;
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
@WebServlet(name = "Mostrar", urlPatterns = {"/Mostrar"})
public class Mostrar extends HttpServlet {

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
            out.println("<title>Servlet Mostrar</title>");            
            out.println("</head>");
            out.println("<body>");
            
            usr.setFname(request.getParameter("fname"));
            String srfname = usr.getFname();
            
            String url = "jdbc:mysql://localhost:3306/pia_datos";
            String usuario = "root";
            String contraseña = "12345678";

            ConexionBD conexionBD = new ConexionBD(url, usuario, contraseña);
            conexionBD.conectar();
            Connection conexion = conexionBD.getConnection();
            
            
            Statement st = conexion.createStatement();
            String consulta = "SELECT * FROM usuario";
            ResultSet resultSet = st.executeQuery(consulta);

            out.println("<html>");
            out.println("<head><title>Contenido de la tabla</title></head>");
            out.println("<body>");

            out.println("<table>");
            out.println("<tr><th>       ID</th><th>Nombre</th><th>Apellido</th><th>Color</th></tr>");

            while (resultSet.next()) {
                
                String id = resultSet.getString("IDUsuario");
                String fname = resultSet.getString("FName");
                String lname = resultSet.getString("LName");
                String color = resultSet.getString("Color");
                if(srfname.equals(fname) || srfname.equals(id) || srfname.equals(lname))
                out.println("<tr><td>" + id + "</td><td>" + fname + "</td><td>" + lname + "</td><td>" + color + "</td></tr>");
            }
            out.println("</table>");
            conexionBD.desconectar();
            out.println("<button onclick=\"window.location.href = 'index.html';\">Regresar</button> ");
            
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
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
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
