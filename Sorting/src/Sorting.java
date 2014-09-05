import java.util.Random;


public class Sorting {
	public static void main(String[] args){
        long start, end;
        int test = 500;
int[] ar = new int[test];
Random ran = new Random();
InsertionSort insort = new InsertionSort();

        System.out.print("The generated random numbers \n");
for(int i=0; i<test; i++){
	ar[i] = ran.nextInt(test);
                System.out.print(ar[i] + "\t");
}
 System.out.println("\n");
 System.out.println("The Sorted random numbers");
        
start = System.currentTimeMillis();
ar = insort.insertionSort(ar);
end = System.currentTimeMillis();
insort.print(ar);
System.out.print("Time:" + (end-start) + "\n");        

start = System.currentTimeMillis();
insort.insertionSort(ar);
end = System.currentTimeMillis();
insort.print(ar);
System.out.print("Time is: " + (end-start) + "\n" );

ar = insort.reverse(ar);
start = System.currentTimeMillis();
insort.insertionSort(ar);
end = System.currentTimeMillis();
insort.print(ar);
System.out.print("Time:" + (end-start) + "\n");


}

}
