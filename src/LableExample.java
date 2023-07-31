/*
 * Lable 
 */
public class LableExample {

	public static void main(String[] args) {
		OUT://레이블선언
		for (int i = 0; i < 10; i++) {
			 for (int j = 0; j < 10; j++) {
				System.out.println(i+", "+j);
				if(j == 5) {
//					break;
					break OUT;//레이블사용
				}
			}
			
		}
	

	}
}
