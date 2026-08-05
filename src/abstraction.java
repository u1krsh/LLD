interface Car{
    void startEngine();
    void shiftGear(int gear);
    void accelerate();
    void brake();
    void stopEngine();
}

class SportsCar implements Car{
    String brand;
    String model;
    boolean isEngineOn = false;
    int currentSpeed = 0;
    int currentGear = 0;

    public SportsCar(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println("Engine On");
    }

    @Override
    public void shiftGear(int gear) {
        if(!isEngineOn) return;
        this.currentGear = gear;
        System.out.println("Car is in " + currentGear +" gear");
    }

    @Override
    public void accelerate() {
        if(!isEngineOn) return;
        this.currentSpeed += 20;
        System.out.println("Current Speed is " + currentSpeed);
    }

    @Override
    public void brake() {
        if(!isEngineOn) return;
        this.currentSpeed -= 20;
        if (currentSpeed<=0) this.currentSpeed = 0;
        System.out.println("The current speed is " + currentSpeed);
    }

    @Override
    public void stopEngine() {
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println("The car has been turned off");
    }
}




public class abstraction {
    public static void main(String[] args) {
        Car myCar = new SportsCar("BMW", "M3");
        myCar.startEngine();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();
    }
}
