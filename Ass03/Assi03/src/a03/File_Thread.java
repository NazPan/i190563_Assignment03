package a03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class File_Thread extends Thread{
	int len;
	String [] argv;
	BST myTree = new BST();
	vec [] myVec;
	Word_freq myWord;
	public File_Thread(int file_no, String[] args, BST Tree) {
		len = file_no;
		myTree = Tree;
		myVec = new vec [len];
		argv = args;
	}
	
	public void run() {
		
		 for(int i=0;i<len;i++) {
			 myVec[i] = new vec();
		 }
		 for (int i=0;i<len;i++) {
			 myVec[i].insert(argv[i+1]);
		 }

	}
	
	public void Word_Frequency() {
		myWord = new Word_freq();
		String to_send;
		 for(int i=0;i<len;i++) {
			try {
				//	System.out.println("An error occurred.");
				 	File word_in = new File(argv[i+1]);
				    Scanner myReader = new Scanner(word_in);
				    while (myReader.hasNextLine()) {
				          String data = myReader.nextLine();
				          StringTokenizer defaultTokenizer = new StringTokenizer(data);
				          while (defaultTokenizer.hasMoreTokens())
				          {
					       //   myVector.add(defaultTokenizer.nextToken());
				        	  to_send = defaultTokenizer.nextToken();
				  		//	System.out.println("Frequency main " + to_send);
				        	  if(myTree.search(myTree.root,to_send)) {
				        		  myWord.head = myWord.Search(myWord.head,to_send);
				        	  }
				          }
				      }
				      myReader.close();
			} catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
		 }
		 
		 myWord.Display(myWord.head);
	}
	
	public void Vec_Display() {
		 for (int i=0;i<len;i++) {
				//	 myVec[i].insert(args[i+1]);
					 myVec[i].Display();
				 }
	}
	
	public void Query() {
		String query;
		 Scanner input = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter query word");

		 query = input.nextLine();

		int query_count = 0;
		for(int i=0;i<len;i++) {
				 query_count = myVec[i].word(query);
				 System.out.println("Query occurred in " + argv[i+1] + " is equal to " + query_count);
		 }

	 }
	
}
