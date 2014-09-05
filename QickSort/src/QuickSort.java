
public class QuickSort {
	public void KickSort(int ar[], int p, int r){
		if (p<r){
			int q = Partition(ar,p,r);
				KickSort(ar,p,q-1);
				KickSort(ar,q+1,r);
		}
	}
	public int Partition (int[] ar,int p, int r){
		int x = ar[r];
		int i = p-1;
		for (int j=p; j<=r-1;j++){
			if (ar[j] <= x){
				i++;
				int z = ar[i];
				ar[i]=ar[j];
				ar[j] = z;
			}
		}
		
		int y = ar[i+1];
		ar[i+1]=ar[r];
		ar[r] = y;
		return i++;
	}
}
