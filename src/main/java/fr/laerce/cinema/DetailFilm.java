package fr.laerce.cinema;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class DetailFilm extends HttpServlet {
    public DetailFilm() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Integer id = Integer.parseInt(request.getParameter("id"));
        FilmsDonnees filmsDonnees = new FilmsDonnees();
        Film film = filmsDonnees.getById(id);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Détail film</title>");
        printWriter.println("<link href='//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css' rel='stylesheet' id='bootstrap-css'>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>Le film</h1>");
        printWriter.println("<h1>Fiche du film : " + film.titre + "</h1>");
        printWriter.println("<img src='affiche?id=" + film.id + "'>");
        printWriter.println("<h3>Fiche du film : " + film.note + " </h3>");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }
}


