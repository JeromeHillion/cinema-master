package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class Historique extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();
        List<Film> filmsVus = (List<Film>) session.getAttribute("listeFilmsConsultes");

        //Pour les besoins de la vue
        request.setAttribute("films", filmsVus);

        //Délégation de la vue
        String jspview = "historique.jsp";
        getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/" + jspview).forward(request, response);
    }
}
