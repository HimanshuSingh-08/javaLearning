package Strings;
// in this will create all possible combination that are their for us.

import java.util.ArrayList;
import java.util.Arrays;

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = getPermutations("",str);
        System.out.println(ans);

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

    // now if i want to get this data into form of list as i want to return back it.
    public static ArrayList<String> getPermutations(String p , String unp){
        // when our p becomes empty then it means we have used all the characters.
        if (unp.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // now the difference in this pattern is we are not aware of exact number of calls that we will make
        // as per every level we are making n+1 calls.
        //why charAt(0) Because for every function call we are getting shorten string from which starting char is removed.

        char ch = unp.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String first = p.substring(0, i);
            String last = p.substring(i);

            ans.addAll(getPermutations(first + ch + last, unp.substring(1)));
        }
        return ans;
    }
}
