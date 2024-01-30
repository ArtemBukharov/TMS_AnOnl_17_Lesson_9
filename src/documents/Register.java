package documents;

import Exeptions.SequenseAbcException;
import Exeptions.FinishNumberDoc1a2bException;
import Exeptions.Start555Exception;


public class Register {
    private Document[] documents;

    void saveDoc(Document document) {
        try {
            document.validateDocumentNumber();
        } catch (Start555Exception | FinishNumberDoc1a2bException | SequenseAbcException exception) {
            System.err.println("Неккоректное имя документа. Нельзя сохранить в регистр" + exception.getClass().getName());
            System.err.println("Ошибка: " + exception.getMessage());
        }
    }
}

