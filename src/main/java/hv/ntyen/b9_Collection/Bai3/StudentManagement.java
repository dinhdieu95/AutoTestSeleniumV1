package hv.ntyen.b9_Collection.Bai3;

import java.util.Map;
import java.util.TreeMap;

import static java.lang.Integer.compare;

public class StudentManagement {
    private Map<Integer, Student> studentMap;
    public StudentManagement(){
        studentMap = new TreeMap<>((s1, s2) -> compare(studentMap.get(s2).getScore(), studentMap.get(s1).getScore()));
    }
    public void addStudent(Student student){studentMap.put(student.getId(), student);}
    public Map<Integer, Student> getAllStudents() {
        return studentMap;
    }
    public Student getStudentById(int studentId) {
        return studentMap.get(studentId);
    }
    public void removeStudent(int studentId) {
        studentMap.remove(studentId);
    }

}
