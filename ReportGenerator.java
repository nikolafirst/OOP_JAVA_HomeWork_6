import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {

    public static void generatePDFReport(Document document) {
        // код для формирования PDF-файла
        // использовать подходящую библиотеку для работы с PDF
    }

    public static void generateJSONReport(Document document) {
        // код для формирования JSON-файла
        // использовать подходящую библиотеку для работы с JSON
    }

    public static void generateXMLReport(Document document) {
        // код для формирования XML-файла
        // использовать подходящую библиотеку для работы с XML
    }

    public static void main(String[] args) {
        // Пример

        Document document = new Document();
        document.setTitle("Отчет о продажах");
        document.addField("Дата", "01.01.2020");
        document.addField("Продукт", "Телефон");
        document.addField("Количество", "10");
        document.addField("Сумма", "5000");

        generatePDFReport(document);
        generateJSONReport(document);
        generateXMLReport(document);
    }
}
