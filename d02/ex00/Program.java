package d02.ex00;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Program {

    private static final String SIGNATURES =
            "/Users/ecelsa/Desktop/JavaPiscine/src/d02/ex00/signatures.txt";
    private static final String RESULT = "/Users/ecelsa/Desktop/JavaPiscine/src/d02/ex00/result.txt";
    public static ArrayList signArr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File signature = new File(SIGNATURES);
        int maxSize = parseSignFile(signature);

        Scanner scanner = new Scanner(System.in);
        String inpText = scanner.nextLine();
        byte[] readBytes = new byte[maxSize];
        OutputStream result = new FileOutputStream(RESULT);
//        String ret;
        while (!inpText.equals("42")) {
            System.out.println("PROCESSED");
            InputStream checkFile = new FileInputStream(inpText);
            checkFile.read(readBytes);
            for (int i = 0; i < signArr.size(); i++) {
                Signature sub = (Signature) signArr.get(i);
                boolean ret = sub.compare(readBytes);
                if (ret) {
                    result.write((sub.getKey() + "\n").getBytes(StandardCharsets.UTF_8));
                    break;
                }
            }
            checkFile.close();
            inpText = scanner.nextLine();
        }
        result.close();
    }

    public static int parseSignFile(File file) throws FileNotFoundException {
        Scanner readSignatures = new Scanner(file);
        int maxSize = 0;
        while (readSignatures.hasNextLine()) {
            String lineSign = readSignatures.nextLine();
            Signature sign = new Signature(lineSign);
            signArr.add(sign);
            maxSize = Math.max(maxSize, sign.getSize());
        }
        return maxSize;
    }

}
