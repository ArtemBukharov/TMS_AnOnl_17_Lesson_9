package documents;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Document docNumber = new Document ("543000C1a2b", new Date());
        register.saveDoc(docNumber);
    }
}