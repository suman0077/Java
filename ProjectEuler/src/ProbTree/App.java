package ProbTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int[] graph = new int[15248];
		
		File data = new File("E:\\daily\\dataTree.txt");
		try {

			Scanner sc = new Scanner(data);
			int i =0;
			while (sc.hasNext()) {

				graph[i]=sc.nextInt();
				i++;
			}

			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int n = graph.length;

		int[] maxSumToNode = new int[n];

		int maxSumToLeaf = 0;

		for (int node = 0; node < n; node++) {

			int nodeValue = graph[node];

			int leftParentNode = leftParent(node);

			int rightParentNode = rightParent(node);

			int maxSumToParent = 0;

			if (leftParentNode != -1) {

				maxSumToParent = Math.max(maxSumToParent,
						maxSumToNode[leftParentNode]);

			}

			if (rightParentNode != -1) {

				maxSumToParent = Math.max(maxSumToParent,
						maxSumToNode[rightParentNode]);

			}

		maxSumToNode[node] = nodeValue + maxSumToParent;

			maxSumToLeaf = Math.max(maxSumToLeaf, maxSumToNode[node]);

		}

		System.out.println("The maximal sum from the root to a leaf is: "
				+ maxSumToLeaf);
	}

	private static int level(int node) {

		return (int) Math.floor(-0.5 + Math.sqrt(0.25 + 2 * node));

	}

	private static int leftParent(int node) {

		int nodeLevel = level(node);

		int leftParent = node - nodeLevel - 1;

		int leftParentLevel = level(leftParent);

		return (leftParentLevel == nodeLevel - 1) ? leftParent : -1;

	}

	private static int rightParent(int node) {

		int nodeLevel = level(node);

		int rightParent = node - nodeLevel;

		int rightParentLevel = level(rightParent);

		return (rightParentLevel == nodeLevel - 1) ? rightParent : -1;

	}

}
