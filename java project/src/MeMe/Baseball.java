package MeMe;

public class Baseball extends Ball {
	public Baseball(String a, double b) {
		super();//자신의 부모 클래스 생성
		super.color=a;//메소드 a에 넣은 값을 부모의 컬러에 할당
		super.size=b;//메소드 b에 넣은 값을 부모의 사이즈에 할당
		System.out.println("야구공의 색은 "+color+", 크기는 "+size);
	}
}
