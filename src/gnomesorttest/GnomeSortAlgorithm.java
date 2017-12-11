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
public class GnomeSortAlgorithm {

    public static int[] gnomeSortAlgorithm(int[] array) {
        for (int index = 1; index < array.length;) {
            if (array[index - 1] <= array[index]) {
                index++;
            } else {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
                if (index == 0) {
                    index = 1;
                }
            }
        }
        return array;
    }
}
