package hanhttm_bt_javacore.collection;

import java.util.Map;
import java.util.TreeMap;

public class StudentMap {
    private Map<Integer,Student> studentMap;

    public StudentMap() {
      studentMap=new TreeMap<>((s1,s2)-> Integer.compare(studentMap.get(s2).getAge(),studentMap.get(s1).getAge()));
    }
    public void addStudent(Student student){
        studentMap.put(student.getId(),student);
    }
    public void removeStudent(int studentID){
        studentMap.remove(studentID);
    }
    public Student getStudentById(int studentId){
        return studentMap.get(studentId);
    }

    public Map<Integer,Student> getAllStudents(){
        return studentMap;
    }
    public void printStudent(Student student){
        System.out.println("id: " + student.getId() + "\tname: " +student.getName() + "\tAge: " +student.getAge());
    }
}
