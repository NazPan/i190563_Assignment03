package a03;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class vec {

	 

		Vector<String> myVector = new Vector<String>();	
		public void insert (String file) {
			try {
			//	System.out.println("An error occurred.");
			      File myObj = new File(file);
			      Scanner myReader = new Scanner(myObj);
			        while (myReader.hasNextLine()) {
			            String data = myReader.nextLine();
			            StringTokenizer defaultTokenizer = new StringTokenizer(data);
			            while (defaultTokenizer.hasMoreTokens())
			            {
				            myVector.add(defaultTokenizer.nextToken());
			            }
			          }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			
		}
		
		public void Display() {
		//	System.out.println("An error occurred display.");
			for (String currVectorElement : myVector) {
				 
                System.out.println(currVectorElement);
		}
			
	 
		 /*   public static void main(String []args) {
	    
	 
	 
	  ; //Declaring a Vector in Java
	 
	 	 
	 
	 
	        //Displaying vector elements	 
	 
	       for (String currVectorElement : vectInt) {
	 
	                 System.out.println(currVectorElement);
	 
	              }
	
	   }    */
		}
		public int Size() {
			int a = myVector.size();
			return a;	
		}
		
		public int word(String word) {
		//	System.out.println("In vec " + word);
			int count = 0;
			for (int i = 0;i<myVector.size();i++) {
				if(word.compareTo((myVector.get(i))) == 0) {
					count++;	
				}
				//System.out.println(myVector.get(i));
				//System.out.println(count);
			}
			return count;
			
		}

		
}

