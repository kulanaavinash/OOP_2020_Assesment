package MidAssesment;

abstract public class User {
	protected String name;
	protected String email;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	abstract public void printDetails();
}
