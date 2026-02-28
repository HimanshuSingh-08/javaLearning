package Strings;

public class streams {
    public static void main(String[] args) {
        String str = "Himanshu";
//        skipChar(str,"");
        System.out.println(skipSubStringButSelectedOne(str));
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
    // if we wanted to do it in one argument in that case we.

    public static String skipCharOneArg(String str){

        if(str.isEmpty()){
            return " ";
        }
        // rest of the code block me ham isko process karenge
        char ch = str.charAt(0);

        // now we have to check if our current char should be included or removed.
        if(ch == 's' || ch == 'u'){
            return skipCharOneArg(str.substring(1));
        }else{
            return ch + skipCharOneArg(str.substring(1));
        }
    }

    // now this is the basic of strings now thing like if we have a question where we need to skip certain name.
    // In that ham kya kare hai jab ham koi nai string add karte hai to ham bas us ko skip kardenge

    public static String skipSubString(String str){
        // when whole str got processed
        if(str.isEmpty()) return "";

        if(str.startsWith("shu")){
            return skipSubString(str.substring(3));
        }else{
            return str.charAt(0) + skipSubString(str.substring(1));
        }
    }
    // what if you wanted to skip a specific part from the string not so for this we just need minor changes in our
    // code and all done.

    public static String skipSubStringButSelectedOne(String str){
        // when whole str got processed
        if(str.isEmpty()) return "";

        if(str.startsWith("man") &&  !str.startsWith("manhu")){
            return skipSubStringButSelectedOne(str.substring(3));
        }else{
            return str.charAt(0) + skipSubStringButSelectedOne(str.substring(1));
        }
    }
}
