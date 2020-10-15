package Octover13;

public interface Sort {
	public int[] ascending();
	public int[] descending();
	public default void description() {
		System.out.println("해당 알고리즘에 대한 설명입니다.");
	};
}
