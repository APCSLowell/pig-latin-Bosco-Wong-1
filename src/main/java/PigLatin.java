import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    // your code goes here
        return -1;
    }

    public String pigLatin(String a) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        // more code should go here

	   
 	 if(a.substring(0,2).equals("qu"))
	  return a.substring(2) + "quay";
	    //if have qu at beginning

	if(a.substring(0,1).equals("a")||a.substring(0,1).equals("e")
 	 ||a.substring(0,1).equals("i")||a.substring(0,1).equals("o")||
 	 a.substring(0,1).equals("u"))
  	return a + "way";
	     //starts with vowel

	for( int x = 0; x < a.length(); x++)
	  if(a.substring(x,x+1).equals("a") != true|| a.substring(x,x+1).equals("e") != true 
 	 || a.substring(x,x+1).equals("i") != true || a.substring(x,x+1).equals("o") !=true
  	|| a.substring(x,x+1).equals("u") != true)
 	 return a + "ay";
	    //all consonants

	  int numofCons = 0;
 	 for(int x = 0; x < a.length(); x++){
  	if(a.substring(x,x+1).equals("a") == true|| a.substring(x,x+1).equals("e") == true 
  	|| a.substring(x,x+1).equals("i") == true || a.substring(x,x+1).equals("o") == true
  	|| a.substring(x,x+1).equals("u")== true)
  	break;
 	 else
  	numofCons++;
	 }
	if(numofCons > 0)
	return a.substring(numofCons) + a.substring(0,numofCons) + "ay";
	//beginning consonants moved to end
	    
}
	
	    
	    if(findFirstVowel(sWord) == -1) {
		    return sWord + "ay";
	    }
	    else {
		return "ERROR!";
	    }
    }
}//end PigLatin class


