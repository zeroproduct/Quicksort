package sjsu.rica.cs146.project1.part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * The main JUnit Test class to test each method in Quicksort
 * 
 *
 */
public class QuicksortJUnit
{

   private Quicksort QS;
   int[] array1;
   int[] array2;

   @Before
   public void setUp() throws Exception
   {
      QS = new Quicksort(array1);
   }

   @Test
   public void testQS1Timing()
   {
      int[] array1 = new int[10000];
      int[] array2 = new int[1000000];
      int[] array3 = new int[10000000];
	   
      QS.fillRandom(array1, 10000);
      QS.fillRandom(array2, 1000000);
      QS.fillRandom(array3, 10000000);
      
      
      long start = System.currentTimeMillis();
      QS.quicksort1(array1, 0, array1.length-1);
      long end = System.currentTimeMillis();
      long elapsed = end - start;
      System.out.println("QS1 time to sort 10000 elements in ms:"+ elapsed);

      start = System.currentTimeMillis();
      QS.quicksort1(array2, 0, array2.length-1);
      end = System.currentTimeMillis();
      elapsed = end - start;
      System.out.println("QS1 time to sort 1000000 elements in ms:"+ elapsed);
      
      start = System.currentTimeMillis();
      QS.quicksort1(array3, 0, array3.length-1);
      end = System.currentTimeMillis();
      elapsed = end - start;
      System.out.println("QS1 time to sort 10000000 elements in ms:"+ elapsed);
   }

   
   @Test
   public void testQS2Timing()
   {
      // create an array and a sorted backup
	      int[] array1 = new int[10000];
	      int[] array2 = new int[1000000];
	      int[] array3 = new int[10000000];
		   
	      QS.fillRandom(array1, 10000);
	      QS.fillRandom(array2, 1000000);
	      QS.fillRandom(array3, 10000000);
      
      
      long start = System.currentTimeMillis();
      QS.quicksort2(array1, 0, array1.length-1);
      long end = System.currentTimeMillis();
      long elapsed = end - start;
      System.out.println("QS2 time to sort 10000 elements in ms:"+ elapsed);

      start = System.currentTimeMillis();
      QS.quicksort2(array2, 0, array2.length-1);
      end = System.currentTimeMillis();
      elapsed = end - start;
      System.out.println("QS2 time to sort 1000000 elements in ms:"+ elapsed);
      
      start = System.currentTimeMillis();
      QS.quicksort2(array3, 0, array3.length-1);
      end = System.currentTimeMillis();
      elapsed = end - start;
      System.out.println("QS2 time to sort 10000000 elements in ms:"+ elapsed);
   } 
   
  } // class QuicksortTest