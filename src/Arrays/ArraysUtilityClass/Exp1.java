package Arrays.ArraysUtilityClass;

import java.util.Arrays;
import java.util.List;

public class Exp1 {
    public static void main(String[] args) {
        String str = "Hello";
        Integer num = 123;


        // Using getClass().getName()
        System.out.println("Type of str: " + str.getClass()); // Output: java.lang.String
        System.out.println("Type of num: " + num.getClass().getName()); // Output: java.lang.Integer

        System.out.println("Simple name of str's type: " + str.getClass().getSimpleName()); // Output: String


     
        String[] arr ={"a","b","c"};

        System.out.println("printing the array using Arrays.toString(arr):");
        System.out.println(Arrays.toString(arr));

        System.out.println("printing after list coversion   ");
        List<String> l= Arrays.asList(arr);
        System.out.println(l);

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={2,1,3};

        boolean isEqual=Arrays.equals(arr1,arr2);
        boolean isEqual2=Arrays.equals(arr2,arr3);
        System.out.println(isEqual + " " + isEqual2);;
    }
}
