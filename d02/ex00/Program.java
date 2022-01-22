package d02.ex00;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Program {

    private static final String SIGNATURES =
        "C:/Users/MagistrDev/IdeaProjects/Piscine Java/src/d02/ex00/signatures.txt";
    private static final String RESULT = "./result.txt";

    public static void main(String[] args) throws IOException {
        SignatureList signList = new SignatureList(SIGNATURES);

        Scanner scanner = new Scanner(System.in);
        String inpText = scanner.nextLine();
        byte[] readBytes = new byte[signList.getMaxValueSize()];
        OutputStream result = new FileOutputStream(RESULT);

        while (!inpText.equals("42")) {
            System.out.println("PROCESSED");
            InputStream checkFile = new FileInputStream(inpText);
            checkFile.read(readBytes);
            checkFile.close();
            Signature sub = signList.getSignByValue(readBytes);
            if (sub != null) {
                result.write((sub.getKey() + "\n").getBytes(StandardCharsets.UTF_8));
            }
            inpText = scanner.nextLine();
        }
        result.close();
    }
}
