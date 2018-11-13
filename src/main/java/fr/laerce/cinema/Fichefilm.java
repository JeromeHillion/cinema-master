package fr.laerce.cinema;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Fichefilm extends HttpServlet{
    public Fichefilm() {
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-/fichefilm.jsp");
   /*     Integer id = Integer.parseInt( request.getParameter("id"));
        FilmsDonnees fd = new FilmsDonnees();
        Film film = fd.getById(id);
        //ServletContext cntx= getServletContext();
        // Chemin absolu de l'image
        //String filename = cntx.getRealPath("WEB-INF/datas/affiches/"+film.afficheNom);
        // Type mime associé à l'image d'après le nom de fichier

       PrintWriter printWriter = response.getWriter();
       printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Détail film</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1> Fiche du film </h1>");
        printWriter.println("<h2>"+film.titre+"<h2>");
        printWriter.println("<img href='img/"+film.afficheNom+"'>");
        printWriter.println("<h3>"+film.note+"</h3>");
        printWriter.println("</body>");
        printWriter.println("</html>");


    }

*/
}
}
