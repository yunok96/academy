package Octover15;
import java.util.Scanner;
import java.util.Random;

class Twenty_Hills {

	public static void main(String[] args) {
		arrgame();
	}
	
	
	static void arrgame() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(100);
		while(true) {
			System.out.println("숫자들을 입력하세요. 단 ,로 나누고 띄어쓰기는 포함하지 않아야 합니다");
			String input = sc.next();
			String[] str = input.split(",");
			int tmp = 0;
			for (int i=0;i<str.length;i++) {
				if(Math.abs(number-Integer.valueOf(str[i]))<Math.abs(number-Integer.valueOf(str[tmp])))
					tmp=i;
				if(Integer.valueOf(str[i])==number) {
					break;
				}
			}
			if(Integer.valueOf(str[tmp])==number) {
				System.out.println(number+", 정답입니다.");
				break;
			}
			System.out.println((str[tmp])+"(이)가 제일 가깝습니다.");
		}
	}
	
	static void game() {
		int answer;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
			System.out.println("20개의 고개 게임입니다. 아무키나 입력하면 시작합니다. -1을 입력하면 게임을 종료합니다. ");
			int tries = 0;
			int number = random.nextInt(100);
			answer = sc.nextInt();
			if(answer!=-1)
			{
				while(tries<10)
				{
					System.out.println("숫자를 맞춰보세요. 기회는 "+tries+"번 남았습니다. -2를 누르면 현재 문제를 종료합니다. -3을 누르면 정답을 표시합니다.");
					answer = sc.nextInt();
					if(answer==-2)
						break;
					if(answer==number)
					{
						System.out.println("정답입니다!");
						break;
					}
					else
					{
						tries++;
						if(answer==-3)
							System.out.println(number);
						if(tries==0) {
							System.out.println("실패! 도전횟수가 끝났습니다.");
							break;
						}
						else if(answer<number)
							System.out.println("정답은 "+answer+"보다 큽니다");
						else if(answer>number)
							System.out.println("정답은 "+answer+"보다 작습니다");
					}
				}
				if(answer==number)		
					System.out.println("정답 : "+number+", 시도 횟수 : "+tries);
			}
			else if(answer==-1) {
				System.out.println("게임 종료");
				return;
			}
			game();//재귀함수 호출로 인한 무한반복
	}
}
