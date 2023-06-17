package hoangyen;

public class bai3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int maxNumber = numbers[0];
        for(int i =1; i < numbers.length; i++){
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("The maximum number is:" + maxNumber);
    }

}
