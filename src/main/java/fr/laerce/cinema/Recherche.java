package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;



public class Recherche extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ArrayList<Film> filmsRecherche = new ArrayList<>();
        HttpSession session = request.getSession();
        String titre = request.getParameter("titre");

        FilmsDonnees filmsDonnees = new FilmsDonnees();

        //Pour les besoins de la vue
        request.setAttribute("films" , filmsRecherche);

        for (Film film : filmsDonnees.lesFilms){
            String filmTitre = film.titre;

            if (filmTitre.toLowerCase().contains(titre.toLowerCase())){
                filmsRecherche.add(film);
            }
        }

        //Délégation de la vue
        String jspview ="recherche.jsp";
        getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/" + jspview).forward(request,response);


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}


