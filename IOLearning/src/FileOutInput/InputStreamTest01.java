package FileOutInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author zhangpeishi
 * 类似FileOutputStream练习一遍即可
 * String类的构造方法
 *  public String(Byte[] b) 把字节数组转换为字符串
 *  public String(Byte[] b,int offset,int length)把字节数组的一部分转换为字符串 offset 数组的开始索引 length转换的字节个数
 *  len 表示每次读取到的有效字节的个数，不一定是数组的长度 、、、
 */

public class InputStreamTest01 {
    public static void main(String[] args) throws IOException{
//        FileInputStream fis = new FileInputStream("b.txt");

        /**

         int len = fis.read();
         System.out.println(len);
         len = fis.read();
         System.out.println(len);
         len = fis.read();
         System.out.println(len);
         len = fis.read();
         System.out.println(len);
         len = fis.read();
         System.out.println(len);
         fis.close();
         int len = 0;
         while((len = fis.read())!= -1){
         System.out.print((char)len);
         }
         byte [] bytes = new byte[2];
         int len = fis.read(bytes);
         System.out.println(len);
         System.out.println(Arrays.toString(bytes));
         System.out.println(new String(bytes));
         fis.close();

         */

        //以上过程优化：用While循环
        File f  = new File("c.txt");
        f.createNewFile();
        FileInputStream fis = new FileInputStream(f);
        byte [] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            //System.out.println(new String(bytes));//这样会打印空格
            System.out.println(new String(bytes, 0,len));
        }


    }
}
