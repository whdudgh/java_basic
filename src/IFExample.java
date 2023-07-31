/*
 * 조건(분기)문 if
 */
public class IFExample {

	public static void main(String[] args) {
		int score = 88;
		// 단순 if문
		if (score >= 60) {
			System.out.println("참잘했습니다...");// []생략가능이지만 해깔리니 사용x
		}

		// if ~ else ~
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		String resault = score >= 60 ? "합격" : "불합격";
		System.out.println(resault);

		int num = 56;
		if ((num % 2) == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");

		}

		// 다중 if문 else if
		if (score >= 90) {
			System.out.println("수");

		} else if (score >= 80) {
			System.out.println("우");

		} else if (score >= 70) {
			System.out.println("미");

		} else if (score >= 60) {
			System.out.println("양");

		} else {
			System.out.println("가");

		}

	}
}