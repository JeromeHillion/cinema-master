package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;



public class Recherche extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String search = request.getParameter("search");



        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Détail film</title>");
        out.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Le film</h1>");
        out.println("<ul>");


FilmsDonnees fd = new FilmsDonnees();
for (Film film : fd.lesFilms){
    int filmID = film.id;
    String filmTitre = film.titre;

    if (filmTitre.toLowerCase().contains(search.toLowerCase())){
        out.println("<li>");
        out.println("<a href='detailfilm?id=" + filmID + "'>" + film.titre + " (" + film.note + ")</a>");
        out.println("</li>");
    }
}

    out.println("</ul>");
    out.println("</body>");
    out.println("</html>");
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}


