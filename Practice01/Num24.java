class Asia {
	public String country = "Asia";
	public String getC() {
		return country;
	}
}

class China extends Asia {
	public String country = "China";
	public String getC() {
		return super.country;
	}
}

class Korea extends Asia {
	public String country = "Korea";
	public String getC(int x) {
		return super.getC();
	}
}

public class Num24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new China().getC());
		System.out.println(new Korea().getC());

	}

}
