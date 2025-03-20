import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        String idNumber = JOptionPane.showInputDialog("Please enter student ID NO.: ");
        student1.setIdNumber(idNumber);

        String name = JOptionPane.showInputDialog("Please enter student name: ");
        student1.setName(name);

        String surname = JOptionPane.showInputDialog("Please enter student surname: ");
        student1.setSurname(surname);

        String creditsEarned = JOptionPane.showInputDialog("Please enter student credits earned(hourly): ");
        int creditsVal = Integer.parseInt(creditsEarned);
        student1.setCreditHoursEarned(creditsVal);

        String pointsEarned = JOptionPane.showInputDialog("Please enter student points earned: ");
        int pointsVal = Integer.parseInt(pointsEarned);
        student1.setPointsEarned(pointsVal);

        double gpa = (double) pointsVal / creditsVal;

        JOptionPane.showMessageDialog(null,
                """
                        Student Details
                        ______________________________________________________
                        """ +
                        "\nStudent ID Number: " + student1.getIdNumber() +
                        "\nStudent Name: " + student1.getName() +
                        "\nStudent Surname:" + student1.getSurname() +
                        "\nStudent Credits Earned(Hourly): " + student1.getCreditHoursEarned() +
                        "\nStudent Points Earned: " + student1.getPointsEarned() +
                        "\nStudent Grade Point Average: " + gpa
        );



    }
}