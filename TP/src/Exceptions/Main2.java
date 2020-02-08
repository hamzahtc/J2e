package Exceptions;

public class Main2 {

	public static void main(String[] args) {
		 try {
			EntNat entNat = new EntNat(5);
			System.out.println(EntNat.somme(5, 10));
			System.out.println(EntNat.difference(5, 10));
			System.out.println(EntNat.produit(5, 10));

		} catch (ErrNat e) {
			// TODO Auto-generated catch block
		
				System.err.println(e.getMessage());
			}
			 
	}

}
