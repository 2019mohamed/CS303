
public class Credit extends Payment {

	private String name;
	private String type;
	private String expDate;
	public Credit(String n, String t , String e, float m, IauthorizeBehavior a, IprintBehavior p) {
		super(m, a, p);
		this.name = n;
		this.type= t;
		this.expDate = e;
	}
	

}
