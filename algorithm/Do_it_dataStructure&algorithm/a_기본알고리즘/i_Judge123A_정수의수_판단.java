package a_기본알고리즘;
import java.util.Scanner;
// 입력 받은 정수값의 양수/음수/0을 판단

class i_Judge123A_정수의수_판단 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("1~3사이의 정수를 입력하세요.：");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("이 수는 1입니다.");
		else if (n == 2)
			System.out.println("이 수는 2입니다.");
		else if (n == 3)
			System.out.println("이 수는 3입니다.");
		else
			System.out.println("1~3의 사이의 수가 아닙니다");
	}
}
