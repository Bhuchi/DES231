
public class DownwardRightTriangle {
	public static void main(String[] args) {
		makeDownwardRightTriangle(4);
	}

	private static void makeDownwardRightTriangle(int W) {
		// TODO Auto-generated method stub
		for(int i = W; i >= 1; i = i - 1) {
			for(int j = 0; j < i; j = j + 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
