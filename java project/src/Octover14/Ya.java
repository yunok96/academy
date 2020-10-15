package Octover14;
import java.util.ArrayList;

public class Ya {
	public static void main(String[] ars) {
		String providedArr = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] myArr=providedArr.split(",");
		int Lee=0, Kim=0, LeeJaeYoung=0, count=0;
		ArrayList<String> newArr = new ArrayList<String>();
		for (String str : myArr) {
			if(str.equals("이재영"))
				LeeJaeYoung++;
			else if(str.charAt(0)=='이')
				Lee++;
			else if(str.charAt(0)=='김')
				Kim++;
			if(!newArr.contains(str))
				newArr.add(str);
			else
				count++;
		}
		for (String string : newArr) {
			System.out.print(string+",");
		}
		System.out.println(Lee+","+Kim+","+LeeJaeYoung+","+count);
	}
}
