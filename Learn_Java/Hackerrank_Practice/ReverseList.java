public class ReverseList {
	
	public static void main(String[] args) {
		int[] array = {19, 22, 3, 28, 26, 17, 18, 4, 28, 0};

		// Print the array in reverse order
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
