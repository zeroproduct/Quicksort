package sjsu.rica.cs146.project1.part2;

public class QuicksortTest {

	public static void main(String[] args) {
	
		Quicksort QS, QS2;
		int size;
		int valueRange = 100;

		int[] array1;
		int[] array2;

		size = 1000;
		array1 = new int[size];
		array2 = new int[size];

	
		QS = new Quicksort(array1);
		QS2 = new Quicksort(array2);
	
		QS.fillRandom(array1, valueRange);
		QS.print(array1);
		QS.quicksort1(array1, 0, array1.length-1);
		System.out.println();
		QS.print(array1);
		System.out.println();
		System.out.println("Done");
		
		QS2.fillRandom(array2, valueRange);
		QS2.print(array2);
		QS2.quicksort2(array2, 0, array2.length-1);
		System.out.println();
		QS2.print(array2);
		System.out.println();
		System.out.println("Done");
		
		
	}
}