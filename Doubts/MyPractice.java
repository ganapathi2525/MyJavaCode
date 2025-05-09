package Doubts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyPractice {

	public static void evenOrOdd(int i) {
		if (i % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

	public static void fibonacci() {
		int a = 0;
		int b = 1;
		int temp;
		while (b < 200) {
			temp = a + b;
			a = b;
			b = temp;
			System.out.println(b);
		}
	}

	public static void Swap2Numbers(int a, int b) {
		a = a + b; // a=5+10=15
		b = a - b; // b=15-10=5
		a = a - b; // a=15-5=10
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}

	public static void factorial(int a) {

		int res = 1;
		for (int i = 1; i <= a; i++) {
			res = res * i;
		}

		System.out.println(res);
	}

	public static void VowelsConsonants(String str) {

		char c[] = str.toLowerCase().toCharArray();
		System.out.println(Arrays.toString(c));
		int vowels = 0;
		int consonants = 0;
		for (char e : c) {
			if (e == 'a' | e == 'e' | e == 'i' | e == 'o' | e == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("Total Vowels: " + vowels);
		System.out.println("Total Consonants: " + consonants);
	}

	public static void starProgram1() {

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	public static void starProgram2() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void countOccurence(String str) {

		char c[] = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character e : c) {
			if (charMap.containsKey(e)) {
				charMap.put(e, charMap.get(e) + 1);

			} else {
				charMap.put(e, 1);
			}
		}
		System.out.println(charMap);
		Set<Entry<Character, Integer>> demo = charMap.entrySet();

		for (Entry<Character, Integer> e : demo) {
			if (e.getValue() <= 1) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}

	}

	public static void stringOccurence() {

		String str[] = { "Java", "Python", "GoLang", "C", "Python", "Java" };

		Map<String, Integer> charMap = new HashMap<String, Integer>();

		for (String e : str) {
			if (charMap.containsKey(e)) {
				charMap.put(e, charMap.get(e) + 1);

			} else {
				charMap.put(e, 1);
			}
		}
		System.out.println(charMap);
		Set<Entry<String, Integer>> demo = charMap.entrySet();

		for (Entry<String, Integer> e : demo) {
			if (e.getValue() <= 1) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}
	}

	public static void removeStringDuplicates(String str) {

		char c[] = str.toCharArray();

		Set<Character> demo = new HashSet<Character>();

		for (char e : c) {
			if (!demo.contains(e)) {
				demo.add(e);
			}
		}

		System.out.println(demo);
	}

	public static void removeDuplicates() {

		int c[] = { 12, 23, 45, 78, 12, 23, 90, 99, 45, 78 };

		Set<Integer> demo = new HashSet<Integer>();

		for (Integer e : c) {
			if (!demo.contains(e)) {
				demo.add(e);
			}
		}
		System.out.println(demo);
	}
	
	
	public static void reverseString(String str) {
		
		
		char c[]=str.toCharArray();
		String temp="";
		
		for(int i=c.length-1;i>=0;i--) {
			temp=temp+c[i];
		}
		System.out.println(temp);
		
	}
	
	public static void reverseNumber(int a) {
		
		int rev;
		int actualRev=0;
		
		while(a>0) {
			rev=a%10;
			actualRev=actualRev*10+rev;
			a=a/10;
			
		}
		
		System.out.println(actualRev);

	}
	
	public static void checkAnagram() {
		
		String str1="Silent";
		String str2="Listee";
		
		char c1[]=str1.toLowerCase().toCharArray();
		char c2[]=str2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c1, c2));
	}
	
	
	public static void findSecondLargestElement() {
		
		int arr[]= {12,34,6,19,6,77,18,7,33,99};
		
		int largestEle=-1;
		int secondLarEle=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestEle) {
				largestEle=arr[i];
			}
		
		}
		System.out.println(largestEle);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondLarEle && arr[i]!=largestEle) {
				secondLarEle=arr[i];
			}
		}
		System.out.println(secondLarEle);
		
	}
	

	public static void main(String[] args) {
		// evenOrOdd(5);
		// fibonacci();
		// Swap2Numbers(5,10);
		// factorial(5);
		// VowelsConsonants("AEIOr");
		// starProgram1();
		// starProgram2();
		// countOccurence("Java");
		// stringOccurence();
		// removeStringDuplicates("Gana");
		// removeDuplicates();
		//reverseString("Ganapathi");
		//reverseNumber(154);
		//checkAnagram();
		//findSecondLargestElement();
		
	}

}
