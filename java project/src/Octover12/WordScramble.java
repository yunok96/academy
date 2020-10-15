package Octover12;

public class WordScramble {

	public static void main(String[] args) {
		String[] strArr = {"CHANGE","LOVE","HOPE","VIEW"};
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);

        System.out.println("Question:"+question);
        System.out.println("Answer:"+answer);
	}
	
	public static String getAnswer(String[] strArr) {
		String choice = strArr[(int)(Math.random()*4)];
		return choice;
	}
  
	public static String getScrambledWord(String str) {
	   char[] chr = str.toCharArray();
	   for(int i = 0;i < str.length();i++) 
	   {
		   int j = (int)(Math.random()*str.length());
		   char ch=chr[i];
		   chr[i]=chr[j];
		   chr[j]=ch;
	   }
	   String question = "";
	   for(int i = 0;i<chr.length;i++)
	   {
		   question+=chr[i];
	   }
	   return question;
	}
}
