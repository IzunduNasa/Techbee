import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

class Helpers <T> {

    //Java Program to find average of an int Array.
    int Average(int[] Arr){
        int sum = 0;
        for (int j : Arr) {
            sum += j;
        }

        return sum/Arr.length;
    }

    //Create a Java Program to Sort an Array of Numeric or String Data.
    void Sort(T[] Arr){
        Arrays.sort(Arr);
    }

    //Write a Java Program to check if see if Array contains a specific value.
    boolean Find(T[] Arr, T value ){
        boolean ret = false;

        for (T val:Arr) {
            if(val.equals(value)) ret = true;
        }

        return ret;
    }

    //Write a Java Program to reverse the array contents.
    void Reverse(T[] Arr){
        Collections.reverse(Arrays.asList(Arr));
    }

    //Write a Java Program to remove a particular element from an array.
    boolean Remove(T[] Arr, T value){
        if(Find(Arr,value)){
            for (int i = 0; i < Arr.length; i++) {
                if(Arr[i].equals(value)){
                    Arr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    //Write a Java Program to find the second highest value in a numeric array.
    int SecondHighest(int[]Arr){
        Arrays.sort(Arr);
        return Arr[Arr.length-2];
    }

    //Create a Java code to copy an Array into another array.
    Object[] Copy(T[]Arr1, T[]Arr2){
        return Stream.concat(Arrays.stream(Arr1), Arrays.stream(Arr2))
                .toArray(size -> (T[]) Array.newInstance(Arr1.getClass().getComponentType(), size));

    }

    //Write a Java Code a Array of length 100 and fill it with Random int Values for testing purpose.
    int[] Random100(){
        int[] arr = new int[100];
        int bound = 100;
        Random rand = new Random(); //instance of random class
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(bound);
        }
        
        return arr;
    }

    //Java program to find duplicate elements in a String array.
    void DuplicateChars(String[] Arr){
        HashMap<String, Integer> charlist = new HashMap<String, Integer>();
        for (int i = 0; i < Arr.length; i++) {
            int count = 0;
            if(!charlist.containsKey(Arr[i])){
                for (int j = 0; j < Arr.length; j++) {
                    if(i != j && Arr[i].equals(Arr[j])){
                        count++;
                    }
                }
                charlist.put(Arr[i], count);
            }
        }
        charlist.forEach((k,v) -> System.out.println(k + " has " + v + " duplicates"));
        
    }

    //Write a Java program to check if two arrays are equal.
    boolean EqualArrays(T[] Arr1, T[]Arr2){
        if(Arr1.length != Arr2.length) return false;
        else{
            Arrays.sort(Arr1);
            Arrays.sort(Arr2);

            for (int i = 0; i < Arr1.length; i++) {
                if(!Arr1[i].equals(Arr2[i])) return false;
            }

            return true;
        }

    }
    
}
