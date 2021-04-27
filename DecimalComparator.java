public class DecimalComparator {

    //Creating a method
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        boolean value = false;
        //bringing the decimal points to the left side
        first = first * 1000;
        second = second * 1000;

        //casting double to int to compare int values with each other
        int a = (int) first;
        int b = (int) second;

        //checking if the numbers are equal
        if (a == b) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }
}
