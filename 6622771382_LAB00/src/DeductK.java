
public class DeductK {
	public static void main(String[] args) {
		deductk(12,1);
	}

	private static void deductk(int M, int K) {
		// TODO Auto-generated method stub
		for(int i = K; i < M; i = i + 1) {
			System.out.print(M - (i * K) + " ");
		}
	}

}
