class DD1 {
	private DD1() {
		System.out.println("Ŭ���� DD1�� ������");
	}
}

class DD2 extends DD1 {
	public DD2() {
		System.out.println("Ŭ���� DD2�� ������");
	}
}


public class Num27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DD2 d = new DD2();

	}

}
