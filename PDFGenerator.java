
public class PDFGenerator extends DocumentGenerator {

    @Override
    public void addHeader() {
        System.out.println("Generating PDF Header");
    }

    @Override
    public void addBody() {
        System.out.println("Generating PDF Body");
    }

    @Override
    public void addFooter() {
        System.out.println("Generating PDF Footer");
    }
}
