
public class Main {
   public static void main(String[] args) {
      DocumentGenerator pdfGenerator = new PDFGenerator();
      pdfGenerator.generateDocument();

      System.out.println();

      DocumentGenerator htmlGenerator = new HTMLGenerator();
      htmlGenerator.generateDocument();
   }
}
