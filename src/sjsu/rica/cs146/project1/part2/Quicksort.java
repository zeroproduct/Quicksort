package sjsu.rica.cs146.project1.part2;

import java.util.Arrays;

public class Quicksort {

	private int[] qsArray;

	public Quicksort(int[] quicksortArray) {
		quicksortArray = qsArray;
	}

	//////////////////////////////////////////////////////////////////

	public void quicksort1(int[] A, int p, int r) {

		if (p >= r) {
			return;
		} else {
			int q = partition(A, r, p, r);
			quicksort1(A, p, q - 1);
			quicksort1(A, q + 1, r);
		}
	}

	public int partition(int[] A, int x, int p, int r) {
		swap(A, x, p);
		int i = p + 1;
		for (int j = p + 1; j <= r; j++) {
			if (A[j] < A[p]) {
				swap(A, j, i);
				i++;
			}
		}
		swap(A, p, i - 1);
		return i - 1;
	}

	private static void swap(int[] A, int p, int r) {
		int temp = A[p];
		A[p] = A[r];
		A[r] = temp;
	}

	//////////////////////////////////////////////////////////////////

	public void quicksort2(int[] A, int p, int r) {
		if (p >= r) {
			return;
		} else {
			select(A, p, r, (r - p) / 2);
			int q = partition(A, p, p, r);
			quicksort2(A, p, q - 1);
			quicksort2(A, q + 1, r);
		}
	}

	public void select(int[] A, int p, int r, int i) {

		int n = r - p + 1;
		if (n < 10) {
			int[] copy = new int[n];
			System.arraycopy(A, p, copy, 0, copy.length);
			Arrays.sort(copy);
			System.arraycopy(copy, 0, A, p, copy.length);
			swap(A, p, p + i);
			return;
		}

		int numGroups = n / 5;
		for (int group = 0; group < numGroups; group++) {
			int start = p + group * 5;
			int end = (n == numGroups - 1) ? r : start + 4;
			select(A, start, end, (end - start) / 2);
			swap(A, start, p + group);
		}
		int lastMed = p + numGroups - 1;
		select(A, p, lastMed, numGroups / 2);
		int k = partition(A, p, p, r);
		if (k == p + i - 1) {
			swap(A, k, p);
			return;
		} else if (k >= p + i - 1)
			select(A, p, k - 1, i);
		else {
			int numSmaller = k - p + 1;
			int newi = i - numSmaller;
			select(A, k + 1, r, newi);
			swap(A, k + 1, p);
		}
	}

	//////////////////////////////////////////////////////////////////

	public void print(int[] A) {
		for (int i : A) {
			System.out.print(i + " ");
		}
	}

	public void fillRandom(int[] array, int valueRange) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.abs(Math.random() * valueRange);
		}
	}
}
