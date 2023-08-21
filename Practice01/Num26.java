public class MeTest4 {
	private final int id;
	public MeTest4(int id) {
		this.id = id;
	}
}

public void updateId(int newId) {
	id = newId;
}


public class Num26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeTest4 mt = new MeTest4(44);
		mt.updateId(88);
		System.out.println(mt.id);

	}

}
