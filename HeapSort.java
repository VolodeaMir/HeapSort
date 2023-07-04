/**
 * HeapSort - Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = { 83, 63, 77, 67, 79, 97, 61, 5, 76, -3 };
        heapSort(array);
        System.out.println("__________HeapSort__________");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, i, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

    public static void heapify(int[] array, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < n && array[left] > array[largest])
            largest = left;
        if (right < n && array[right] > array[largest])
            largest = right;

        if (i != largest) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, largest, n);
        }
    }
}