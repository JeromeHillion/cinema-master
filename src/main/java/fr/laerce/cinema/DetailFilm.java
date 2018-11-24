package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class DetailFilm extends HttpServlet {
   private List<Film> filmsConsultesSession;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        filmsConsultesSession = (List<Film>) session.getAttribute("listeFilmsConsultes");

        if (filmsConsultesSession == null) {
            filmsConsultesSession = new ArrayList<Film>();
            session.setAttribute("listeFilmsConsultes", filmsConsultesSession);
        }

        Integer id = Integer.parseInt(request.getParameter("id"));
        FilmsDonnees fd = new FilmsDonnees();
        Film film = fd.getById(id);

        filmsConsultesSession.add(film);

        // pour les besoins de la vue
        request.setAttribute("film", film);

        // délégation à la vue
        String jspview = "detail.jsp";
        getServletConfig().getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/" + jspview).forward(request, response);
    }
}


