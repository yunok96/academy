package MeMe;

public class Sortar {

	public static void main(String[] args) {
		int[] unsorted = {0,7,5,6,7,4,8,9,1,10};
		for(int i=0;i<unsorted.length-1;i++)//배열의 최대 크기 -1(j+1 을 하면 배열 초과하니까) 까지 탐색
		{
			for(int j=0;j<unsorted.length-1-i;j++)//i 내부에서 최대크기-현재 i 만큼 반복.
			{
				if(unsorted[j]>unsorted[j+1])
				{
					int temp = unsorted[j];
					unsorted[j]=unsorted[j+1];
					unsorted[j+1]=temp;
				}
			}
		}
		for(int i=0;i<unsorted.length;i++) {
			
			System.out.println(unsorted[i]);				
		}
	}

}
