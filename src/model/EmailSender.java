package model;

public class EmailSender {

    public void send(String email, String content) {
        System.out.println("Enviando fatura para " + email + ":\n" + content);
    }
}
