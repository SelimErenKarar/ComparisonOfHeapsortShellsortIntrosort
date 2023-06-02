import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] a = new int[10000];
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt();
		}
		
		System.out.println("Randomly Integers\n");
		
		HeapSort s1 = new HeapSort();
        long startTime1 = System.nanoTime();
		s1.sort(a);
		long estimatedTime1 = System.nanoTime() - startTime1;
		System.out.print("HeapSort = ");
		System.out.println(estimatedTime1);
		
		ShellSort s2 = new ShellSort();
        long startTime2 = System.nanoTime();
		s2.sort(a);
		long estimatedTime2 = System.nanoTime() - startTime2;
		System.out.print("ShellSort = ");
		System.out.println(estimatedTime2);
		
		IntroSort s3 = new IntroSort(a.length);	
		for (int i = 0; i < a.length; i++) {
            s3.dataAppend(a[i]);
        }
		long startTime3 = System.nanoTime();
		s3.sortData();
		long estimatedTime3 = System.nanoTime() - startTime3;
		System.out.print("IntroSort = ");
		System.out.println(estimatedTime3);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
