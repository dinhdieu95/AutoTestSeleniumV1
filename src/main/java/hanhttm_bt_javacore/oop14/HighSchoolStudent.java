package hanhttm_bt_javacore.oop14;

public class HighSchoolStudent implements Student {
    @Override
    public void displayInfo() {
        System.out.println("high school");
    }
        public static void main(String[] args) {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.displayInfo();
    }
}
