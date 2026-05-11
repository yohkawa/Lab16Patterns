public class HeroObserver implements WeatherObserver {
    private final String name;

    public HeroObserver(String name) {
        this.name = name;
    }

    public void updateWeather(String weather) {
        System.out.println("Hero " + name + " prepares for " + weather + " weather!");
    }
}