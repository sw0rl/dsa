import java.util.HashSet;

public class TwoNumberSum {
	public static void main(String[] args) {
		int[] arr = {3, 5, -4, 8, 11, 1, -1, 6};
		HashSet<Integer> integers = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			integers.add(arr[i]);
		}
		
		int targetSum = 10;
		
		for (int j = 0; j < arr.length; j++) {
			int validInt = targetSum - arr[j];
			if (integers.contains(validInt)) {
				System.out.println("There is a pair contained.");
				break;
			}
		}
	}
}
