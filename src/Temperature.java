public class Temperature
{
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = rounder(high);
        lowTemp = rounder(low);

        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }
    }

    // 1. Add your two static methods here:
    public static double convertCtoF(double c) {
        return (c * (9.0/5.0)) + 32;
    }
    public static double convertFtoC(double f) {
        return (f - 32) * (5.0/9.0);
    }

    // 2. Add your two instance methods here:
    public void changeToC() {
        if (!tempScale.equalsIgnoreCase("C")) {
            tempScale = "C";
            highTemp = rounder(convertFtoC(highTemp));
            lowTemp = rounder(convertFtoC(lowTemp));
        }
    }
    public void changeToF() {
        if (!tempScale.equalsIgnoreCase("F")) {
            tempScale = "F";
            highTemp = rounder(convertCtoF(highTemp));
            lowTemp = rounder(convertCtoF(lowTemp));
        }
    }


    // 3. Add your private static helper rounding "utility" method here:
    private static double rounder(double temp) {
        return Math.round(temp * 10.0) / 10.0;
    }

    // 4. Complete the toString method below (using your static helper method)
    //    so it returns a String that prints like:

    //    High Temperature: 67.4 F (or C)
    //    Low Temperature: 58.3 F (or C)

    public String toString()
    {
        return "High Temperature: " + highTemp + " " + tempScale + "\nLow Temperature: " + lowTemp + " " + tempScale;
    }
}
