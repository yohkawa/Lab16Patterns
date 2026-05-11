import java.util.*;

public class WeatherStone {
    private static WeatherStone instance;
    private final List<WeatherObserver> observers = new ArrayList<>();

    private WeatherStone() {}

    public static WeatherStone getInstance() {
        if (instance == null) {
            instance = new WeatherStone();
        }
        return instance;
    }

    public void addObserver(WeatherObserver o) {
        observers.add(o);
    }

    public void setWeather(String weather) {
        for (WeatherObserver o : observers) {
            o.updateWeather(weather);
        }
    }
}