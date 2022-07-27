public class BarkingDog {

    public static boolean shouldWakeUp(boolean Barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || hourOfDay == 22 || hourOfDay == 22) {
            System.out.println("false, " + hourOfDay);
            return false;
        }
        System.out.println("true, " + hourOfDay);
        return Barking;

    }
}
