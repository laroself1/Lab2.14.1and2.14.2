

package testgenerics2;

/**
 * Created by LaroSelf on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {
//2.14.2
        Integer [] arr1 = {1,2,3,4,5,6,7,8,9};
        Double [] arr2 ={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
      Integer arr1MaxElement = 8;
        Double arr2MaxElement = 5.5;
Integer res = MyTestMethod.calcNumber(arr1, arr1MaxElement);
        int res2 = MyTestMethod.calcNumber(arr2, arr2MaxElement);
      System.out.print("array values:[");
        for(int i=0; i<arr1.length; i++){
        System.out.print(arr1[i]);}
        System.out.println("]");
        System.out.println("Number of elements that are greater than "+ arr1MaxElement);
        System.out.println(res);
        System.out.print("array values:[");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");}
        System.out.println("]");
        System.out.println("Number of elements that are greater than "+ arr2MaxElement);
        System.out.println(res2);

    }
}
