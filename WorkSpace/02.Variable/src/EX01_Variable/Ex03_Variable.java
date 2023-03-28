package EX01_Variable;

public class Ex03_Variable {
	public static void main(String[] args) {
		// ctrl + shift + f == 줄정리
		// ctrl + / (주석)
		 int value= 0;
		 int result  = value + 10 ;
//		int value = 10; 
//		int result = value + 10; 
//		
		//숫자형 변수들은 사칙연산이 가능하다
		//재할당. (변수를 계속 만드는게 아니라 값을 다시 줘서 바꿈)
		result = 1+1+10;
		System.out.println(result);
		result = 1+3-1;
		System.out.println(result);
		result = 5*2/2;
		System.out.println(result);
		result = value; //같은 타입의 변수는 값을 담을 수 있다.
			
		
	}

}
