import java.util.Random;

public class DominantElements {
	public static void main(String[] args){
		Dominant ssort = new Dominant();
		Random ran = new Random();
		int p = 10;
		int ar[] = new int[p];
		
			System.out.println("Random Array: ");
			
			for(int i=0; i<p; i++){
				ar[i] = ran.nextInt(p);
				System.out.print(ar[i] + "\t");
			}
			
			long start1 = System.currentTimeMillis();
			ssort.rightelem(ar);
			long end1 = System.currentTimeMillis();
			long total1 = end1 - start1;
			System.out.print("\n\nSorted Array: \n");
			print(ar, p);
			System.out.print("\n\nRight Dominants: \n");
			
			for(int k = 0; k < ssort.list.size(); k++){
	              System.out.print(ssort.list.get(k)+" ");
	          }
			
			System.out.print("\nTime: " + total1 + "\n");
			
			
	} 
	
	
public static void print(int[] ar, int p)
{
		for(int i=0; i<=p-1; i++){
		System.out.print(ar[i] + "\t");
}		
}
	
	}
