package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length - 1);
    }
    private static int binarySearch(int[] data, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (data[mid] == target) {
            return mid;
        }
        if (target > data[mid]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return binarySearch(data, target, left, right);
    }
}
