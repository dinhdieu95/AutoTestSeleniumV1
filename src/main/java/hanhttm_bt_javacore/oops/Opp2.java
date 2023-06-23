package hanhttm_bt_javacore.oops;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Opp2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 7);
        System.out.println("Area: " + rec.getArea());
        rec.setHeight(10);
        rec.setWidth(10);
        System.out.println("Area 2: " + rec.getArea());
    }
}
