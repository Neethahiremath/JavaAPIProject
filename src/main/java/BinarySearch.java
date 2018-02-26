import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    private boolean cointainElement(int input[], int elementToBeSearched) {
        if (input.length == 0) {
            return false;
        }
        float low = 0;
        float high = input.length - 1;

        while (low <= high) {

            int number = (int) ((low + high) / 2);

            if (input[number] == elementToBeSearched) {
                return true;
            } else if (input[number] > elementToBeSearched) {
                high = number - 1;
            } else if (input[number] < elementToBeSearched) {
                low = number + 1;
            }
        }
        return false;
    }

    private void binarySearchForCollections() {

        ArrayList<Integer> input = new ArrayList<Integer>() {{

            add(12);
            add(13);
        }};

        List<Integer> inputList = Arrays.asList(12, 34, 46, 78, 90, 8);

        int index = Collections.binarySearch(inputList, 12);

        System.out.println(index);
    }

    public static void main(String[] args) {

        int[] input = {4, 5, 6, 9, 12, 20};

        BinarySearch binarySearch = new BinarySearch();
        boolean output = binarySearch.cointainElement(input, 20);
        System.out.println(output);

        binarySearch.binarySearchForCollections();
    }
}
