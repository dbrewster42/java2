class Monkey {

    // static class Monkey {
    //     String name;
    //     boolean smile;
    // }
    String name;
    boolean smile;

    public Monkey(String name, boolean smile) {
        this.name = name;
        this.smile = smile;
    }

    public static boolean monkeyBusiness(Monkey[] monkeyList) {
        int i = 0;
        for (Monkey a : monkeyList) {
            if (a.smile) {
                i = i + 1;
            } else {
                i = i - 1;
            }
        }
        if (i > -1) {
            return true;
        }
        return false;
        //BONUS EXERCISE
        //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  
        //Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are
        // not smiling, return false.  If it is a tie, return true.  

    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine 
        //whether the majority of them are smiling or not.  

        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.  

        Monkey[] monkeyList = new Monkey[5];
        Monkey monkey = new Monkey("George", true);
        Monkey monkey2 = new Monkey("Georgia", true);
        Monkey monkey3 = new Monkey("Fred", false);
        Monkey monkey4 = new Monkey("Roger", false);
        Monkey monkey5 = new Monkey("Freddie", false);
        monkeyList[0] = monkey;
        monkeyList[1] = monkey2;
        monkeyList[2] = monkey3;
        monkeyList[3] = monkey4;
        monkeyList[4] = monkey5;
        for (Monkey j : monkeyList) {
            System.out.println(j.name);
        }

        if (monkeyBusiness(monkeyList))
            System.out.println("At least half the monkeys are smiling");
        else
            System.out.println("The majority of monkeys are not smiling");

    }

}