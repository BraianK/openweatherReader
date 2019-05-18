package jerseyclientdemo.domain.parameters;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Main {
    private double temp;
    private double pressure;

    public double getTemp() {
        return temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
