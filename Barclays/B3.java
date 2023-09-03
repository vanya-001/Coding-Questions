package Barclays;

// You have given an array. You have to find out if we can make this array in increasing order by making one swap or not.
public class B3 {
    static boolean oneSort(int n, int arr[]) {
        int first = 0;
        int second;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
                if (first == 0) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        if (count > 2) {
            return false;
        }
        if (count == 0) {
            return true;
        }

        if (count == 2) {
            swap(arr, first - 1, first);
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    static int[] swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2 };
        int n = arr.length;

        if (oneSort(n, arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
