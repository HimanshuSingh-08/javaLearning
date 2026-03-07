package Strings;

import java.util.ArrayList;

public class numberPad {
    public static void main(String[] args) {
        String str = "12";
        printCombination("", str);
        System.out.println(getCombinationCount("", str));
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
    // helper function to return the list for it
    public static ArrayList<String> getCombination(String p , String unp){
        //jab unp empty ho jayegi tab ham sare possible combination mil chuke honge.
        if(unp.isEmpty()){
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //local ans container
        ArrayList<String> ans = new ArrayList<>();
        // we have to get the digit as we are getting a string.
        int digit = unp.charAt(0) - '0';

        // now i have to iterate to get all possible combination.
        for(int i = (digit - 1)*3 ; i<digit*3; i++){
            char ch = (char)('a' + i);
            ans.addAll(getCombination(p + ch , unp.substring(1)));
        }
        return ans;
    }

    //helper function to get the permutation count for it.
    public static int getCombinationCount(String p , String unp){
        //jab unp empty ho jayegi tab ham sare possible combination mil chuke honge.
        if(unp.isEmpty()){
            return 1;
        }
        int count = 0;
        // we have to get the digit as we are getting a string.
        int digit = unp.charAt(0) - '0';

        // now i have to iterate to get all possible combination.
        for(int i = (digit - 1)*3 ; i<digit*3; i++){
            char ch = (char)('a' + i);
            count = count + getCombinationCount(p + ch , unp.substring(1));
        }
        return count;
    }
}
