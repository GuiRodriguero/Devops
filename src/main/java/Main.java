
public class Main {
	public static void main(String[] args) {

		int n1 = 1;
	    int n2 = 1;
	    
	    System.out.println("Fibonacci: ");
	    System.out.print("1 ");
	    System.out.print("1 ");

	    int num = 8;
	    while (num > 0) {
	        System.out.print((n1+n2) + " ");
	        int n3 = n1+n2;
	        n1 = n2;
	        n2 = n3;
	        num--;
	    }
	    System.out.println("Fim");
	}
}
