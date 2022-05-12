import java.util.*;

class Main <T>{
    public static void main(String[] args) {
        Helpers helpers = new Helpers();

        //Test Java Program to find average of an int Array.
        var intarr = new int[]{3,4,2,6,8,1,9,5};
        System.out.println("Average of "+ Arrays.toString(intarr) + " is " + helpers.Average(intarr));

        //Test Create a Java Program to Sort an Array of Numeric or String Data.
        var objarri = new Object[]{3,4,2,6,8,1,9,5};
        var objarrs = new Object[]{"a", "d", "c", "egg", "ball", "f", "apple"};
        helpers.Sort(objarri);
        helpers.Sort(objarrs);
        System.out.println("Sort int: " +Arrays.toString(objarri));
        System.out.println("Sort str: " +Arrays.toString(objarrs));

        //Test Write a Java Program to check if Array contains a specific value.
        System.out.println("Find '4': " +helpers.Find(objarri, 4));

        //Test Write a Java Program to reverse the array contents.
        helpers.Reverse(objarrs);
        System.out.println("Reverse: " +Arrays.toString(objarrs));

        //Test Write a Java Program to remove a particular element from an array.
        helpers.Remove(objarri, 4);
        System.out.println("Remove '4': " +Arrays.toString(objarri));

        //Test Write a Java Program to find the second highest value in a numeric array.
        System.out.println("Second highest: " +helpers.SecondHighest(intarr));

        //Test Create a Java code to copy an Array into another array.
        var arr1 = new Object []{1,2,3,4};
        var arr2 = new Object []{5,6,7};
        var arr = helpers.Copy(arr1, arr2);
        System.out.println("Copy: " + Arrays.toString(arr1) + "+" + Arrays.toString(arr2) + "="+Arrays.toString(arr));

        //Test Write a Java Code a Array of length 100 and fill it with Random int Values for testing purpose.
        System.out.println("Random 100: " +Arrays.toString(helpers.Random100()));

        //Test Java program to find duplicate elements in a String array.
        var strarr = new String[]{"a", "d", "c", "egg", "ball", "f", "apple", "a", "egg"};
        helpers.DuplicateChars(strarr);

        //Test Write a Java program to check if two arrays are equal.
        System.out.println("Equal: "  + Arrays.toString(arr1) + "and" + Arrays.toString(arr2) + "="+helpers.EqualArrays(arr1, arr2));
    }
}