public class Main {
    public static void main(String[] args) {
        // Define variables below this line
        byte age = 10;
        short height = 30000;
        int distanceBetweenTwoSatellites = 1000000000;
        long distanceBetweenTwoGalaxies = 10000000000L;
        float rateOfInterest = 6f/5f;
        double rateOfHike = 456d/123d;
        char capitalA = 'A';
        boolean isPossible = true;

        printState(age, height, distanceBetweenTwoSatellites, distanceBetweenTwoGalaxies, rateOfInterest, rateOfHike, capitalA, isPossible);
    }

    public static void printState(byte age, short height, int distanceBetweenTwoSatellites, long distanceBetweenTwoGalaxies, float rateOfInterest, double rateOfHike, char capitalA, boolean isPossible) {
        // print byte variable with the next statement
        System.out.println("Age is: " + age);

        // print short variable with the next statement
        System.out.println("Height is: " + height);

        // print int variable with the next statement
        System.out.println("Distance between two satellites is: " + distanceBetweenTwoSatellites);

        // print long variable with the next statement
        System.out.println("Distance between two galaxies is: " + distanceBetweenTwoGalaxies);

        // print float variable with the next statement
        System.out.println("Rate of interest is: " + rateOfInterest);

        // print decimel variable with the next statement
        System.out.println("Rate of hike is: " + rateOfHike);

        // print char variable with the next statement
        System.out.println("CapitalA: " + capitalA);

        // print boolean variable with the next statement
        System.out.println("isPossible: " + isPossible);
    }
}