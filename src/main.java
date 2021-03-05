import java.util.Scanner;

import linear.LinkedList;
import linear.Stack;
import nonlinear.Graph;
import nonlinear.Tree;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total=scanner.nextInt();
		for (int p = 0; p < total; p++) {
			int arrSize = scanner.nextInt();
			int nextSpace = -1;
			int arr[] = new int[arrSize];
			for (int i = 0; i < arrSize; i++) {
				arr[i] = Integer.MAX_VALUE;
			}
			for (int x = 0; x < arrSize; x++) {

				int curr = 0;
				int i = 0;
				arr[x] = scanner.nextInt();
				curr = x;
				while (arr[curr] < arr[curr / 2]) {
					int temp = arr[curr];
					arr[curr] = arr[curr / 2];
					arr[curr / 2] = temp;
					curr = curr / 2;
				}
				nextSpace = x;
			}
			//System.out.println("After Heapify");
			while (nextSpace >= 0) {
				System.out.println(arr[0]);
				arr[0] = arr[nextSpace];
				arr[nextSpace] = Integer.MAX_VALUE;
				nextSpace--;
				int curr = 0;
				while (arr[curr] > arr[curr * 2 + 1] && arr[curr] > arr[curr * 2 + 2]) {
					if (arr[curr * 2 + 1] > arr[curr * 2 + 2]) {
						int temp = arr[curr];
						arr[curr] = arr[curr * 2 + 2];
						arr[curr * 2 + 2] = temp;
						curr = curr * 2 + 2;
					}
					else {
						int temp = arr[curr];
						arr[curr] = arr[curr * 2 + 1];
						arr[curr * 2 + 1] = temp;
						curr = curr * 2 + 1;
					}
				}
			}
		}
		System.out.println();

	}

}
