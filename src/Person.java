import java.time.Period;
import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}
class Student extends Person{
    private int[] testScores;
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    char calculate() {
        int i, sum = 0, avg = 0;
        char grade;
        for (i = 0; i < testScores.length; i++) {
            sum += testScores[i];
            avg = sum / testScores.length;
        }
            if (avg <= 100 && avg >= 90) {
                grade = 'O';
            }else if (avg < 90 && avg >= 80) {
                grade = 'E';
            }else if (avg < 80 && avg >= 70) {
                grade = 'A';
            }else if (avg < 70 && avg >= 55) {
                grade = 'P';
            }else if (avg < 55 && avg >= 40) {
                grade = 'D';
            }else {
                grade = 'T';
            }
        return grade;
    }
}
class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scanner.nextInt();
        }
        scanner.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

