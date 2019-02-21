public class SelectionSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		for(int i = 0; i < a.length-1; i++) {
			swap(a, i, smallest(a,i));
		}
	}

	public void swap(int[] a, int smallest, int largest) {
		int temp = 0;
		temp = a[smallest];
		a[smallest] = a[largest];
		a[largest] = temp;
	}

	public int smallest(int[] a, int startpos) {
		int smallest = startpos;
		for (int i = (startpos + 1); i < a.length; i++) {
			if(a[i] < a[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}
}