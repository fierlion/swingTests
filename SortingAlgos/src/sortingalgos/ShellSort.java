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
public class ShellSort {
    public void shellsort(Integer [] arrIn) {
	int inner;
	int outer;
	int temp;
	
	int interval = 1;
	while (interval <= arrIn.length / 3) {
	    interval = (interval * 3) + 1;
	    while (interval > 0) {
		for (outer = interval; outer < arrIn.length; outer++) {
		    //check if arrIn[inner - interval] in index (inner - 
		    //interval) is bigger than temp.
		    temp = arrIn[outer];
		    inner = outer;
		    while (inner > interval - 1 && arrIn[inner - interval] >= temp){
			arrIn[inner] = arrIn[inner - interval];
		    }
		    arrIn[inner] = temp;
		}
		interval = (interval - 1) / 3;
	    }
	}
    }
}
