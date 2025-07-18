
public class HTMLGenerator extends DocumentGenerator {

    @Override
    public void addHeader() {
        System.out.println("Generating HTML Header: <html><head><title>Template</title></head><body>");
    }

    @Override
    public void addBody() {
        System.out.println("Generating HTML Body: <p>This is the body.</p>");
    }

    @Override
    public void addFooter() {
        System.out.println("Generating HTML Footer: </body></html>");
    }
}
