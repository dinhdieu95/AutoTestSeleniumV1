package dienpt.StringinJava;

public class Ex8_CheckInteger {

    public static void main(String[] args) {
        String input = "12121";
        boolean numeric = input.matches("-?\\d+(\\.\\d+)?");

        if(numeric) {
            System.out.println("La so");
        } else {
            System.out.println("Ko phai la so");
        }
    }
}
