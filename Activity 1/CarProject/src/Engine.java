public class Engine {

    // boolean to check if car is running
    private boolean running = false;

    // starts the engine (sets running to true)
    public void startEngine(){
        running = true;
        System.out.println("Engine started...");
    }

    // stops the engine (sets running to false)
    public void stopEngine(){
        running = false;
        System.out.println("Engine stopped...");
    }

    // returns running boolean
    public Boolean isRunning(){
        return running;
    }

}
