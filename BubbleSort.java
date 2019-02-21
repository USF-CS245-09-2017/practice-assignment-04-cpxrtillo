public class BubbleSort implements SortingAlgorithm {

	public void sort(int[] a) {

		boolean swapped = true;

		while (swapped) {

			swapped = false;
			for(int i = 0; i < a.length-1; i++) {
					if(a[i] > a[i+1]) {
						swap(a, i, i+1);
						swapped = true;
					}
			}
		}
	}

	public void swap(int[] a, int smallest, int largest) {
		int temp = 0;
		a[smallest] = a[largest];
		a[largest] = temp;
	}
}