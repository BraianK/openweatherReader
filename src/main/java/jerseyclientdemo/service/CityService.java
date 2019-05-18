package jerseyclientdemo.service;

import jerseyclientdemo.domain.City;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class CityService{
    public static final String URL = "http://api.openweathermap.org/data/2.5/weather";

    public static final String KEY = "b38c182846900b66a5ee788459aaa3c4";



    public City getCity(String name){
//        name = "Warsaw";
        return ClientBuilder
                .newClient()
                .target(URL + "?q=" + name + "&APPID=" + KEY + "&units=metric")
                .request(MediaType.APPLICATION_JSON)
                .get()
                .readEntity(City.class);

    }
}
