import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tanuja{
	public static void main(String args[]) throws FileNotFoundException{
		new Tanuja().findLongestWords();
	}
	public String findLongestWords() throws FileNotFoundException{
		String Longest_Word="";
		String current;
		Scanner sc=new Scanner(new File("C:\\Users\\Lenovo\\Desktop\\javafile.txt.txt "));
		while(sc.hasNext()){
			current=sc.next();
			if(current.length()>Longest_Word.length()){
				Longest_Word=current;
			}
		}
		System.out.println("\n"+Longest_Word+"\n");
		return Longest_Word;
	}
}