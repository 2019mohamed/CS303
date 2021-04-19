
public class Main {

	public static void main(String[] args) {
		
		AuthorizeCredit1 a = new AuthorizeCredit1();
		PrintCashTrans p = new PrintCashTrans();
		Credit c= new Credit("Mohamed" , "Credit1", "San", 55.5f, a, p);
		/*
		c.get_auth();
		c.get_print();
       */
	}

}
