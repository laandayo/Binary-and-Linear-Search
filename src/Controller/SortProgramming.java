package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SortProgramming extends Menu<String> {
	static String[] mc = {"Binary Search", "Linear Search", "Exit"};
	
	protected Library library;
        protected Algorithm algorithm;
        protected int[] array;
        protected int size_array;
	
	public SortProgramming(Element element) {
		super("LOADING", mc);
		library = new Library();
		algorithm = new Algorithm();
                size_array = element.getSize_array();
                array = element.getArray();
	}
	
	public void execute(int n) {
		library.display(array);
		int value = library.getInt("\nEnter number to find: ", 1, 100);
        switch (n) {
            case 1:
                System.out.println("Found value: " + value + " at index: " + algorithm.binaryS(array, value));
                break;
            case 2:
                System.out.println("Found value: " + value + " at index: " + algorithm.linearS(array, value));
                break;
            case 3:
                System.exit(0);
        }
    }
	
}
