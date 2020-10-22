package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberPar = new Member(1000, "�ڼ���");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPar);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");  //1003 ���̵� �ߺ� 
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
