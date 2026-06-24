package course_04_sorting;
import java.util.Random;

public class RandomShuffleNumberArray {
    public int[] oneToNIntegers(int n) {

        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = i + 1;
        }

        shuffleArray(original);

        return original;
    }

    //in-place Fisher-Yates shuffle

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = rand.nextInt(i + 1);

            // Swap array[i] with the element at random index j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

/*

    // For checking logic via main method :

    public static void main(String[] args) {
        int n = 10; // Range from 1 to n

        // 1. Initialize the array with numbers 1 to n
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = i + 1;
        }

        // 2. Shuffle the array using Fisher-Yates algorithm
        shuffleArray(original);

        // 3. Create a copy of the shuffled array
        int[] copy = Arrays.copyOf(original, original.length);

        // Output results
        System.out.println("Shuffled Original: " + Arrays.toString(original));
        System.out.println("Copy of Shuffled:   " + Arrays.toString(copy));
    }

 */
