package course_02_recursion.base;

public class HelloWorldRecursive {

    static void print(String str,int iterateCount){
        if(iterateCount==0){
            return;
        }
        System.out.println(str+" <- "+iterateCount); // 3,2,1 - order of printing (seq)
        print(str,iterateCount-1);
        System.out.println(str+" --> "+iterateCount+ " After return!"); // 1,2,3 - order of printing (rev)
    }

    static void main() {
        String input="Hello World";
        int repeat=3;

        print(input,repeat);
    }
}
