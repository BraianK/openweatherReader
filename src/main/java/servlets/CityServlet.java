package servlets;

import jerseyclientdemo.service.CityService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/jaz")
public class CityServlet extends HttpServlet {




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

       String city1 = request.getParameter("city1");
       printCity(response,city1);


        printCity(response,"Warsaw");
        printCity(response,"Gdansk");
        printCity(response,"Krakow");
        printCity(response,"Wroclaw");
        printCity(response,"Poznan");
        printCity(response,"Katowice");


    }

    public void printCity(HttpServletResponse response, String name) throws IOException{
        CityService city = new CityService();
        response.getWriter().println("Miasto: "+city.getCity(name).getName());
        response.getWriter().println(city.getCity(name).getMain().getTemp()+" Stopni Celcjusza");
        response.getWriter().println("Cisnienie: "+city.getCity(name).getMain().getPressure()+" hPa");
        response.getWriter().println("Predkosc wiatru: "+city.getCity(name).getWind().getSpeed()+"m/s");
        response.getWriter().println("Zachmurzenie: "+city.getCity(name).getWeather().getDescription());
        response.getWriter().println("====================================");
    }

}
