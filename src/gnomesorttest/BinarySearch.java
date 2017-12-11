/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnomesorttest;

/**
 *
 * @author joklu7045
 */
public class BinarySearch extends InDepthGnomeSortAlgorithm {

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x) {
                return mid;
            }

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }
}
