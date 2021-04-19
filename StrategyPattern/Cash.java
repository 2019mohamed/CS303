
public class Cash extends Payment {
	
	private float cashTendered;

	public Cash(float c, float m, IauthorizeBehavior a, IprintBehavior p) {
		super(m, a, p);
		this.cashTendered = c;
		// TODO Auto-generated constructor stub
	}

	

}
