public class WeightConverter {
    public static double convertKgsToPounds(double kgs) {
        double pounds = kgs * 2.20462;
        return pounds;
    }

    public static void main(String[] args) {
        double weightInKgs = 5.5;
        double weightInPounds = convertKgsToPounds(weightInKgs);
        System.out.println(weightInKgs + " kgs is equal to " + Math.round(weightInPounds) + " pounds.");
    }
}
