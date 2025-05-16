
public class ISP_01 {

    /*
     * TASK:
     * This SimplePrinter is not a multi functional printer but a very
     * simple one.
     * Please fix this to obey the ISP (Interface Segregation Principle)!
     */


    // Separated interfaces for specific functionalities
    public static interface Printer {
        void printDocument();
    }

    public static interface Scanner {
        void scanDocument();
    }

    public static interface Fax {
        void faxDocument();
    }


    // Implementation of only Printer interface
    public static class SimplePrinter implements Printer {
        @Override
        public void printDocument() {
            System.out.println("Sending document to the printer ...");
        }
    }


    // Implementations of all interfaces since this is multi-functional printer
    public static class MultiFunctionPrinter implements Printer, Scanner, Fax{
         @Override
        public void printDocument() {
            System.out.println("Sending document to the printer ...");
        }

        @Override
        public void scanDocument() {
            System.out.println("Scanning document to the scanner ...");
        }

        @Override
        public void faxDocument() {
            System.out.println("Sending document to the fax machine...");
        }
    }

    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.printDocument();

        MultiFunctionPrinter multiFunctionPrinter=new MultiFunctionPrinter();
        multiFunctionPrinter.printDocument();
        multiFunctionPrinter.scanDocument();
        multiFunctionPrinter.faxDocument();
    }
}
