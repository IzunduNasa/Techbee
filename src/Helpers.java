import java.util.*;

class Helpers <T> {
    int Average(int[] Arr){
        int sum = 0;
        for (int j : Arr) {
            sum += j;
        }

        return sum/Arr.length;
    }

    void Sort(T[] Arr){
        Arrays.sort(Arr);
    }

    boolean Find(T[] Arr, T value ){
        boolean ret = false;

        for (T val:Arr) {
            if(val.equals(value)) ret = true;
        }

        return ret;
    }

    void Reverse(T[] Arr){
        Collections.reverse(Arrays.asList(Arr));
    }

    void Remove(T[] Arr, T value){
        if(Find(Arr,value)){
            for (int i = 0; i < Arr.length; i++) {
                if(Arr[i].equals(value)) Arr[i] = null;
            }
        }
    }

    int SecondHighest(int[]Arr){
        Arrays.sort(Arr);
        return Arr[Arr.length-2];
    }

    Object[] Copy(T[]Arr1, T[]Arr2){
        ArrayList<T> list = new ArrayList<>((Collection<? extends T>) Arrays.asList(Arrays.asList(Arr1), Arrays.asList(Arr2)));
        Object[] ret = list.toArray();
        return ret;
    }
    
    int[] Random100(){
        int[] arr = new int[100];
        int bound = 1000;
        Random rand = new Random(); //instance of random class
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(bound);
        }
        
        return arr;
    }

    void DuplicateChars(String[] Arr){
        //Map<Character, Integer> charlist = new Map<Character, Integer>();
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {

            }
        }
    }

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
