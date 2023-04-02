public class Arraysort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 11, 4, 3, 10, 8, 7, 6, 12, 2, 0};

        printArray(array);
        sortArray(array, true);
        printArray(array);
        sortArray(array, false);
        printArray(array);
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print("]");
            }
        }
        System.out.println("");
    }

    public static void sortArray(int[] array, boolean ascending) {
        int n = array.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if ((ascending && array[i] < array[i - 1]) || (!ascending && array[i] > array[i - 1])) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}

