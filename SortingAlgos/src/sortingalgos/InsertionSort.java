/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

/**
 *
 * @author rfoote/Hieneman/Pollice/Selkow from 'Algorithms in a Nutshell'
 */
public class InsertionSort {
    public void InsertionSort (Integer [] arrIn) {
	for (int i = 1; i < arrIn.length; i++) {
	    insert(arrIn, i, arrIn[i]);
	}
    }
    
    private void insert(Integer [] arrIn, int pos, Integer val) {
	int i = pos - 1;
	//move values over
	while (i >= 0 && arrIn[i] > val) {
	    arrIn[i + 1] = arrIn[i];
	    i -= 1;
	}
	arrIn[i + 1] = val;
    }
}
