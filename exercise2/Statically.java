
public class Statically {
    private static glue = "Epoxy";
    private jello = "Jello";
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    public void getGlue(){
        return glue;
    }

    public void moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        console.log("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        stubborn();
    }

    public static void main(String[] args) {
        Statically stat = new Statically();
        stat.moveAndShake();
        stat.getGlue();
        stubborn();
        explain();
    }
}

// getGlue() {
//     return glue;
// }

// moveAndShake() {
//     console.log("Never stagnate in life.  Be agile, change, and improve...");
// }

// static stubborn() {
//     // this.moveAndShake();
//     console.log("Please don't make me change... I just don't like it...");
// }

// static explain() {