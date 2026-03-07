package Strings;
// in this will create all possible combination that are their for us.

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
        printPermutations("" , str);

    }

    //helper function to just print all the permutations
    public static void printPermutations(String p , String unp){
        // when our p becomes empty then it means we have used all the characters.
        if (unp.isEmpty()) {
            System.out.println(p);
            return;
        }

        // now the difference in this pattern is we are not aware of exact number of calls that we will make
        // as per every level we are making n+1 calls.
        //why charAt(0) Because for every function call we are getting shorten string from which starting char is removed.

        char ch = unp.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String first = p.substring(0, i);
            String last = p.substring(i);

            printPermutations(first + ch + last, unp.substring(1));
        }
    }
}
