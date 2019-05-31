import java.util.*;

public class PrimeNumber {
 // static ArrayList<Long> primeNumberList = new ArrayList<>(); 
  static String checkString ;
  static long finalResult;
  static long primeNumberCheck(long entryNum){
	  finalResult = 2;
	  for(long counter =2; counter<= entryNum; counter++) {
		  if(counter % 2 !=0) {
			  //make sure to add +1 to the end because it's not including 2
			   checkString = Long.toString(counter);
			  int concat = 0;
			  if(checkString.length() ==1 && counter % 3 !=0 && checkString.length() ==1 && counter % 2 !=0) {
				  finalResult +=1;
				  System.out.println(counter);
			  } else {
				  for(int count =0; count<checkString.length();count++) {
					  
					  concat = concat + Integer.valueOf(checkString.charAt(count));
					  
					  
				  }
				 if(concat % 3 !=0) {
					 if(counter>5) {
						 int lastIndex = checkString.length() - 1;	
						 char c = checkString.charAt(lastIndex); 
						 if(Character.getNumericValue(c) !=5){
							 if(counter % 7 !=0) {
								 double sqrtCheck = Math.sqrt(counter);
								 if(Double.toString(sqrtCheck).indexOf('.')<0) {
									 finalResult +=1;
									System.out.println(counter);
								 }
								 
							 }
							
						}
					 }
				 } 
			  }
			 
			  }
		  }
	  
	  return finalResult;
  }
  
}
