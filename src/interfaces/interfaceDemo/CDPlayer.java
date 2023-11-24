package interfaces.interfaceDemo;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Starting Media");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Media");
    }
}
