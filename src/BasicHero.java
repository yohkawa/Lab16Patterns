public class BasicHero implements Hero {
    private final String name;

    public BasicHero(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Hero: " + name);
    }
}