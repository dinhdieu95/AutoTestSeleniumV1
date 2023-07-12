package hv.ntyen.b9_Collection.Bai3;

public class Student {
    private int id, score;
    private String name;
    public Student(int id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public int getScore(){return score;}
    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setScore(int age){this.score = score;}
}
