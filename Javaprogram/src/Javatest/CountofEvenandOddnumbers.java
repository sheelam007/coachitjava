package Javatest;
public class CountofEvenandOddnumbers {

	public static void main(String[] args) {
		int Array[] = {11, 12, 13, 14, 15};
		int countEven=0,countOdd=0;
		 for(int i = 0; i < Array.length; i++){          
		              if(Array[i] % 2 == 0)   {
		            	  countEven++; 
		              }
		              else {   
		            	  countOdd++;    
		            }      
	      }    
		    System.out.println("Frequency of odd numbers: " + countOdd);    
	        System.out.println("Frequency of even numbers: " + countEven);    
	}    }