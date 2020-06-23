class Arrays {
    // Take the arrays.js file, and refactor the code into Java in this file.
    static int[] nums = { 10, 23, 3, 4, 5, 2, 1 };
    static String[] greetings = { "hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا" };
    static boolean[] binaries = { false, true, true, true, false, false, false, true, true, true, true, true, false,
            true, false, false, true, false };

    public static void printNums(int[] arr) {
        // String arrString = Arrays.toString(arr);
        // System.out.println(arrString);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void printGreetings(String[] arr) {
        for (String i : arr) {
            System.out.println(i);
        }
        // String arString = Arrays.toString(arr);
        // System.out.println(arString);
    }

    public static void printBinaries(boolean[] arr) {
        for (boolean i : arr) {
            System.out.println(i);
        }
    };

    public static void main(String[] args) {
        printGreetings(greetings);
        printNums(nums);
        printBinaries(binaries);
    }

}
// const nums = [10,23,3,4,5,2,1];
// const greetings = ["hello","howdy","hallo","hola","bonjour","ciao","أهلا"];
// const binaries = [0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0];

// nums.forEach(n => console.log(n));

// greetings.forEach(g => console.log(g));

// binaries.forEach(b => console.log(!!b));
