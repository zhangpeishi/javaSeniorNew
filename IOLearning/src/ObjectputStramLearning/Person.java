package ObjectputStramLearning;

import java.io.Serializable;

/**
 * Serializable 是标志性的接口 实体类必须实现该接口 才可以被序列化或者反序列化
 *
 */
public class Person implements Serializable{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
