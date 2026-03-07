package Strings;

public class numberPad {
    public static void main(String[] args) {
        String str = "12";
        printCombination("", str);
    }

    // helper function to just print all the combination
    public static void printCombination(String p , String unp){
        //jab unp empty ho jayegi tab ham sare possible combination mil chuke honge.
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }

        // we have to get the digit as we are getting a string.
        int digit = unp.charAt(0) - '0';

        // now i have to iterate to get all possible combination.
        for(int i = (digit - 1)*3 ; i<digit*3; i++){
            char ch = (char)('a' + i);
            printCombination(p + ch , unp.substring(1));
        }
    }
}
