package dependencias;

public class App {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        MessagePrinter printer = new MessagePrinter(messageService);
        printer.printMessage();
    }
}
