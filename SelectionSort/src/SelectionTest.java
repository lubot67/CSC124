import java.util.Random;
public class SelectionTest {
			public static void main(String[] args){
				Sort ssort = new Sort();
				Random ran = new Random();
				int p = 1000;
				int ar[] = new int[p];
				
					System.out.println("Random Array: ");
					
					for(int i=0; i<p; i++){
						ar[i] = ran.nextInt(p);
						System.out.print(ar[i] + "\t");
					}
					
					long start1 = System.currentTimeMillis();
					ssort.selectionSort(ar);
					long end1 = System.currentTimeMillis();
					long total1 = end1 - start1;
					System.out.print("\n\nSorted Array: 1\n");
					print(ar, p);
					System.out.print("\nTime: " + total1 + "\n");
					
					long start2 = System.currentTimeMillis();
					ssort.selectionSort(ar);
					long end2 = System.currentTimeMillis();
					long total2 = end2 - start2;
					System.out.print("\nSorted Array: 2\n");
					print(ar, p);
					System.out.print("\nTime: " + total2 + "\n");
									
				
					int b[] = new int [p];
					int j = 0;
					for(int i = ar.length-1; i >= 0; i--) {
						b[j] = ar[i];
						j++;
					}
				
					
					long start3 = System.currentTimeMillis();
					ssort.selectionSort(b);
					long end3 = System.currentTimeMillis();
					long total3 = end3 - start3;
					System.out.print("\nSorted  Descending Array: \n");
					print(ar, p);
					System.out.print("\nTime: " + total3 + "\n");
			} 
			
			
	public static void print(int[] ar, int p)
		{
				for(int i=0; i<=p-1; i++){
				System.out.print(ar[i] + "\t");
		}		
		}}
