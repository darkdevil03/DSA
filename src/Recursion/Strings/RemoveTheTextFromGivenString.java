package Recursion.Strings;

public class RemoveTheTextFromGivenString {

    static void removeTheText(String str, String up, String stringToRemove){

        // break-point
        if(up.isEmpty()){
            System.out.print(str);
            return;
        }

        // Recursive call based on the condition stringToRemove match with startWith of substrings of input string.
        if(up.startsWith(stringToRemove)){
            removeTheText(str, up.substring(stringToRemove.length()), stringToRemove);
        }else{
            removeTheText(str + up.charAt(0), up.substring(1), stringToRemove);
        }

    }


    static void main(){

        String str = "abhellofg";
        String removeText =  "hello";

        System.out.print("After the removal of '"+removeText+"' from input '"+str+"' : ");
        removeTheText("",str, removeText);


    }
}
