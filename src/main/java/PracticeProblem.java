public class PracticeProblem {

    public static void main(String args[]) {
    }   
}

    final class CampbellClass {
    private CampbellClass() {
     throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
    
    // 1. convertString methods
    public static String convertString(int value) {
        return String.valueOf(value);
    }
    
    public static String convertString(double value) {
        return String.valueOf(value);
    }
    
    public static String convertString(char value) {
        return String.valueOf(value);
    }
    
    public static String convertString(boolean value) {
        return String.valueOf(value);
    }
    
    // 2. convertMetersToCenti methods
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }
    
    public static double convertMetersToCenti(double meters) {
        return meters * 100.0;
    }
    
    // 3. removeNonAlpha methods
    public static String removeNonAlpha(String input) {
        if (input == null) {
            return "";
        }
        return input.replaceAll("[^a-zA-Z]", "");
    }
    
    public static String removeNonAlpha(String input, boolean toUpperCase) {
        if (input == null) {
            return "";
        }
        String result = input.replaceAll("[^a-zA-Z]", "");
        return toUpperCase ? result.toUpperCase() : result.toLowerCase();
    }
}

