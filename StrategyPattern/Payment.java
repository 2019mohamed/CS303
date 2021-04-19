
public class Payment {
	
	private float amount;
	private IauthorizeBehavior authorizeBehavior;
	private IprintBehavior priBehavior;

	public Payment(float m , IauthorizeBehavior a , IprintBehavior p) {
		this.amount = m;
		this.authorizeBehavior = a;
		this.priBehavior = p;
	}
	
	/*
	 * for test only
	public void get_auth () {
		 this.authorizeBehavior.authorized();
	}
	
	public void get_print () {
		 this.priBehavior.printReceipt();
	}
	*/

}
