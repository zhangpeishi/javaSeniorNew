package FileOutInput;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zhangpeishi
 * 类似FileOutputStream练习一遍即可
 */

public class InputStreamTest01 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("b.txt");
        fis.read();
        fis.close();

    }
}
