package learnjava.run.truutuong;

public class FaxMachine implements Faxable {

    @Override

    public void print() {

        System.out.println("Printing...");

    }

    @Override

    public void scan() {

        System.out.println("Scanning...");

    }

    @Override

    public void fax() {

        System.out.println("Faxing...");

    }

}