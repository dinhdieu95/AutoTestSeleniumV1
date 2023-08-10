package learnjava.run.truutuong;

public class TruuTuong {
    public static void main(String[] args) {

        Printer printer = new Printer();
        System.out.println("Implement của lớp printer ");
        printer.print();

        Scanner scanner = new Scanner();

        System.out.println("Implement của lớp scanner  ");
        scanner.scan();

        FaxMachine faxMachine = new FaxMachine();

        System.out.println("Implement của lớp FaxMachine ");
        faxMachine.print();

        faxMachine.scan();

        faxMachine.fax();

    }
}
