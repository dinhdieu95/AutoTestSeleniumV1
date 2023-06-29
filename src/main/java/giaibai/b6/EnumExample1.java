package giaibai.b6;

import static giaibai.b6.EnumExample1.Season.SPRING;

public class EnumExample1 {
    // define enum
    enum Season {
        SPRING("Spring"), SUMMER("Summer"), FALL ("Fall"), WINTER("Winter");
        private String value;


        Season(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);

        System.out.println(SPRING);

        Season season1 = Season.FALL;

        System.out.println(season.getValue()); 
    }
}
