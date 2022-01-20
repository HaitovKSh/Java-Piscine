package d02.ex00;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class SignatureParser {

    private String fileName;
    private File signatureFile;
    private Map<String, Byte[]> signatureList;

    public SignatureParser(String signatureFileName) {
        fileName = signatureFileName;
        signatureFile = new File(signatureFileName);

    }
    public SignatureParser(File signature) throws FileNotFoundException {
        signatureFile = signature;
        fileName = signature.getName();
        ParseFile();

    }

    public void ParseFile() throws FileNotFoundException {
        Scanner inp = new Scanner(signatureFile);
        while (inp.hasNextLine()) {
            String signLine = inp.nextLine();
            String[] subParse = signLine.split(",");
            String[] signature = subParse[1].split(" ");
        }
    }
//    public Byte strToByte(String str) {
//        char[] ret = str.toLowerCase().trim().toCharArray();
//
//        return;
//    }
}
