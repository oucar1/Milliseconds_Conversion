public class TimeConversion {
    // Method to convert milliseconds to hours, minutes, and seconds
    public static String convertMilliseconds(long milliseconds) {
        // Constants
        final long MILLISECONDS_IN_SECOND = 1000;
        final long SECONDS_IN_MINUTE = 60;
        final long MINUTES_IN_HOUR = 60;

        // Total Seconds
        long totalSeconds = milliseconds /  MILLISECONDS_IN_SECOND;

        // Calculate hours
        long hours = totalSeconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR);

        // Calculate minutes
        long minutes = (totalSeconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)) / SECONDS_IN_MINUTE;

        // Calculate seconds
        long seconds = totalSeconds % SECONDS_IN_MINUTE;

        // Return the result as a String
        return (hours + ":" + minutes + ":" + seconds);
    }
}
