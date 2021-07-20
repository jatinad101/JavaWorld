package Programs.OOPs;
public interface Car {
    void turnOnCar();

    void turnOffCar();
     
    String getCarType();
    
}
class ManualCar implements Car{

    private String carType = "Manual";

    @Override
    public void turnOnCar(){
        System.out.println("turn on the manual car");
    }

    @Override
    public void turnOffCar(){
        System.out.println("turn off the manual car");
    }
    
    @Override
    public String getCarType(){
        return this.carType;
    }
}
class AutomaticCar implements Car{

    private String carType = "Automatic";

    @Override
    public void turnOnCar(){
        System.out.println("turn on the Automatic car");
    }

    @Override
    public void turnOffCar(){
        System.out.println("turn off the Automatic car");
    }

    @Override
    public String getCarType(){
        return this.carType;
    }
}

class CarTest{
    public static void main(String[] args){
        Car car1 = new ManualCar();
        Car car2 = new AutomaticCar();

        car1.turnOnCar();
        car1.turnOffCar();
        System.out.println(car1.getCarType());

        car2.turnOnCar();
        car2.turnOnCar();
        System.out.println(car2.getCarType());
    }
}