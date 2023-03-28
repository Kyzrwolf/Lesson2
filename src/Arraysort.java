
public class Arraysort {

    public static void main(String[] args) {
        int[] Array = {1, 5, 11, 4, 3, 8, 7, 6, 12, 2, 0};


        /** Пузырьковая сортировка. Сравнивается предыдущий и следующий элемент массива.
         * для сортировки в обратную сторону изменить в строке 16 ">" на "<"
         */
        boolean swapped = true;
        int n = Array.length;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (Array[i - 1] > Array[i]) {
                    int temp = Array[i - 1];
                    Array[i - 1] = Array[i];
                    Array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
            if (i != Array.length - 1) {
                System.out.print(", "); // вывод элементов массива через запятую (на конце - без запятой :)
            }
        }

    }
}


