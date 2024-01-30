package documents;

import Exeptions.SequenseAbcException;
import Exeptions.FinishNumberDoc1a2bException;
import Exeptions.Start555Exception;

public class DocumentValidator {
    public static void validateDocumentNumber(String docNumber) throws SequenseAbcException, Start555Exception, FinishNumberDoc1a2bException {
        checkContainsAbc(docNumber);
        checkStartsWith555(docNumber);
        checkEndsWith1a2b(docNumber);
    }

    private static void checkContainsAbc(String docNumber) throws SequenseAbcException {
        if (docNumber.contains("abc")) {
            throw new SequenseAbcException("Document number contain 'abc'");
        }
    }

    private static void checkStartsWith555(String docNumber) throws Start555Exception {
        if (docNumber.startsWith("555")) {
            throw new Start555Exception("Document number start with '555'");
        }
    }

    private static void checkEndsWith1a2b(String docNumber) throws FinishNumberDoc1a2bException {
        if (docNumber.endsWith("1a2b")) {
            throw new FinishNumberDoc1a2bException("Document number end with '1a2b'");
        }
    }
}