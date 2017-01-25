package ObserverPattern;

/**
 * Created by SkywingWang on 17/1/15.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentCounditionsDisplay counditionsDisplay = new CurrentCounditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
