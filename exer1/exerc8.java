package exer1;

public class exerc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int TAM = 10;
		int a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for (int i = 0; i < TAM; i++) {
            a[i] = i + 1;
        }
		
		for (int i = 0; i < TAM; i++) {
            b[i] = a[i] * i;
        }
		
		for (int i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i] + "  ->  b[" + i + "] = " + b[i]);
        }
	}

}
