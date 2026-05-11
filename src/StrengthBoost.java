public class StrengthBoost extends HeroDecorator {
    public StrengthBoost(Hero hero) {
        super(hero);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("\n  + Strength Boost applied!");
    }
}