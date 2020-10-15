package Octover14;

class MyClass{
    int index;

    public MyClass(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
public class JavaCallByValue {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(1);
        MyClass myClass2 = new MyClass(2);

        //두개의 참조를 바꿔 보자
        swapReference(myClass1, myClass2);
        System.out.println(myClass1.getIndex()); //출력결과 1
        System.out.println(myClass2.getIndex()); //출력결과 2
    }

    static void swapReference(MyClass m1, MyClass m2) {
        MyClass tmp = m1;
        m1 = m2;
        m2 = tmp;
    }
}
