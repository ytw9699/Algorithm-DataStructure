package b_recursive;
	public class b_01_Recursive {
	static void Recursive(int num) {
		if(num <=0)//탈출조건
			return;//탈출
		
		System.out.printf("Recursive call! %d \n", num);
		Recursive(num-1);//자기자신을 다시 호출
		
	}
		public static void main(String[] args) {
				System.out.println(1);
				Recursive(3);//제일 첫번째로 호출된 메소드 가장 마지막에 종료
		}
 }
