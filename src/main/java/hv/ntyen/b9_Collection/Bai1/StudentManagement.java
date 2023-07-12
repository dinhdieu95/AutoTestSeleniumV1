package hv.ntyen.b9_Collection.Bai1;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> studentList;
    public StudentManagement(){studentList = new ArrayList<>();}
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(int studentId){
        for(Student student:studentList){
            if (student.getId() == studentId) {
                studentList.remove(student);
                break;
            }
        }

    }
    public Student getStudentById(int studentId){
        for(Student student:studentList){
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }
    public List<Student> getAllStudents(){
        return studentList;
    }
    public double getAverageAge(){
        int sumAge=0;
        for (Student student:studentList){
            sumAge +=student.getAge();
        }
        return (double)sumAge/studentList.size();
    }
}
