package NgocThDe1;

import java.util.*;

public class Unity {
    ArrayList <Animal> animals = new ArrayList<>();
    public void addAnimal() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng động vậy");
        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhập thông tin loại động vật " + (i + 1) + "\n");
            System.out.println("Tên đông vật: ");
            String name = sc.next();
            System.out.println("Tuổi: ");
            int age = sc.nextInt();
            System.out.println("Nguồn gốc: ");
            String origin = sc.next();
            System.out.println("Loại động vật (1: Voi, 2: Hổ, 3: Sư tử)");
            int type = sc.nextInt();
            if (type == 1) {
                animals.add(new Elephant(name, age, origin));
            } else if (type == 2) {
                animals.add(new Tiger(name, age, origin));
            } else if (type == 3) {
                animals.add(new Lion(name, age, origin));
            } else {
                System.out.println("Bạn nhập sai loại rồi");
            }
        }


    }
    public void print(){
        for (Animal animal: animals){
            System.out.println("Tên động vật: " + animal.getName() + " Tuổi đông vật: "+ animal.getAge() + " Nguồn gốc: " + animal.getOrigin());
        }
    }

    public void sort(){
        System.out.println("Động vật được sắp xếp theo tuổi:  ");
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
        // show list students
        print();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check = true;
        do {
            System.out.println("1. Nhập thông tin động vật \n" + "2. Hiển thị ra màn hình danh sách động vật \n" + "3. Sắp xếp theo tuổi \n"
                    + "4. thoát\n" );
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    check = false;
                default:
                    System.out.println("Cảm ơn bạn nha");
                    check = false;
                    break;
            }
        }while (check);
    }
}
