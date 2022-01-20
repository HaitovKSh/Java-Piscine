package d02.ex00;

import java.util.Arrays;
import java.util.Scanner;

public class Signature {
    private String key;
    private byte[] value;
    private int size = 0;

    public Signature(String strSignature) {
        String[] parse = strSignature.split(",");
        if (parse.length == 2) {
            key = parse[0];
            size = parse[1].trim().split(" ").length;
            this.value = new byte[size];
            Scanner textBytes = new Scanner(parse[1]);
            for (int i = 0; textBytes.hasNextInt(16); i++) {
                this.value[i] = (byte)textBytes.nextInt(16);
            }
            //  signArr.put(key, this.value);
        }
    }

    public boolean compare(byte[] cmpBytes) {
        byte[] cmpArr = Arrays.copyOfRange(cmpBytes, 0, size);
        return Arrays.equals(cmpArr,value);
    }

    public boolean compare(String cmpStr) {
        byte[] cmpBytes = cmpStr.getBytes();
        return compare(cmpBytes);
    }

    public byte[] getValue() {
        return value;
    }

    public int getSize() {
        return size;
    }

    public String getKey() {
        return key;
    }
}
