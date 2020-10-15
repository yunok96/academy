package chapter12.arraylist;

import java.util.ArrayList;  // ����� Ŭ���� import
import java.util.Iterator;

import chapter12.Member;    

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList ���� 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //����� ������ ArrayList ����
	}
	
	public void addMember(Member member){  //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public void insertMember(Member member, int position) {
		if(position <0 || position > arrayList.size()+1) {
			System.out.println("���� �� �ڸ��� �߰��� �� �����ϴ�");
			return;
		}
		arrayList.add(position-1, member);
	}
	
	public boolean removeMember(int memberId){  // ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
		for(int i =0; i<arrayList.size(); i++){ // �ش� ���̵� ���� ����� ArrayList���� ã��
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
				arrayList.remove(i);           // �ش� ����� ����
				return true;                   // true ��ȯ
			}
		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
				arrayList.remove(member);           // �ش� ����� ����
				return true;                   // true ��ȯ
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");  //for �� ������ ���� return �� �ȵȰ��
		return false;                   
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
