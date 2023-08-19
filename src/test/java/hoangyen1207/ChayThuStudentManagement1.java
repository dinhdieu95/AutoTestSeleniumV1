package hoangyen1207;

import java.util.*;

class Student1 {
    private int id;
    private String name;
    private double score;

    public Student1(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

class StudentManagement1 {
    private TreeMap<Double, List<Student1>> studentMap;

    public StudentManagement1() {
        studentMap = new TreeMap<>(Collections.reverseOrder());
    }

    public void addStudent(Student1 student1) {
        double score = student1.getScore();
        List<Student1> student1List = studentMap.getOrDefault(score, new ArrayList<>());
        student1List.add(student1);
        studentMap.put(score, student1List);
    }

    public void removeStudent(int studentId) {
        for (Map.Entry<Double, List<Student1>> entry : studentMap.entrySet()) {
            List<Student1> student1List = entry.getValue();
            for (int i = 0; i < student1List.size(); i++) {
                if (student1List.get(i).getId() == studentId) {
                    student1List.remove(i);
                    if (student1List.isEmpty()) {
                        studentMap.remove(entry.getKey());
                    }
                    return;
                }
            }
        }
    }

    public Student1 getStudentById(int studentId) {
        for (Map.Entry<Double, List<Student1>> entry : studentMap.entrySet()) {
            List<Student1> student1List = entry.getValue();
            for (Student1 student1 : student1List) {
                if (student1.getId() == studentId) {
                    return student1;
                }
            }
        }
        return null;
    }

    public List<Student1> getAllStudents() {
        List<Student1> allStudent1s = new ArrayList<>();
        for (List<Student1> student1List : studentMap.values()) {
            allStudent1s.addAll(student1List);
        }
        return allStudent1s;
    }
}

public class ChayThuStudentManagement1 {
    public static void main(String[] args) {
        StudentManagement1 studentManagement1 = new StudentManagement1();

        Student1 student1 = new Student1(1, "John Doe", 8.5);
        studentManagement1.addStudent(student1);

        Student1 student12 = new Student1(2, "Jane Smith", 9.2);
        studentManagement1.addStudent(student12);

        Student1 student13 = new Student1(3, "Alice Johnson", 7.8);
        studentManagement1.addStudent(student13);

        System.out.println("Danh sách sinh viên theo thứ tự điểm số từ cao đến thấp:");
        List<Student1> student1List = studentManagement1.getAllStudents();
        for (Student1 student : student1List) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Score: " + student.getScore());
            System.out.println();
        }


        int studentIdToRemove = 2;
        studentManagement1.removeStudent(studentIdToRemove);
        System.out.println("Sinh viên có ID " + studentIdToRemove + " đã được xóa.");


        System.out.println("Danh sách sinh viên sau khi xóa:");
        student1List = studentManagement1.getAllStudents();
        for (Student1 student : student1List) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Score: " + student.getScore());
            System.out.println();
        }

        int studentIdToFind = 1;
        Student1 foundStudent1 = studentManagement1.getStudentById(studentIdToFind);
        if (foundStudent1 != null) {
            System.out.println("Thông tin sinh viên có ID " + studentIdToFind + ":");
            System.out.println("ID: " + foundStudent1.getId());
            System.out.println("Name: " + foundStudent1.getName());
            System.out.println("Score: " + foundStudent1.getScore());
            System.out.println();
        } else {
            System.out.println("Không tìm thấy sinh viên có ID " + studentIdToFind);
        }
    }
}

