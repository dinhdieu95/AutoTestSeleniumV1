package learnjava.giaibai.b6.bai11;

public class CollegeStudent implements Student {

    @Override

    public void study() {

        System.out.println("College student is studying for assignments.");

    }

    @Override

    public void takeExam() {

        System.out.println("College student is taking exams.");

    }

}