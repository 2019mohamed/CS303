
public class Check extends Payment{

	private String name;
	private String bankID;
	
	public Check(String n, String b, float m, IauthorizeBehavior a, IprintBehavior p) {
		super(m, a, p);
		this.name = n;
		this.bankID = b;
	}



}
