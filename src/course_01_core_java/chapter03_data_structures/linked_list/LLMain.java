package course_01_core_java.chapter03_data_structures.linked_list;

public class LLMain {
    static void main() {

        // RandomShuffleNumberArray numGen = new RandomShuffleNumberArray();
        // int[] ele=numGen.oneToNIntegers(10);
        // System.out.println("Input array Values : ");
        // System.out.println(Arrays.toString(ele));

        int[] ele={10,8,2,5,6};

        Ex01_SingleLL linkedList=new Ex01_SingleLL();

        // Insertion
        for (int nums : ele) {
            linkedList.insert(nums);
        }
        linkedList.show();

        // Insert the val at position based
        linkedList.insertValAtPosition(1,0); // at Start check
        linkedList.show();
        linkedList.insertValAtPosition(2,1); // in-between check
        linkedList.show();
        linkedList.insertValAtPosition(3,7); // at last check
        linkedList.show();

        // Insert at start
        linkedList.insertAtStart(16);
        linkedList.show();

        // Insert at last
        linkedList.insertAtLast(20);
        linkedList.show();

        // Deletion by position
        linkedList.deleteAtPos(0); // At start check
        linkedList.show();
        linkedList.deleteAtPos(4); // in-between check
        linkedList.show();
        linkedList.deleteAtPos(7); // at last check
        linkedList.show();

        // Deletion at start
        linkedList.deleteAtStart();
        linkedList.show();

        // Deletion at last
        linkedList.deleteAtLast();
        linkedList.show();
    }
}
