
public class InsertionSort {

    int test = 500;
public int[] insertionSort(int[] ar){
    for(int i = 1; i < ar.length; i++){
        int index = ar[i];
        int j = i;
        while(j>0 && ar[j-1]> index){
            ar[j] = ar[j-1];
            j--;
        }
        ar[j] = index;
    }
    	return ar;
	}
public void print(int[] ar)
{
	for(int i=0; i<test; i++){
		System.out.print(ar[i] + "\t");
	}
}
public int[] reverse(int[] ar){
	int[] newAr = new int[test];
	for(int i=test-1; i >=0; i--){
		newAr[(test-1)-i] = ar[i];
	}
	return newAr;
}


}
