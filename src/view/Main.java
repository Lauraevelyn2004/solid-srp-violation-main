package view;

import model.EmailSender;
import model.Invoice;
import model.InvoiceFormatter;
import model.Item;

public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("Emerson Carvalho");
        invoice.addItem(new Item("Produto A", 2, 50));
        invoice.addItem(new Item("Produto B", 3, 30));

        InvoiceFormatter formatter = new InvoiceFormatter();
        String formattedInvoice = formatter.format(invoice);

        EmailSender sender = new EmailSender();
        sender.send("emerson@email.com", formattedInvoice);
    }
}
