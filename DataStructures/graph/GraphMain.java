package graph;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphMain {

	public static void main(String[] args) {
		
		try {

			Graph graph = new Graph("graphInputFile.txt", false);
			graph.print();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
