
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2Java {

	public static void main(String[] args) {
		
		Question37();
		Question38();
		Question39();
		Question50();
		Question59();
		Question60();
		Question67();
		Quesiton74();
		Question79();
		Question85();
	}
		
	public static void Question37() {
		
			System.out.println("—————————————Question37————————————————");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter any words");			
			String word = scan.nextLine();
			
			char [] letter = new char[word.length()];
					
			int letterIndex = 0;				
			for (int i = (word.length()-1) ; i >= 0 ; i-- ) {		
				letter[letterIndex]= word.charAt(i);
				letterIndex++;
			}
			
			String reverseWord = "";
			for (int i = 0 ; i < word.length(); i++ ) {
				reverseWord = reverseWord + letter[i];
			}
			System.out.println(reverseWord + "\n");
			
			
		}

	public static void Question38() {
		
		System.out.println("—————————————Question38————————————————");
		
		String word = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char [] object = word.toCharArray();
		int letter = 0;
		int integer = 0;
		int space = 0;
		int symbol = 0;
		
		for(int i = 0 ; i < word.length(); i ++) {
			
			if(Character.isAlphabetic(object[i])) {
				
				letter++ ;
				
			} else if (Character.isDigit(object[i])) {
				
				integer++ ;
				
			}else if (Character.isSpaceChar(object[i])) {
				
				space ++ ;
				
			} else {
				
				symbol ++ ;
				
			}	
			
		}
		
		System.out.println("The Total letters : " + letter) ;
		System.out.println("The Total numbers : " + integer) ;
		System.out.println("The Total spaces : " + space ) ;
		System.out.println("The others symbol : " + symbol +"\n") ;
	
	}
	
	public static void Question39() {
		
		System.out.println("—————————————Question39————————————————");
		
		String number = "1234";
		
		int totalCombination = 0;
		
		for(int i = 0 ; i < number.length(); i++) {
			
			for(int j = 0 ; j < number.length(); j++) {
				
				for(int k = 0 ; k < number.length(); k++) {
					
					if(i != j && j != k && i != k) {
						
						System.out.println(String.valueOf(number.charAt(i))+String.valueOf(number.charAt(j))+String.valueOf(number.charAt(k)));
						
						totalCombination++ ;
					
					}
				}
			}
		}
		
		System.out.println("Total combination from 4number to from 3-digit number: " + totalCombination +"\n");
		
		}
		
	public static void Question50() {
		
		System.out.println("—————————————Question50————————————————");
		
		ArrayList<Integer> factor3 = new ArrayList<>();
		ArrayList<Integer> factor5 = new ArrayList<>();
		ArrayList<Integer> factorBoth = new ArrayList<>();
		
		for(int i = 1; i < 100 ; i++) {
			
			if(i % 3 == 0 && i % 5 == 0 ) {
				
				factorBoth.add(i);
				
			} 
			
			if(i % 3 == 0) {
				
				factor3.add(i);
				
			}
			
			if(i % 5 == 0) {
				
				factor5.add(i);
				
			}	
	}
		
		System.out.println("The number that can be divided by 3 : \n" + factor3 + "\n");
		System.out.println("The number that can be divided by 5 : \n" + factor5 + "\n");
		System.out.println("The number that can be divided by 3 and 5 : \n" + factorBoth + "\n");
		
		
	}
	
	public static void Question59() {
		
		System.out.println("—————————————Question59————————————————");
		
		System.out.println("Enter something");
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		System.out.println(word.toLowerCase()+"\n");
	}
	 
	public static void Question60() {
		
		System.out.println("—————————————Question60————————————————");
		
		System.out.println("Write a word of sentence");
		
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		
		Scanner input = new Scanner(sentence);
		
		ArrayList<String> word = new ArrayList<String>();
		
		while(input.hasNext()) {
			
			word.add(input.next());

		}
		
		String [] allWords = word.toArray(new String[0]);
		
		int last2 = (allWords.length)-2 ;
		
		System.out.println("Penultimate word : " + allWords[last2] +"\n");
		
	}
	
	public static void Question67() {
		
		System.out.println("—————————————Question67————————————————");
		
		String word = "Pthyon 3.0";
		
		String additionWord = "Tutorial";
		
		System.out.println(word.substring(0, 6) + "\s" + additionWord + "\s" + word.substring(7) +"\n");
			
	}
	
	public static void Quesiton74() {
		
		System.out.println("—————————————Question74————————————————");
		
		int [] number = { 100 , 20 , 30 ,50 , 100 , -2 , -10};
		
		int last = number.length - 1 ;
		
		if(number[0] == 10 || number[last] == 10) {
			
			System.out.println("True" +"\n");
			
		}else {
			
			System.out.println("False" +"\n");
			
		}
		
	}
	
	public static void Question79() {
		
		System.out.println("—————————————Question79————————————————");
		
		int [] number = { 10 , 20 , 30 , 40} ;
		
		int [] reverseNumber = new int[number.length];
		
		int j = 0;
		
		System.out.println("Original: " + Arrays.toString(number));
		
		for(int i = (number.length -1) ; i >= 0 ; i-- ) {
			
			reverseNumber[j] = number[i];
			
			j++;
		}
		
		System.out.println("Reverse: " + Arrays.toString(reverseNumber) +"\n");
	}
	
	public static void Question85() {
		
		System.out.println("—————————————Question85————————————————");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter somethings.");
		
		String word = scan.nextLine();
		
		if(word.contains("Hello") || word.contains("hello")) {
		
		System.out.println("The word you enter start with Hello : True \n" );
		
		} else {
		
		System.out.println("The word you enter start with Hello : False \n" );
		
		}
		
	}
	
}
	
	
	
	
	


	
	


	

	
	
	
	
		
	

