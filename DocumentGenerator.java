
public abstract class DocumentGenerator {

    // The template method
    public final void generateDocument() {
        addHeader();
        addBody();
        addFooter();
    }

    public abstract void addHeader();

    public abstract void addBody();

    public abstract void addFooter();
}
