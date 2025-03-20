public class Student {
    String idNumber;
    String name;
    String surname;
    int creditHoursEarned;
    int pointsEarned;

    public Student() {

    }

    public int getCreditHoursEarned() {
        return creditHoursEarned;
    }

    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
