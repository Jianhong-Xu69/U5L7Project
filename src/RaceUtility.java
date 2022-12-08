public class RaceUtility {
    // write your utility class here!
    public static double milesToKm (double m) {
        return m * 1.609344;
    }
    public static double kmToMiles (double km) {
        return km * 0.62137;
    }
    public static String makeProper (String str) {
        String temp = "";
        boolean cap = true;
        for (int i = 0; i < str.length(); i++) {
            if (cap) {
                temp += String.valueOf(str.charAt(i)).toUpperCase();
                cap = false;
            } else {
                temp += String.valueOf(str.charAt(i)).toLowerCase();
            }
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(" ")){
                cap = true;
            }
        }
        return temp;
    }
}
