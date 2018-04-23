package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> t1=t.addChild(t.root(), 9);
		t.addChild(t1, 7);
		t.addChild(t1, 10);
		
		Position<Integer> t2=t.addChild(t.root(), 20);
		Position<Integer> t21=t.addChild(t2, 15);
		Position<Integer> t22=t.addChild(t2, 21);
		t.addChild(t21, 12);
		Position<Integer> t221=t.addChild(t21, 17);
		t.addChild(t221, 19);
		Position<Integer> t3=t.addChild(t22, 40);
		t.addChild(t3, 30);
		t.addChild(t3, 45);
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> t1=t.addLeft(t.root(), 9);
		t.addLeft(t1, 7);
		t.addRight(t1, 10);
		
		Position<Integer> t2=t.addRight(t.root(), 20);
		Position<Integer> t21=t.addLeft(t2, 15);
		Position<Integer> t22=t.addRight(t2, 21);
		t.addLeft(t21, 12);
		Position<Integer> t221=t.addRight(t21, 17);
		t.addLeft(t221, 19);
		Position<Integer> t3=t.addRight(t22, 40);
		t.addLeft(t3, 30);
		t.addRight(t3, 45);
	
		return t; 
	}


}
