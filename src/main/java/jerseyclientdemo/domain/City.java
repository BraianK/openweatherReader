package jerseyclientdemo.domain;

import jerseyclientdemo.domain.parameters.Main;
import jerseyclientdemo.domain.parameters.Weather;
import jerseyclientdemo.domain.parameters.Wind;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class City {

    private Weather weather;
    private Main main;
    private Wind wind;
    private String name;


    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}