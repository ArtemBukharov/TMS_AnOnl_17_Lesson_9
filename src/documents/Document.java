package documents;

import Exeptions.SequenseAbcException;
import Exeptions.FinishNumberDoc1a2bException;
import Exeptions.Start555Exception;

import java.util.Date;

public class Document {
    protected String docNumber;
    protected Date docDate;

    public Document(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    public void displayInfo() {};

    public String getDocNumber() {
        return docNumber;
    }

    public void validateDocumentNumber() throws SequenseAbcException, Start555Exception, FinishNumberDoc1a2bException {
        DocumentValidator.validateDocumentNumber(docNumber);
    }
}
