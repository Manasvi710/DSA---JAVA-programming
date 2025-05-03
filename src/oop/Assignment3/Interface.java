package oop.Assignment3;

public class Interface {
    public static void main(String[] args) {
        Vehicales Bicycle=new Bicycle();
        Vehicales Bike=new Bike();
        Vehicales Car=new Car();
        Bicycle.ChangeGear(3);
        Bike.ChangeGear(3);
        Car.ChangeGear(5);
    }
}
interface Vehicales{
    void ChangeGear(int newGear);
}
class Bicycle implements Vehicales{
    int gear;
    int Bicycle_Gear=2;
    public Bicycle() {
        this.gear = gear;
    }
    public void ChangeGear(int newGear){
        if(Bicycle_Gear >=1 && newGear <= Bicycle_Gear){
            gear=newGear;
            System.out.println("Bicycle Gear - " +gear);
        }else {
            System.out.println("Invalide gear for bicycle");
        }
    }
}
class Bike implements Vehicales {
    int gear;
    int Bike_Gear = 3;

    public Bike() {

        this.gear = gear;
    }

    public void ChangeGear(int newGear) {
        if (Bike_Gear >= 1 && newGear <= Bike_Gear) {
            gear = newGear;
            System.out.println("Bike Gear - " + gear);
        } else {
            System.out.println("Invalide gear for bike");
        }
    }
}
class Car implements Vehicales{
        int gear;
        int Car_Gear=5;

        public Car() {
            this.gear = gear;
        }
        public void ChangeGear(int newGear){
            if(Car_Gear >=1 && newGear <= Car_Gear){
                gear=newGear;
                System.out.println("Car Gear - " +gear);
            }else {
                System.out.println("Invalide gear for Car");
            }
        }
}