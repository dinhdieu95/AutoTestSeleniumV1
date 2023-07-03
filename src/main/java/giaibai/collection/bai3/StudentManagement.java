package giaibai.collection.bai3;

import java.util.Map;
import java.util.TreeMap;

public class StudentManagement {
    private Map<Integer, Student> studentMap;

    public StudentManagement() {
        studentMap = new TreeMap<>((s1, s2) -> Integer.compare(studentMap.get(s2).getScore(), studentMap.get(s1).getScore()));
    }

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    public void removeStudent(int studentId) {
        studentMap.remove(studentId);
    }

    public Student getStudentById(int studentId) {
        return studentMap.get(studentId);
    }

    public Map<Integer, Student> getAllStudents() {
        return studentMap;
    }
}
