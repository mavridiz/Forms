/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gerdoc.proyecto1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.gerdoc.proyecto1.dao.Alumno;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            List<Alumno>alumnos = null;
            Alumno alumno = null;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Calificaciones</title>"); 
            out.println("<link rel=\"stylesheet\" href=\"index.css\">");
            out.println("<link href=\"https://fonts.googleapis.com/css2?family=Quicksand&display=swap\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body>");
            alumnos = new ArrayList<>( );
            for( int i = 0; i < 5; i++)
            {
               alumno = new Alumno( );
               alumno.setNombre( request.getParameter( "nombre" + (i + 1) ) );
               alumno.setCalif( request.getParameter( "calificacion" + (i + 1) ) );
               alumno.setColorCH(request.getParameter( "colorCH" + (i + 1) ) );
               alumno.setSaborAF(request.getParameter( "saborAF" + (i + 1) ) );
               alumnos.add(alumno);
            }
            out.println("<table border=\"1\">");
            out.println("<tr class=\"header\">");
            out.println("<td>");
            out.println("Nombre");
            out.println("</td>");
            out.println("<td>");
            out.println("Calificación");
            out.println("</td>");
            out.println("<td>");
            out.println("Color de Chilaquiles favorito");
            out.println("</td>");
            out.println("<td>");
            out.println("Sabor de agua favorito");
            out.println("</td>");            
            out.println("</tr >");
            
        Collections.sort(alumnos, new Comparator<Alumno>() {
	@Override
	public int compare(Alumno p1, Alumno p2) {
		return new Integer(p1.getCalif()).compareTo(new Integer(p2.getCalif()));
	}
        });
        
            for( Alumno aux : alumnos )
            {
                out.println("<tr class=\"info\">");
                out.println("<td>");
                out.println(aux.getNombre());
                out.println("</td>");
                out.println("<td>");
                out.println(aux.getCalif());
                out.println("</td>");
                out.println("<td>");
                out.println(aux.getColorCH());
                out.println("</td>");
                out.println("<td>");
                out.println(aux.getSaborAF());
                out.println("</td>");
                out.println("</tr>");   
            }
            out.println("</table>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
