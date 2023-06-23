package hanhttm_bt_javacore.oops;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Cho trước lớp Student có các thuộc tính: name: String, age: int, id: String, courses: ArrayList<String>.
// Viết các getter, setter và constructor cho lớp Student.
public class Oop3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("toan");
        arrayList.add("ly");
        Student student = new Student("1a","anh",11,arrayList);
        System.out.println("thong tin sv " + student.getName() + " hoc " + student.getCourse().get(0) +
                " va " + student.getCourse().get(1));

    }
}
