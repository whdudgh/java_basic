/*
 * Method 정의 및 사용
 */
public class MethodExample {
	
	/*
	 * 구구단을 출력하는 메서드 정의
	 */
	static void printGugudan() {
		for (int i = 2; i < 10; ++i) {
			for (int j = 1; j < 10; ++j) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
	/*
	 * 단(매개변수)을 입력받아 해당 단을 출력하는 기능
	 */
	static void printDan(int dan) {
		for (int i = 1; i < 10;i++) {
			System.out.print(dan+"*"+i+"="+(dan*i)+" ");
		}
		
	}
	
	/*
	 * 두개의 정수를 전달받아 해당 정수의 합을 반환 기능
	 */
	static int sum(int x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println("구구단 출력하기");
//		구구단 출력 메소드 사용(호출)
		printGugudan();
//		5단 호출
		printDan(5); //5는 전달인자(Argument)
		
		int x =500, y=42424242;
		int result = sum(x,y);
		System.out.println(result);
		
		System.out.println(sum(5, 10));
	}

}
