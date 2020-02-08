package Exceptions;

public class EntNat {
	int N;

	public EntNat(int N) throws ErrConst{
		if(N<0) throw new ErrConst("Nombre negative");
		this.N = N;
	}

	public int getN() {
		return N;
	}
	
	public static int somme(int a, int b) throws ErrSom {
		if(a+b<0) throw new ErrSom("Somme Plus grand");
		return a+b;
	}
	public static int difference(int a, int b) throws ErrDiff{
		if(a-b<0 && a>b) throw new ErrDiff("difference plus grand");
		return a-b;
	}
	public static int produit(int a, int b) throws ErrProd {
		if(a*b<0) throw new ErrProd("produit plus grand");
		return a*b;
	}
}
