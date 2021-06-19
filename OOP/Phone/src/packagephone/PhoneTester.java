package packagephone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9",99,"verizon","Ring Ring Ring");
		Iphone iphoneTen = new Iphone("10",75,"JAWWAL","ting ting ting");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}

}
