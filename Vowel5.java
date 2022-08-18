import java.util.Scanner;
public class Vowel5
{
public int countvowels(char[] charArr){
	int count =0;
	for(char ch:chaArr){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			count++;
		}
		try{
			if(ch=='x'){
				System.out.println("checked exception");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		return count;
	}
	public static void main(String args[]){
		countvowels obj=neew countvowels();
		char[] charArray={'a','b','c','d','e','x'};
		int countvalueofvowel=obj.countvowel(charArray);
		System.out.println(countvalueofvowel);
	}
}
}
		