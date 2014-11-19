/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

/**
 *
 * @author rfoote
 */
public class QuickSort {
    public void quicksort(Integer [] arrIn) {
	qsort(arrIn, 0, arrIn.length - 1);
    }
    
    private void qsort(Integer [] arrIn, int left, int right) {
	if (left < right) {
	    int pa = partition(arrIn, left, right);
	    qsort(arrIn, left, pa - 1);
	    qsort(arrIn, pa + 1, right);
	}
    }
    
    private int partition(Integer [] arrIn, int left, int right) {
	return -1;
    }
}
