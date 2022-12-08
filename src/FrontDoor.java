public class FrontDoor {
    public static void main(String[] args)
    {
        double miles1 = 13.85;
        double km1 = 40;
        double miles2 = 26.42;
        double km2 = 3.5;
        double miles3 = 5;
        double km3 = 20.50;
        double miles4 = 0;
        double km4 = 0;
        convertor(miles1,km1,miles2,km2,miles3,km3,miles4,km4);

        String title = "welcome to the marathon!";
        extender(title);

        title = "It's TIME for THE 5k!";
        extender(title);

        title = "runners, take your marks...";
        extender(title);

        title = "2 MILES TO GO!";
        extender(title);

        title = "water break in 0.5 miles";
        extender(title);

    }
    public static void convertor (double miles, double kms, double miles2, double kms2, double miles3, double kms3, double miles4, double kms4) {
        System.out.println(RaceUtility.milesToKm(miles));
        System.out.println(RaceUtility.kmToMiles(kms));
        System.out.println(RaceUtility.milesToKm(miles2));
        System.out.println(RaceUtility.kmToMiles(kms2));
        System.out.println(RaceUtility.milesToKm(miles3));
        System.out.println(RaceUtility.kmToMiles(kms3));
        System.out.println(RaceUtility.milesToKm(miles4));
        System.out.println(RaceUtility.kmToMiles(kms4));
    }

    public static void extender (String text) {
        System.out.println(RaceUtility.makeProper(text));
    }
}
