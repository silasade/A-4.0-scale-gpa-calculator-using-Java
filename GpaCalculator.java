import java.util.HashMap;
import java.util.Scanner;

public class GpaCalculator {
    public static void main(String[] args) {
        HashMap<String, Float> result = new HashMap<>();
        String name;
        float score;
        int units;
        int gradePoint = 0;
        int totalUnits = 0;
        int numOFCourses;
        float gpa;
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many courses did you offer this session or semester: ");
        numOFCourses = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numOFCourses; i++) {
            System.out.printf("Enter course %d name: ", i);
            name = scanner.nextLine();
            System.out.printf("Enter your %s score: ", name);
            score = Float.parseFloat(scanner.nextLine());
            System.out.printf("How many units is %s: ", name);
            units = Integer.parseInt(scanner.nextLine());

            result.put(name, score);
            totalUnits += units;

            int gradePoints = 0;

            if (score >= 70) {
                gradePoints = units * 4;
            } else if (score >= 60 && score <= 69) {
                gradePoints = units * 3;
            } else if (score >= 50 && score <= 59) {
                gradePoints = units * 2;
            } else if (score >= 45 && score <= 49) {
                gradePoints = units * 1;
            } else {
                gradePoints = units * 0;
            }

            gradePoint += gradePoints;
        }

        gpa = (float) gradePoint / totalUnits;
        System.out.printf("GPA = %.2f%n", gpa);
    }
}
