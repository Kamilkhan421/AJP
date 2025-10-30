import java.util.Scanner;

public class SimpleGradeAndYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----- Grade Calculator -----
        System.out.println("Enter marks of 5 subjects:");

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        // if any subject is less than 40, student fails
        if (s1 < 40 || s2 < 40 || s3 < 40 || s4 < 40 || s5 < 40) {
            System.out.println("Fail");
        } else {
            double avg = (s1 + s2 + s3 + s4 + s5) / 5.0;

            System.out.println("Average = " + avg);

            if (avg >= 90) {
                System.out.println("Grade: A+");
            } else {
                if (avg >= 75) {
                    System.out.println("Grade: A");
                } else {
                    if (avg >= 60) {
                        System.out.println("Grade: B");
                    } else {
                        if (avg >= 40) {
                            System.out.println("Grade: C");
                        } else {
                            System.out.println("Fail");
                        }
                    }
                }
            }
        }

        // ----- Year Type -----
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leap Century Year");
            } else {
                System.out.println("Century Year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Ordinary Year");
            }
        }

        sc.close();
    }
}
