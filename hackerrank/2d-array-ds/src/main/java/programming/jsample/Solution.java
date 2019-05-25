package programming.jsample;

public class Solution {

	public int solution(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {

			for (int j = 0; j < arr.length - 2; j++) {

				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}
}