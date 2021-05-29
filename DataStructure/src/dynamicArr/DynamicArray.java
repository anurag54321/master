package dynamicArr;

public class DynamicArray {
	private int[] array;
	private int count;
	private int size;

	public DynamicArray() {
		array = new int[4];
		count = 0;
		size = 4;

	}

	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

	public void add(int element) {
		resize();
		array[count] = element;
		count++;
	}

	private void resize() {
		int tempArray[] = null;
		if (count == size-1) {
			tempArray = new int[size * 2];
			for (int i = 0; i <= size; i++) {
				tempArray[i] = array[i];
			}
			array = tempArray;
			size = size * 2;
		}

	}
}
