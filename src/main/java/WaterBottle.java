public class WaterBottle {
    private int volume;


    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int minusTen() {
        return this.volume - 10;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fullBottle() {
        return this.volume = 100;
    }
}
