package day01;

/**
 * throw 关键字可以在指定方法内抛出指定异常
 * 定义一个方法，获取数组指定索引处的元素
 * 参数 int[] arr int index
 *
 * 以后工作中 我们首先必须对方法传递过来的参数进行合法性的校验
 * 如果参数不合法，我们必须使用抛出异常的方式，告知方法的调用者，默认交给JVM处理
 * 注意：
 * NullPointerException是运行时异常，我们不用处理，交给JVM处理
 */
public class ThrowLearning {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        getElement(arr,3);
    }


    public static int getElement(int arr[],int index){

        if(arr == null){
            throw new NullPointerException("数组为空");
        }
        if(index<0 || index>=arr.length){
            throw new IndexOutOfBoundsException("索引越界");
        }
        return arr[index];
    }
}
