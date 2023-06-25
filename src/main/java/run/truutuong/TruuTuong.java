package run.truutuong;

public class TruuTuong {
    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.print();

        Scanner scanner = new Scanner();

        scanner.scan();

        FaxMachine faxMachine = new FaxMachine();

        faxMachine.print();

        faxMachine.scan();

        faxMachine.fax();

    }
}
