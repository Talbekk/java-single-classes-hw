public class WaterBottle {
    private double volume;

    public WaterBottle(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return this.volume;
    }

    public void drink(double amount){
        this.volume -= amount;
    }

    public void empty(){
        this.volume = 0;
    }

}

