public class InheritanceMountainBike extends InheritanceBike{
    int seatHeight;
    public InheritanceMountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newVal){
        seatHeight = newVal;
    }

    @Override
    public String toString() {
        return "InheritanceMountainBike{" + "seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + '}';
    }
}
