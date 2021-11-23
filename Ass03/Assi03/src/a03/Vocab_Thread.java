package a03;

import java.io.*;
import java.util.Scanner;

public class Vocab_Thread extends Thread {
	String [] argv;
	BST myTree = new BST();
	public Vocab_Thread(String[] argc, BST Tree) {
		argv = argc;
		myTree = Tree;
	}
	
	public void run() {
		 try {
		      File myObj = new File(argv[0]);
		      Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		            String data = myReader.nextLine();
		            myTree.insert(data);
		          }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
