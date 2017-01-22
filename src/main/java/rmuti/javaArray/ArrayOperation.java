package rmuti.javaArray;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperation {
	private int num[] = new int[10];
	private int cloneNum[] = new int[10];

	public ArrayOperation() {
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt();
		}
	}

	public int sumArray() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	public int maxItem() {
		int max = 0;
		max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}

	public int[] copyArray(int start, int end) {
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (i>= start && i<= end ){
			cloneNum[j++] = num[i];
			}
		}
		return cloneNum;
	}
		@Override
		public String toString() {
			return Arrays.toString(num);
		}
}
