package ObjectputStramLearning;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * 练习：序列化集合
 * 当我们想在文件中保存多个对象的时候
 * 可以把多个对象存储到一个集合中
 * 对集合进行序列化和反序列化
 *
 * 步骤：
 *  1.定义一个存储Person对象的ArrayList集合
 *  2.往ArrayList集合中存储对象
 *  3.创建一个序列化流ObjectOutputStream对象
 *  4.使用writeObject方法，对集合进行序列化
 *  5.创建一个反序列化ObjectInputStream对象
 *  6.使用readObject方法读取文件中保存的集合
 *  7.把Object类型的集合转换为ArrayList类型
 *  8.遍历ArrayList集合
 *  9.释放资源
 */
public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("焦淑婷",18));
        list.add(new Person("张三",18));
        list.add(new Person("李四",18));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));

        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));

        Object o =  ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>)o;

        for (Person person : list2) {
            System.out.println(person);
        }
        ois.close();
        oos.close();


    }
}
