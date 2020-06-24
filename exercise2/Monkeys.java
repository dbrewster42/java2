class Monkeys{

boolean monkeyBusiness(Monkey[]monkeys){
//BONUS EXERCISE
//We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  
//Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are
// not smiling, return false.  If it is a tie, return true.  
return true;}

public static Monkey {
    String name;
    boolean smile;
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine 
        //whether the majority of them are smiling or not.  

        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.  

        Monkey[] monkeyList = new String[3];
        Monkey monkey = new Monkey("George", true);
        Monkey monkey2 = new Monkey("Georgia", true);
        Monkey monkey3 = new Monkey("Fred", false);
        monkeyList[0] = monkey;
        monkeyList[1] = monkey2;
        monkeyList[2] = monkey3;

        System.out.println(monkeyList);

    }

}