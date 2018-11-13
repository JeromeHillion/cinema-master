package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by fred on 03/02/2016.
 */

public class Liste<F> extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupération du nom de l'affiche dans le système de fichiers

    String s = "";

        FilmsDonnees filmsDonnees = new FilmsDonnees();


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">");
        out.println("<title>Détail film</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Le film</h1>");
        out.println("<ul>");
        for (Film f:filmsDonnees.lesFilms) {
            out.println("<li><a href='detailfilm?id="+f.id+"'>"+f.titre+"</a></li>"

                     );
        }

        ;
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    }

//    @Override
//    public void init() throws ServletException {
//        super.init();
//        System.out.println("Démarage du serveur");
//    }
//
//    @Override
//    public void destroy() {
//        super.destroy();
//        System.out.println("Fermeture du serveur");
//    }


}
