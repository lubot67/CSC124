
public class bubble {
	public void bubbleSort(int ar[]){
		int i;
			for(i=(ar.length-1);i>=0;i--){
				for (int j=1; j<=ar.length-1; j++){
					if (ar[j-1]>ar[j]){
						int p;
						p=ar[j-1];
						ar[j-1]=ar[j];
						ar[j]=p;
					}
				}
			}
	}
}
