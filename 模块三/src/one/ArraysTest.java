package one;

import java.util.Arrays;

public class ArraysTest {
   private static  final int[] arr={1,2,3,4,5};
   private  int[] inputArr;

    public void setInputArr(int[] inputArra) {
        this.inputArr = inputArra;
    }

    public int[] getInputArr() {
        return inputArr;
    }

    public ArraysTest() {
    }

    public ArraysTest(int[] inputArra) {
        this.inputArr = inputArra;
    }


    public static String toString(int[] arr)
   {
       String str=null;
       if(arr==null){return "\"null\"";}
       if(arr.length==0){return "[]";}
       if(arr.length==ArraysTest.arr.length) {
            str = "[";
           for (int i = 0; i < arr.length; i++) {
               if (ArraysTest.arr[i] == arr[i]) {
                   if(i!=arr.length-1){
                       str += arr[i] + ",";
                   }else{
                       str += arr[i];
                   }
               }else{return null;}

           }
           str += "]";
       }
        return str;
   }
    public static void main(String[] args) {
        //int[] arrtest=null;
        ArraysTest arraysTest=new ArraysTest(null);
        System.out.println("arrtest="+ arraysTest.toString(arraysTest.getInputArr()));
        System.out.println("----------------------------------");
        arraysTest.setInputArr(new int[]{});
        System.out.println("arrtest="+ arraysTest.toString(arraysTest.getInputArr()));
        System.out.println("----------------------------------");
        arraysTest.setInputArr(new int[]{1,2,3,4,5});
        System.out.println("arrtest="+ arraysTest.toString(arraysTest.getInputArr()));
        System.out.println("----------------------------------");
    }
}
