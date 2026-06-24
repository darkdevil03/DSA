package course_01_core_java.chapter03_data_structures.linked_list;

public class LLMain {
    public static void main(String[] args) {

//        RandomShuffleNumberArray numGen = new RandomShuffleNumberArray();
//        int[] ele=numGen.oneToNIntegers(10);
//        System.out.println("Input array Values : ");
//        System.out.println(Arrays.toString(ele));

        int[] ele={10,8,2,5,6};

        SingleLL linkedList=new SingleLL();

        //inseration
        for (int nums : ele) {
            linkedList.insert(nums);
        }
        linkedList.show();

        //insert the val at position based
        linkedList.insertValAtPosition(1,0); // at Start check
        linkedList.show();
        linkedList.insertValAtPosition(2,1); // in-between check
        linkedList.show();
        linkedList.insertValAtPosition(3,7); // at last check
        linkedList.show();

        // insert at start
        linkedList.insertAtStart(16);
        linkedList.show();

        // insert at last
        linkedList.insertAtLast(20);
        linkedList.show();

        // deletion by position
        linkedList.deleteAtPos(0); // At start check
        linkedList.show();
        linkedList.deleteAtPos(4); // in-between check
        linkedList.show();
        linkedList.deleteAtPos(7); // at last check
        linkedList.show();

        // deletion at start
        linkedList.deleteAtStart();
        linkedList.show();

        // deletion at last
        linkedList.deleteAtLast();
        linkedList.show();





    }
}
