public class PhoneTest {
    public static void main(String[] args) {

        Phone iphone = new Phone();

        // Make three phone calls.
        System.out.println(iphone.call());
        System.out.println(iphone.call());
        System.out.println(iphone.call());

        // Play a game twice.
        System.out.println(iphone.playGame());
        System.out.println(iphone.playGame());
        // Charge the phone.
        System.out.println(iphone.charge());

        // Ninjas Bonus 1:
        iphone.criticalBatterry();
    }
}
