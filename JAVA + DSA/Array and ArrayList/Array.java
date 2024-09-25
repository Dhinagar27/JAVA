import java.util.*;

public class Array {

  public static void main(String[] args) {

    // array is the collection many values of same data types

    // Syntax

    // datatype[] variable_name = new datatype[size];
    // store 5 roll numbers;

    int[] rnos = new int[5];

    // or directly
    int[] rnos2 = { 1, 2, 3, 4, 5 };

    int[] ros; // declaration of Array. ros is getting defined in the stack
    ros = new int[5]; // initialisation, actually here object is being created in the memory (heap)

    // int[] --> datatype
    // arr --> ref variable
    // new int[5] --> creating the object in heap memory
    // new keyword use to create an object
    // here the new keyword will create the array of size 5

    /*
     * int[] arr --> compile time
     * 
     * new int[5] --> run time
     * 
     * it is dynamic memory alocation
     * at the runtime memory is allocated
     * 
     * 1. we know array object or anything object are in heap
     * 2. heap object are not continous
     * in c And c++ array are continous memory alocation but not int java
     * 3. Dynamic memory alloction
     * 
     * hence: array may not be continous --> Depends on JVM
     * 
     */

    int[] nums = new int[5];
    System.out.println(nums[0]); // there is no value in the array in will print 0
    // for integer array it will return "0"

    String[] arr = new String[5];
    System.out.println(arr[2]);// there is no value in the array in will print null
    // for string array it will retrun "Null" null is the literal

    /*
     * primitives are like "int , char , boolean , etc"
     * 
     * 1. ref varialble stored in the stack and object stored in the heap
     * 2. in each element of the array is object
     * 
     */

  }
}
