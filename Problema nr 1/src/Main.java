
public class Main {

    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 85, 67};

        // Create an object of your class (replace "NotenSystem" with your class name)
        Noten ns = new Noten();

        System.out.println("Original grades: ");
        printArray(grades);

        int[] insufficient = ns.getInsufficientGrades(grades);
        System.out.println("\nInsufficient (<40): ");
        printArray(insufficient);

        double average = ns.Average(grades);
        System.out.println("\nAverage grade: " + average);

        int[] rounded = ns.Rounding(grades);
        System.out.println("\nRounded grades: ");
        printArray(rounded);

        int highest = ns.HighestGradeValue(grades);
        System.out.println("\nHighest rounded grade: " + highest);
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
