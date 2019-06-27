public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingSeconds;

        remainingSeconds = (60 * 60 * 24) - (currentSeconds + (currentMinutes * 60) + (currentHours * 3600));
        System.out.println(remainingSeconds + " seconds");
    }
}
