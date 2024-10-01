import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //  number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        //  user input
        int marks[] = new int[numberOfSubjects];
        float total = 0, avg, gpa;

        // Collect marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        scanner.close();

        // Calculate average percentage
        avg = total / numberOfSubjects;

        // Determine GPA and Grade
        if (avg >= 80) {
            gpa = 4.00f;
        } else if (avg >= 75) {
            gpa = 3.75f;
        } else if (avg >= 70) {
            gpa = 3.50f;
        } else if (avg >= 65) {
            gpa = 3.25f;
        } else if (avg >= 60) {
            gpa = 3.00f;
        } else if (avg >= 55) {
            gpa = 2.75f;
        } else if (avg >= 50) {
            gpa = 2.50f;
        } else if (avg >= 45) {
            gpa = 2.25f;
        } else if (avg >= 40) {
            gpa = 2.00f;
        } else {
            gpa = 0.00f;
        }

        // Determine Letter Grade
        String grade;
        if (avg >= 80) {
            grade = "A+";
        } else if (avg >= 75) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "A-";
        } else if (avg >= 65) {
            grade = "B+";
        } else if (avg >= 60) {
            grade = "B";
        } else if (avg >= 55) {
            grade = "B-";
        } else if (avg >= 50) {
            grade = "C+";
        } else if (avg >= 45) {
            grade = "C";
        } else if (avg >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output results
        System.out.printf("Average Percentage: %.2f%%\n", avg);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("Letter Grade: " + grade);
    }
}
