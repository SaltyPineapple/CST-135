public class Car {

    // Car fields
    private Tire frontLeft = new Tire("Front Left", 32);
    private Tire frontRight = new Tire("Front Right", 32);
    private Tire backLeft = new Tire("Back Left", 32);
    private Tire backRight = new Tire("Back Right", 32);
    private Engine engine = new Engine();

    private int Speed;

    // Default Constructor

    public Car() {

    }

    // Starts the car if all tires are at 32 psi and the engine is stopped
    public void startCar(){
        if(frontLeft.getPSI() == 32 && frontRight.getPSI() == 32 && backLeft.getPSI() == 32 && backRight.getPSI() == 32){
            System.out.printf("%s Tire has %d PSI\n", frontLeft.getPosition(), frontLeft.getPSI());
            System.out.printf("%s Tire has %d PSI\n", frontRight.getPosition(), frontRight.getPSI());
            System.out.printf("%s Tire has %d PSI\n", backLeft.getPosition(), backLeft.getPSI());
            System.out.printf("%s Tire has %d PSI\n", backRight.getPosition(), backRight.getPSI());

            if(!engine.isRunning()){
                engine.startEngine();
                setSpeed(35);
            }
        }
    }
    // Stops the car if the engine is running

    public void stopCar(){
        if(engine.isRunning() && getSpeed() == 0){
            engine.stopEngine();
        }
    }

    // Getter and setter for car speed
    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    // Main Method
    public static void main(String[] args){
        // Creates new car object
        Car car = new Car();

        // Call Car methods
        car.startCar();
        System.out.printf("The car is going %d mph\n",car.getSpeed());
        car.setSpeed(0);
        System.out.printf("The car is going %d mph\n",car.getSpeed());
        car.stopCar();

        car.startCar();
        System.out.printf("The car is going %d mph\n",car.getSpeed());

    }
}
