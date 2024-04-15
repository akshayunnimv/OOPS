public class Cycle2P2 {
	public static void main(String[] args) {
		System.out.println("Akshay Unni M V\n23mca010\ndt:14/03/2024\nsearcharray");
		int[] array = { 1, 5, 9, 2, 4, 7 };
		int target = 4;
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				found = true;
				break;
			}
		}

		if (found) {
		System.out.println("Element " + target + " found in the array.");
		} 
		else {
		System.out.println("Element " + target + " not found in the array.");
		}
	}
}
