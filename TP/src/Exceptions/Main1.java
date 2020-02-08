package Exceptions;

public class Main1 {

	public static void main(String[] args) {
		try {
			EntNat entNat = new EntNat(-5);
		} catch (ErrConst e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
