public class Phone extends Device {

    // CONSTRUCTOR
    public Phone() {
        // super.battery = 100;
    }

    // OTHER METHOD
    public String call() {
        super.battery -= 5;
        return "phone call .... remaining battery " + super.displayBattery();
    }

    public String playGame() {
        // Ninjas Bonus 2 :
        if (super.battery < 25) {
            return "battery remainning 25 % can't play game!!";
        } else {
            super.battery -= 20;
            return "You play a game..... remaining battery " + super.displayBattery();
        }
    }

    public String charge() {
        super.battery += 50;
        return "phone charge .... remaining battery " + super.displayBattery();
    }

    // NINJAS BONUS 1:
    public void criticalBatterry() {
        if (super.battery < 10) {
            System.out.println("battery critical 10%");
        }
    }

}
