package Recursion.Strings;

public class SkipCharacterFromString {

    // void return type approach :
    static void skipOneCharVoidReturnType(String str,String up,char skipChar){
        if(up.isBlank()){
            System.out.println(str);
            return;
        }

        if(up.charAt(0)==skipChar){
            skipOneCharVoidReturnType(str,up.substring(1),skipChar);
        }else{
            skipOneCharVoidReturnType(str + up.charAt(0), up.substring(1), skipChar);
        }
    }

    // String return type approach :
    static String skipOneCharStringReturnType(String str,char skipChar){

        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0) == skipChar){
            return skipOneCharStringReturnType(str.substring(1),skipChar);
        }else{
            return  str.charAt(0)+ skipOneCharStringReturnType(str.substring(1), skipChar);
        }

    }

    // Using StringBuilder :
    static void skipOneCharUsingStringBuilder(StringBuilder str,char skipChar,int index){

        if(index == (str.length()) ){
            System.out.println(str);
            return;
        }
        if(str.charAt(index) == skipChar){
            skipOneCharUsingStringBuilder(str.deleteCharAt(index),skipChar, index);
        }else{
            skipOneCharUsingStringBuilder(str, skipChar, index + 1);
        }

    }

    static void main(){

        String input = "abcdafga";
        char toSkip = 'a';

        // void return type approach :
        System.out.print("After skipping character '"+toSkip+"' from string '"+input+"' : ");
        skipOneCharVoidReturnType("",input,toSkip);

        // String return type approach :
        System.out.print("After skipping character '"+toSkip+"' from string '"+input+"' : ");
        System.out.print(skipOneCharStringReturnType(input,toSkip));

        // Using StringBuilder type :
        System.out.printf("\nAfter skipping character '"+toSkip+"' from string '"+input+"' : ");
        skipOneCharUsingStringBuilder(new StringBuilder(input), toSkip, 0);

    }
}
