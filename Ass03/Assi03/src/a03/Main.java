package a03;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
//import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws FileNotFoundException , IOException , Exception_Handling{
		BST myTree = new BST();
		Vocab_Thread vt = new Vocab_Thread(args,myTree);
		vt.start();
		
		int len = args.length-1;
		File_Thread ft = new File_Thread (len , args , myTree);
		ft.start();
		
		 int choice = 0;
		 System.out.println("MAIN MENU\n1)Displaying BST build from Vocabulary File.");
		 System.out.println("2)Displaying Vectors build from Input files.");
		 System.out.println("3)Viewing Match words and its frequency");
		 System.out.println("4)Searching a query.");
		 System.out.println("5)Enter 5 for Exiting.");
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter Choice");

		 choice = myObj.nextInt();
		 if(choice <= 0 || choice >=6) {
			 throw new Exception_Handling("Invalid Input.Terminating Progam.....");
		 }
		 else if (choice == 1) {
			 myTree.inorder();	
		 }
		 else if (choice == 2) {
			 ft.Vec_Display();
		 }
		 else if (choice == 3) {
			 ft.Word_Frequency();
		 }
		 else if (choice == 4) {
			 ft.Query();
		 }
		 else if (choice == 5) {
			 System.out.println("Exiting Program....");
		 }
		 
		/* try {
		      File myObj = new File(args[0]);
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
		 int choice = 0;
		 System.out.println("1)Displaying BST build from Vocabulary File.");
		 System.out.println("2)Displaying Vectors build from Input files.");
		 System.out.println("3)Viewing Match words and its frequency");
		 System.out.println("4)Searching a query.");
		 System.out.println("5)Display number and name of files");
		 System.out.println("6)Enter 5 for Exiting.");
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter Choice");

		 choice = myObj.nextInt();
		// myObj.close();
		 

		 int len = args.length-1;
		 vec[] myVec = new vec[len];
		 for(int i=0;i<len;i++) {
			 myVec[i] = new vec();
		 }
		 for (int i=0;i<len;i++) {
			 myVec[i].insert(args[i+1]);
		 }
		 

		 if (choice == 1) {
			 myTree.inorder();	
		 }
		 else if (choice == 5) {
			 int files = args.length;
				System.out.println("The Number of files are: " + files);
				for (int i=0;i<args.length;i++)
				{
					System.out.println("Files Name: " + args[i]);
				}
		 }
		 else if (choice == 2) {
			 for (int i=0;i<len;i++) {
			//	 myVec[i].insert(args[i+1]);
				 myVec[i].Display();
			 }
			 
		 }
		 else if (choice == 4) {
			 String query;
			 Scanner input = new Scanner(System.in);  // Create a Scanner object
			 System.out.println("Enter query word");

			 query = input.nextLine();

			int query_count = 0;
			for(int i=0;i<len;i++) {
					 query_count = myVec[i].word(query);
					 System.out.println("Query occurred in " + args[i+1] + " is equal to " + query_count);
			 }

		 }
		 
		 else if (choice == 3) {
			 Word_freq myWord = new Word_freq();
			 String to_send;
			 for(int i=0;i<len;i++) {
				try {
					//	System.out.println("An error occurred.");
					 	File word_in = new File(args[i+1]);
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
		 } */
	}
}
