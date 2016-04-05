/**
 * Created by LaroSelf on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        //2.14.1
       MyTuple<String, Integer, Long> obj1 = new MyTuple<>("1", 1, 1L);
        MyTuple< Double, String, String> obj2  = new MyTuple<>(2.2,"2","2");
        System.out.print(obj1.getA()+obj1.getB()+obj1.getC());
    }
}
