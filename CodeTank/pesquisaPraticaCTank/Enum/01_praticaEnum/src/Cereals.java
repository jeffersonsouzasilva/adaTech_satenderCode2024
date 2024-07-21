public enum Cereals {
    CAPATAIN_CRUNCH(50, 2.90),
    FROOT_LOOPS(60, 3.90),
    REESES_PUFFS(100, 4.89),
    COCOA_PUFFS(75, 3.67);

    final int levelOfDeliciousness;
    double price;

    Cereals (int levelOfDeliciousness, double price){
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
