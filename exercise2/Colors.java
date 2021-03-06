import java.util.ArrayList;

public class Colors {
    private static ArrayList<String> colors = new ArrayList<String>();

    public void colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that 
        // start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        for (String i : strings) {
            if (i.contains("red") || i.contains("yellow") || i.contains("green") || i.contains("blue")) {
                colors.add(i);
            }
        }
    }
    // boolean state = false;
    // switch (state) {
    //     case i.contains("red"):
    //         colors.add(i);
    //         break;
    //     case i.contains("yellow"):
    //         colors.add(i);
    //         break;
    //     case i.contains("green"):
    //         colors.add(i);
    //         break;
    //     case i.contains("blue"):
    //         colors.add(i);
    //         break;
    //     default:
    //         continue;
    // }
    // public void printArr(ArrayList arr) {
    //     for (String color : arr) {
    //         System.out.println(color);
    //     }
    // }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[] { "bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey",
                "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah" });
        System.out.println("This is the Colors class");
        for (String color : colors) {
            System.out.println(color);
        }

    }

}