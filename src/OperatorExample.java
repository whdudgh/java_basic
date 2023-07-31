/*
 * 자바에서 지원하는 연산자들
 */
public class OperatorExample {

	public static void main(String[] args) {
		int x = 30,y = 5;
		
		//산술연산자
		System.out.println("합 = "+(x + y));
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); // 나머지 연산자..
		
//		+연산자는 오버로딩(중복정의) 좌측에서 우측으로 계산함
		System.out.println(10+50);
		System.out.println("김기정"+"바보");
		System.out.println(10 + 30 + "바보");
		System.out.println("바보"+10 + 30);
		System.out.println("바보"+(10 + 30));//()로 우선순위정해 우측부터 계산
		
//		복합대입연산자(+=, -=, *=, /=, %=)
//		x = x+5;
		x += 5;
		x -= 5;
		x *= 5;
		x /= 5;
		x %= 5;
		System.out.println(x);
		
//		비교연산자(==, !=, <=, >=, <, >)
		x = 10;
		y = 5;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		System.out.println(x > y);
		System.out.println(x < y);
		
//		증감연산자(++, --)
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		x = 10;
//		System.out.println(x++);
		System.out.println(++x);
		
//		논리연산자(&&, ||, !)
		x = 30;
		y = 50;
		
		System.out.println(x >= 30 && y <= 50);
		System.out.println(x < 30 && y <= 50);
		System.out.println(x < 30 || y <= 50);
		System.out.println(!true);
		
//		조건삼항연산자
		int score = 65;
		String result = score >=60? "통과" : "실패";
		System.out.println(result);
		
//		기본데이터타입 형변환
//		자동형변환(Promotion - up casting)
		double sum = 50;
		
//		강제형변환(Demotion - douwn casting)
		double avg = 85.34567;
		
		System.out.println(avg);
		System.out.println((int)avg);
		
		
	}

}
