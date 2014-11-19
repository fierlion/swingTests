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
public class SortingAlgos {

    public static void main(String[] args) {
	//assume comparator returns 0 if p == q,  negative number if p < q,
	//and positive number if p > q
	Integer [] numArr = {0,1,2,3,4,5,6,7,8,9,200,-23};
	System.out.println("initial, index 0: " + numArr[0]);
	
	//shuffle numArr
	Shuffler shuf = new Shuffler();
	shuf.shuffle(numArr);
	System.out.println("shuffled, index 0: " + numArr[0]);
	
	//test Insertion Sort
	//time complexity O(n^2)
	//space complexity O(1) 
	InsertionSort is = new InsertionSort();
	is.InsertionSort(numArr);
	System.out.println("Insertion Sorted, index 0: " + numArr[0]);
	System.out.println("Insertion Sorted, index 1: " + numArr[1]);
	
	//reshuffle
	shuf.shuffle(numArr);

    }
    
}
