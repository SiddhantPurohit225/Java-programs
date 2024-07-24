package Arrays;
import java.util.Arrays;



public class Methods2{
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;

        }

        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println(Arrays.toString(arr));



        /******************************************/
        Object obj = arr;

        if(obj instanceof int[]){
            System.out.println("Yes its an integer array");
        }


        System.out.println(obj.toString());

        
/******************************************/
        Object[] newObj = new Object[3];

        newObj[0]= 9;
        newObj[1]="spdvffd";
        newObj[2]=arr;

        for(Object o:newObj){
            System.out.println(o);
        }
    }
}