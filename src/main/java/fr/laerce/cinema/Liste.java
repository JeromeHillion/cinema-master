package fr.laerce.cinema;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by fred on 03/02/2016.
 */

public class Liste extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FilmsDonnees filmsDonnees = new FilmsDonnees();

        // pour les besoins de la vue
        request.setAttribute("films", filmsDonnees.lesFilms);
        String sort = request.getParameter("sort");
        if (sort == null) {
            Collections.sort(filmsDonnees.lesFilms, new FilmComparatorAsc());
        } else if ("note".equals(sort)) {
            Collections.sort(filmsDonnees.lesFilms, new Comparator<Film>() {
                @Override
                public int compare(Film o1, Film o2) {
                    return Double.compare(o1.note, o2.note);
                }
            });


        }else if ("notedesc".equals(sort)){
            Collections.sort(filmsDonnees.lesFilms, (Film o1, Film o2) -> Double.compare(o2.note, o1.note));
        }

        /*  *//*sort alphabétiue ascendanrt ou descendant
         * avec l'interface comparator*//*
        switch (sort== null) {
            case "name_asc":
                //avec l'interface comparator
              *//*  Collections.sort(filmsDonnees.lesFilms, new FilmComparatorAsc());*//*

                // Avec une expression lambda
                filmsDonnees.lesFilms.sort((Film o1, Film o2) ->  o1.titre.compareToIgnoreCase(o1.titre));
                break;

            case "name_desc":
                // avec l'interface Comparator
//            Collections.sort(filmsDonnees.lesFilms, new FilmComparatorDesc());
// avec une expression lambda (méthode plus légère)

                Collections.sort(filmsDonnees.lesFilms, (Film o1, Film o2) -> o2.titre.compareToIgnoreCase(o1.titre));

                break;

            case "note_asc":
                *//* sort par note du film, ascendant ou descendant **//*
                Collections.sort(filmsDonnees.lesFilms, Comparator.comparingDouble((Film o) -> o.note));
                break;

            case "note_desc":
                Collections.sort(filmsDonnees.lesFilms, (Film o1, Film o2) -> Double.compare(o2.note, o1.note));
                break;*/


        //Délagation de la vue
        String jspview = "liste.jsp";
        getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/" + jspview).forward(request, response);


    }
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



