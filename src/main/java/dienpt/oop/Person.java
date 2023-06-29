package dienpt.oop;

public class Person {

    private String name ;
    private int age ;
    private String gender ;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayInfo(){
        System.out.println("Tên là " + this.name + "Tuổi " + this.age + " Giới tính" + this.gender );
    }

    public static void main(String[] args) {
         //Khong truyen  tham so --Khoi taoj contructor khong tham so
        Person coca = new Person();
        coca.setName("Coca");
        coca.setAge(2);
        coca.setGender("Nam");
        coca.displayInfo();

        //Truyen  tham so --Khoi taoj contructor co tham so
        Person dien  = new Person("Dien",28,"Nu");//Khoi tao class person
        dien.displayInfo(); //Goi ham trong person

    }
}
