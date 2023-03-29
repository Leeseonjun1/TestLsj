package pack08_casting;

public class Ex02_Casting {
private static final int Dou = 0;

public static void main(String[] args) {
	
	//문자열 ="12"+34 = 1234
	//String + int = DataType String
    //Why? 문자열 + 어떤값 = 문자열 규칙
	// 문자열 결합의 법칙
	
	String sum = "12"+34;
	//어떤 값을 String으로 바꾸는것은 엄청나게 간단하다.
	System.out.println(sum);
	String sum2 = ""+1234;
	System.out.println(sum2);
	//String sum ,sum2 변수에 문자열로 숫자를 저장해둠.
	// 두개의 합을 알고싶다. "1234"+"1234"= 12341234
	// sum + sum2 =
	// 숫자 1234 + 1234 =2468의 결과를 얻어야 한다.
	
	//int,double 등의 보라색으로 글씨 바뀌는것 > 기본타입
	// 대문자로 시작하는것은 대부분 Class타입
	// 기본 데이터 타입은 Wrapper class라는것을 가지고있다
	// int > Integer , double > Double
	// String을 해당하는 타입으로 바꿔주는 행위를 하는것
	// String에 있는 ""< 를 제거한다.
	
	int num = Integer.parseInt(sum);
	int num2 = Integer.parseInt(sum2);
	
    System.out.println(num+num2);
    
    String sAvg = "88.6";
    double dAvg = Double.parseDouble(sAvg)+10;
    
    System.out.println(dAvg);
    
    String str = "123";
    int ivalu= Integer.parseInt(str);
    
    
    
    //wrapperClass.parseDataType(String);=>DataType
//    Float.parseFloat(sAvg);
//    Long.parseLong(sAvg);
//    Byte.parseByte(sAvg);    
}
}
