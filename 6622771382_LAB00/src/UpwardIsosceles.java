
public class UpwardIsosceles {
	public static void main(String[] args) {
		makeUpwardIsosceles(4);
	}

	private static void makeUpwardIsosceles(int W) {
		// TODO Auto-generated method stub
		System.out.println("     *    ");
		for(int i = 1; i <= W; i = i + 1) {
			for(int j = W; j >= i; j = j - 1) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2 * i + 1); k = k + 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
