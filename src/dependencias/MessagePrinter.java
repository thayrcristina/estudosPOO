package dependencias;

public class MessagePrinter {

    private final MessageService messageService;

    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(messageService.getMessage());
    }
}
