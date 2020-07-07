class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  
    //Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    getGlue() {
        return glue;
    }

    moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        // this.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        this.stubborn();
        // this.getGlue();
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        //in javascript, static methods are called on the class itself but not instances of the class.
        //in java, a static member is a member of a class that isnt associated with an instance of a class. thus you can access a static member without creating a class instance first. the value of a static field is the same for all instances
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(stats.getGlue);
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
