package FileOutInput;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 一次写多个字节的方法
 * public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
 * public void write(byte [] b,int off, int len)从指定的字节数组写入len字节，从偏移量 off开始输出到此输出流
 * int off 数组的开始索引 int len 写几个字节
 *
 * 写入字符串的方法
 * String.getBytes()-->把字符串转换为字节数组
 */

public class OutputStreamTest02 {


    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream(new File("b.txt"));// String name,File f 都是我们写入数据的目的地
        fos.write(49);
        fos.write(48);
        fos.write(48);
        /**
         * 一次写多个字节：
         *  如果写的第一个字节是整数（0-127），那么显示的时候会查询ASCII表
         *  如果写的第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
         */
        byte[] bytes = {65,66,67,68,69};
//        fos.write(bytes);
        fos.write(bytes,1,2);


        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes2);
        fos.close();

    }

}
