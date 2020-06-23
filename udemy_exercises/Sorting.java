import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class Sorting {
    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList sortIntegers(ArrayList arr) {
        // ArrayList<Integer> sList = new ArrayList<Integer>();
        // sList = Collections.sort(arr);
        // return sList;
        Collections.sort(arr);
        return arr;
    }

    public static void printArray(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }

    public static ArrayList getIntegers() {
        System.out.println("Choose the length of your Array");
        int count = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList<Integer>(count);
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            scanner.nextLine();
            arr.add(num);
        }
        return arr;
    }

    public static void reverse(ArrayList numbers) {
        Collections.reverse(numbers);
        System.out.println(numbers);
    }

    /// I would think that the reverse function is pure since it doesn't save the
    /// mutated
    /// value outside of its lexical scope" but then again printing might make it
    /// impure
    // Edit-
    /// printing is considered a side effect so although it doesn't make sense to
    /// me, impure is the correct answer
    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");
        // System.out.println("Enter count");
        // int count = scanner.nextInt();
        // scanner.nextLine();
        ArrayList<Integer> newArr = getIntegers();
        printArray(newArr);
        System.out.println(" ");
        ArrayList<Integer> sortedArr = sortIntegers(newArr);
        printArray(sortedArr);
        reverse(sortedArr);

    }
