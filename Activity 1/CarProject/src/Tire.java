public class Tire {
    private String Position;
    private int PSI;

    // Non-Default Constructor
    public Tire(String position, int PSI) {
        Position = position;
        this.PSI = PSI;
    }

    // Getters and Setters for Tire Fields

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getPSI() {
        return PSI;
    }

    public void setPSI(int PSI) {
        this.PSI = PSI;
    }
}
