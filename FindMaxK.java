public class FindMaxK {
    public static int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n - 1, K);
    }

    public static void swap(int[] a, int lowIndex, int highIndex) {
        int t = a[lowIndex];
        a[lowIndex] = a[highIndex];
        a[highIndex] = t;
    }

    public static int partation(int[] a, int lowIndex, int highIndex) {
        int left = lowIndex;
        int right = highIndex;
        int key = a[lowIndex];
        while (left < right) {
            while (left < right && a[right] < key) {
                right--;
            }
            while (left < right && a[right] >= key) {
                left++;
            }
            swap(a, left, right);
        }
        swap(a, left, lowIndex);
        return left;
    }

    public static int findKth(int[] a, int lowIndex, int highIndex, int K) {
        int part = partation(a, lowIndex, highIndex);
        if (K == part - lowIndex + 1) {
            return a[part];
        } else if (K > part - lowIndex + 1) {
            return findKth(a, part + 1, highIndex, K - (part - lowIndex + 1));
        } else {
            return findKth(a, lowIndex, part - 1, K);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 9, 4, 6, 4, 6, 8};
        System.out.println(findKth(a, 9, 2));
    }
}
