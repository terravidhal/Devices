public class Device {
    // MEMBER VARIABLES
    protected int battery;

    // CONSTRUCTOR
    public Device() {
        this.battery = 100;
    }

    // OVERLOAD CONSTRUCTOR

    // GETTERS
    public int getBattery() {
        return this.battery;
    }
    // SETTERS
    /*
     * public int setBattery(int battery){ // int si la fonction 'return'
     * return this.battery = battery;
     * }
     */

    public void setBattery(int battery) { // 'void' car la methode ne retourn rien
        this.battery = battery;
    }

    // OTHER METHOD
    public int displayBattery() {
        return this.getBattery();
    }

}