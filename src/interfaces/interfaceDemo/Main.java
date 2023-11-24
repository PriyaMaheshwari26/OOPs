package interfaces.interfaceDemo;

public class Main {
    public static void main(String[] args) {
//        Engine car=new Car(); //no error
        Car car=new Car();

        car.start();
        car.stop();
        car.acc();
        car.brake();
        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.startMusic();

    }
}
