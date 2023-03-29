package pack08_casting;

public class Ex01_Casting {
     public static void main(String[] args) {
        // 자동형변환이 발생함 작은 타입(int) => 큰 타입 (double)
 		// 묵시적 형변환 , Upcasting
    	 
    	int iNum= 10; // 정수형 변수 a를 초기화 하고 10을 담아둠
		double dNum = iNum; //더 큰 타입에 작은 타입을 담으면 자동 변환이 일어남 (자동 형변환)
    	System.out.println(iNum);
		System.out.println(dNum);
	
		
		//int iNum2; = dNum2; 큰 타입 > 작은 데이터 타입
   	    //명시적 형변환, 
		double dNum2 =30.5;
		int iNum2 =(int)dNum2;	
	    System.out.println(dNum2);
	    System.out.println(iNum2);
    //DownCasting은 문제가 발생함. 표현할수없는 데이터를 버려버림.
	// 데이터의 신뢰성, 정합성이 떨어질 가능성이 크기때문에 주의
	// long > int, int > float
	// 같은 숫자를 표현하는 데이터 타입끼리는 가능함.
	
	
	int num1 = 40;
	byte num2 =(byte)num1;
	
	System.out.println(num1);
	System.out.println(num2);
	
     }
     
     
     
}
