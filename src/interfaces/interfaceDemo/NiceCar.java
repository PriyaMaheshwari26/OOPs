package interfaces.interfaceDemo;

public class NiceCar {
    private Engine engine;
    private Media media;
    public NiceCar(){
        this.engine=new PowerEngine();
        this.media=new CDPlayer();
    }
    public void start(){
//        System.out.println("Car is starting");
        engine.start();
    }
    public void startMusic(){
//        System.out.println("Music is starting");
        media.start();
    }
}
