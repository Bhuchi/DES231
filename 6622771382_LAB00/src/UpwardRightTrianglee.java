
public class UpwardRightTrianglee {
	public static void main(String[] args) {
		makeUpwardRightTriangle(4);
	}

	private static void makeUpwardRightTriangle(int W) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= W; i = i + 1) {
			for(int j = 0; j < i; j = j + 1) {
				System.out.print("*");
			}
			System.out.println();
			}
	}
}
