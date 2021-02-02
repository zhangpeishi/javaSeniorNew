package day01;

public class testLamda {
    //2.静态内部类
    static class Like2 implements Ilike{

        @Override
        public void lamda() {
            System.out.println("i like lamda2");
        }
    }

    public static void main(String[] args) {
        //3.局部内部类
        class Like3 implements Ilike{

            @Override
            public void lamda() {
                System.out.println("i like lamda3");
            }
        }



        Ilike like = new Like1();
        like.lamda();

        like = new Like2();
        like.lamda();

        like = new Like3();
        like.lamda();
        //4.匿名内部类
        like = new Ilike() {
            @Override
            public void lamda() {
                System.out.println("i like lamda4");
            }
        };
        like.lamda();

        //5.lamda表达式
        like = ()->{
            System.out.println("i like lamda5");
        };

        like.lamda();
    }

}
//1.外部类
class Like1 implements Ilike{

    @Override
    public void lamda() {
        System.out.println("i like lamda1");
    }
}
//函数式接口
interface Ilike{
    void lamda();
}