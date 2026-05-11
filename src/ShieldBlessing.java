public class ShieldBlessing extends HeroDecorator {
    public ShieldBlessing(Hero hero) {
        super(hero);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("  + Shield Blessing applied!");
    }
}