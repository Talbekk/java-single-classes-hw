public class WaterBottle {
    private double volume;
    private double startingVolume;

    public WaterBottle(double volume, double startingVolume){
        this.volume = volume;
        this.startingVolume = startingVolume;
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

    public void fill(){
        this.volume = this.startingVolume;
    }

}
