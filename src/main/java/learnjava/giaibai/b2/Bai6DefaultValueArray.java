package learnjava.giaibai.b2;

public class Bai6DefaultValueArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
// index = 0 , 1 , 2 ,3  4

        numbers[1] = 6;
//        int[] so = {1,2,3,4,5};

        System.out.println("Giá trị mặc định của mảng số nguyên:");

        int i = 0;
        System.out.println(numbers.length);

        while (i < numbers.length) {
            System.out.println(numbers[i]); // lần 1  numbers[0]  lần 2 number [1] in ra 6  lần 3 in ra NUMBERS[2]
            i++; // i tăng lên 1 số i  = 1 , lần 2 tăng i +1  => i = 2  => tăng i => i =5
        }
//        =>  dừng vòng lăp khi không đáp ứng điều kiện
    }

}
