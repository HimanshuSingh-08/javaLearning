package Strings;

public class subsets {
    public static void main(String[] args) {
        String str = "abc";
        getSubsets(str, "");
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
}
