public class MonsterObserver implements WeatherObserver {
    private final String name;

    public MonsterObserver(String name) {
        this.name = name;
    }

    public void updateWeather(String weather) {
        System.out.println("Monster " + name + " reacts to " + weather + " weather!\n");
    }
}