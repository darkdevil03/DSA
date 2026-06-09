package Recursion.Strings;

public class SkipCharacterFromString {


    static void skipOneChar(String str,String up,char skipChar){
        if(up.isBlank()){
            System.out.println(str);
            return;
        }

        if(up.charAt(0)==skipChar){
            skipOneChar(str,up.substring(1),skipChar);
        }else{
            skipOneChar(str + up.charAt(0), up.substring(1), skipChar);
        }
    }

    static void main(){

        String input = "abcdafga";
        char toSkip = 'a';

        System.out.print("After skipping character '"+toSkip+"' from string '"+input+"' : ");
        skipOneChar("",input,toSkip);
    }
}
