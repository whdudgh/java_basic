/*
 * 반복문 while
 */
public class WhileExample {

	public static void main(String[] args) {
		int index = 0;

		while (index < 100) {
			System.out.println("김기정 바보!!!!");
			index++;
		}

		//
		int result = 0;
		index = 1;
		while (index <= 100) {
			result += index;
			index++;

		}
		System.out.println("누적합" + result);

		int oddSum = 0;
		int evenSum = 0;
		index = 1;
		while (index <= 100) {
			if ((index % 2) == 0) {
				evenSum = evenSum + index;
			} else if ((index % 2) != 0) {
				oddSum = oddSum + index;
			}
			index++;

		}
		System.out.println("누적합: " + (evenSum + oddSum));
		System.out.println("짝수합: " + evenSum);
		System.out.println("홀수합: " + oddSum);

		index = 0;
		do {
			System.out.println("풀스택 웹 개발자과정 화이팅!!!!");
			index++;
		} while (index < 100);

	}

}
