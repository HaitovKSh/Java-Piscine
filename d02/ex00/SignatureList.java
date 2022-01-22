package d02.ex00;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SignatureList {
    private ArrayList signArr = new ArrayList<>();
    private int maxValueSize = 0;
    private int sizeArr = 0;

    public SignatureList(String signatureFileName) throws FileNotFoundException {
        File signatureFile = new File(signatureFileName);
        fillArray(signatureFile);
    }
    public SignatureList(File fileSignature) throws FileNotFoundException {
        fillArray(fileSignature);
    }

    private void fillArray(File file) throws FileNotFoundException {
        Scanner fileFlow = new Scanner(file);

        while (fileFlow.hasNextLine()) {
            String lineSign = fileFlow.nextLine();
            Signature sign = new Signature(lineSign);
            this.signArr.add(sign);
            sizeArr++;
            maxValueSize = Math.max(maxValueSize, sign.getSize());
        }
    }

    public ArrayList getSignArr() {
        return signArr;
    }

    public int getMaxValueSize() {
        return maxValueSize;
    }
    public Signature getSignByID(int id){
        return (Signature) signArr.get(id);
    }
    public Signature getSignByKey(String key){
        for (int i = 0; i < sizeArr; i++) {
            Signature sub = getSignByID(i);
            if (key == sub.getKey()) {
                return sub;
            }
        }
        return null;
    }
    public Signature getSignByValue(byte[] bytes) {
        for (int i = 0; i < sizeArr; i++) {
            Signature sub = getSignByID(i);
            if (sub.compare(bytes)) {
                return sub;
            }
        }
        return null;
    }
}
