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
public class InDepthGnomeSortAlgorithm extends GnomeSortAlgorithm {

    public static int[] inDepthGnomeSortAlgorithm(int[] array) {
        int swapCount = 0;
        int compareCount = 0;
        System.out.println("~STARTING GNOME SORTING ALGORITHM~");
        for (int index = 1; index < array.length;) {
            System.out.println("COMPARING " + array[index - 1] + " AND " + array[index]);
            compareCount++;
            if (array[index - 1] <= array[index]) {
                System.out.println("NO SWAP. Continuing...");
                index++;
            } else {
                System.out.println("SWAPPING " + array[index - 1] + " AND " + array[index]);
                swapCount++;
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                System.out.println("SWAPPED. Continuing...");
                index--;
                if (index == 0) {
                    index = 1;
                }
            }
        }
        System.out.println("Number of compares: " + compareCount);
        System.out.println("Number of swaps: " + swapCount);
        System.out.println("~SORT COMPLETE~");
        return array;
    }
}
