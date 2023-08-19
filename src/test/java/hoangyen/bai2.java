package hoangyen;

public class bai2 {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};

        int[] squaredNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            squaredNumbers[i] = numbers[i] * numbers[i];
        }
        System.out.println("Squared numbers array:");
        for (int number : squaredNumbers) {
            System.out.print(number + "");
        }
    }
}
