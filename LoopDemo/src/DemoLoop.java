import java.util.Scanner;
public class DemoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		String s=in.next();
		int i=0;
		for(;i<N;) {
			if(i%2==0)
				System.out.println(s+i);
			i++;
		}
	}

}
