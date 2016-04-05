package testgenerics2;

/**
 * Created by LaroSelf on 05.04.2016.
 */
public class MyTestMethod {
//2.14.2
    public static <T extends  Comparable<T>> int calcNumber(T []arr, T maxElem){
         int  counter = 0;

               for (int i=0; i<=arr.length-1; i++){
         if (0<(arr[i].compareTo(maxElem))){counter++;        }               }


        return counter ;
    }
}
