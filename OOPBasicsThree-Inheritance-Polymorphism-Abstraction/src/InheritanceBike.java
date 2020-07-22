public class InheritanceBike {
    public int gear;
    public int speed;

    public InheritanceBike (int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int dec) {
        speed -= dec;
    }
    public void speedUp(int inc){
        speed += inc;
    }

    @Override
    public String toString() {
        return "InheritanceBike{" +
                "gear=" + gear + ", speed=" + speed + '}';
    }
}
