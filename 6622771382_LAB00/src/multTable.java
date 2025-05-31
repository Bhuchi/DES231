
public class multTable {
	public static void main(String[] args) {
		makeMultTable(12);
	}

	private static void makeMultTable(int M) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 12; i = i + 1) {
			if(i == 1) {
				System.out.println(i + " " + "M");
			}
			else if(i > 1) {
				System.out.println(i + " " + i + "M");
			}
		}
	}

}
