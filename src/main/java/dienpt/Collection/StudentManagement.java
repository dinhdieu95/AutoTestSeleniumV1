package dienpt.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentManagement {

    private List<Student> listStudent = new ArrayList<>();
    private TreeMap<Integer, Student> listStudent1 = new TreeMap<>();
    public void addStudent(Student student) {
        listStudent.add(student);
        listStudent1.put(student.getId(), student);
    }

    public void removeStudent(int studentId) {
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId() == studentId) {
                listStudent.remove(listStudent.get(i));
                System.out.println("Xoa thanh cong id = " + studentId);
            }
        }
        listStudent1.remove(1);
    }

    public void getStudentById(int studentId) {
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId() == studentId) {
                System.out.println("Student: " + listStudent.get(i).toString());
            }
        }
        listStudent1.get(2);

    }
    public void getAllStudents(){
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("Student: " + listStudent.get(i).toString());
        }
        for (Map.Entry<Integer, Student> entry : listStudent1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void getAverageAge() {
        int sumAge = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            sumAge = sumAge + listStudent.get(i).getAge();
        }
        System.out.println("Average Age = " + (double) sumAge / listStudent.size());
    }

    public static void main(String[] args) {
        StudentManagement studentManagement1 = new StudentManagement();
        StudentManagement studentManagement2 = new StudentManagement();
        Student dien = new Student(1, "Dien", 20, 9);
        Student coca = new Student(2, "Coca", 2, 10);
        Student mon = new Student(3, "Mon", 25, 9.4);
        Student vietanh = new Student(4, "vietanh", 4, 9.9);

        studentManagement1.addStudent(dien);
        studentManagement1.addStudent(coca);
        studentManagement1.addStudent(mon);
        studentManagement1.addStudent(vietanh);

        studentManagement2.addStudent(dien);
        studentManagement2.addStudent(coca);
        studentManagement2.addStudent(mon);
        studentManagement2.addStudent(vietanh);

        System.out.println("Get tat ca student:");
        studentManagement1.getAllStudents();
        studentManagement2.getAllStudents();

        System.out.println("Xoa student id = 1");
        studentManagement1.removeStudent(1);
        studentManagement2.removeStudent(1);

        System.out.println("Get student id = 2");
        studentManagement1.getStudentById(2);
        studentManagement2.getStudentById(2);

        System.out.println("Tuoi trung binh");
        studentManagement1.getAverageAge();

    }
}
