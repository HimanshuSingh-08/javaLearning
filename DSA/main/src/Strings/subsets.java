package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(getSubseqList(str, ""));
    }

    // we need a helpe function to print all the subsets
    public static void getSubseq(String str, String ans){
        // if our str is empty in that case we will return
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // now we have to simply either consider a char or not
        char ch = str.charAt(0);
        getSubseq(str.substring(1) , ans + ch);
        getSubseq(str.substring(1) , ans);
    }

    // what if we want to return it and store it so in that case we need to send it as arraylist

    public static ArrayList<String> getSubseqList(String str, String ans){
        // if our str is empty in that case we will return
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        // now we have to simply either consider a char or not
        char ch = str.charAt(0);
        ArrayList<String> leftPart =  getSubseqList(str.substring(1) , ans + ch);
        ArrayList<String> rightPart =  getSubseqList(str.substring(1) , ans);
        leftPart.addAll(rightPart);
        return leftPart;
    }
}
