package Strings;

public class streams {
    public static void main(String[] args) {
        String str = "Himanshu";
        skipChar(str,"");
    }

    //helper function to process the strings
    public static void skipChar(String str , String ans){
        

        if(str.isEmpty()){
            System.out.println("This is my processed str : " + ans);
            return;
        }

        // rest of the code block me ham isko process karenge
        char ch = str.charAt(0);

        // now we have to check if our current char should be included or removed.
        if(ch == 's' || ch == 'u'){
            skipChar(str.substring(1) , ans);
        }else{
            skipChar(str.substring(1), ans + ch);
        }
    }
}
