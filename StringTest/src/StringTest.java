
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gfrend = "Masha";
		
		String gfrend1 = new String ("Natasha");
		String gfrend2 = new String ("Natasha");
		
		boolean fl1 = gfrend == "Masha";
		boolean fl2 = gfrend1 == gfrend2;
		
		System.out.println("gfrend == Masha:" + fl1);
		System.out.println("gfrend1 == gfrend2:" + fl2);
		
		System.out.println(gfrend);
		gfrend = "null";
		System.out.println(gfrend);
		
		System.out.println(gfrend1);
		gfrend1 = "null";
		System.out.println(gfrend1);

	}

}
