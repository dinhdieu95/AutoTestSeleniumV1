package hoangyen1207;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class StudentManagement {
    private List<Student1> student1List;

    public StudentManagement() {
        student1List = new ArrayList<>();
    }

    public void addStudent(Student1 student1) {
        student1List.add(student1);
    }

    public void removeStudent(int studentId) {
        for (int i = 0; i < student1List.size(); i++) {
            if (student1List.get(i).getId() == studentId) {
                student1List.remove(i);
                break;
            }
        }
    }

    public Student1 getStudentById(int studentId) {
        for (Student1 student1 : student1List) {
            if (student1.getId() == studentId) {
                return student1;
            }
        }
        return null;
    }

    public List<Student1> getAllStudents() {
        return student1List;
    }

    public double getAverageAge() {
        if (student1List.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Student1 student1 : student1List) {
            sum += student1.getAge();
        }

        return (double) sum / student1List.size();
    }
}

public class ChayThuStudentManagement {
    public static void main(String[] args) {
        StudentManagement1 studentManagement1 = new StudentManagement1();

        Student1 student1 = new Student1(1, "John Doe", 20);
        studentManagement1.addStudent(student1);

        Student1 student12 = new Student1(2, "Jane Smith", 22);
        studentManagement1.addStudent(student12);

        Student1 student13 = new Student1(3, "Alice Johnson", 21);
        studentManagement1.addStudent(student13);

        System.out.println("Danh sách sinh viên:");
        List<Student1> student1List = studentManagement1.getAllStudents();
        for (Student1 student : student1List) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
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
            System.out.println("Age: " + student.getAge());
            System.out.println();
        }

        int studentIdToFind = 1;
        Student1 foundStudent1 = studentManagement1.getStudentById(studentIdToFind);
        if (foundStudent1 != null) {
            System.out.println("Thông tin sinh viên có ID " + studentIdToFind + ":");
            System.out.println("ID: " + foundStudent1.getId());
            System.out.println("Name: " + foundStudent1.getName());
            System.out.println("Age: " + foundStudent1.getAge());
            System.out.println();
        } else {
            System.out.println("Không tìm thấy sinh viên có ID " + studentIdToFind);
        }


        double averageAge = studentManagement1.getAverageAge();
        System.out.println("Tuổi trung bình của tất cả sinh viên: " + averageAge);
    }
}

