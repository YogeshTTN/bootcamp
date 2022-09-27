public class Q5 {

	private String firstname;
	private String lastname;
	private String age;
	private String designation;

	public Q5(String firstname, String lastname, String age, String designation) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.designation = designation;
	}

	public String get_firstname() {
		return firstname;
	}

	public void set_firstName(String firstname) {
		this.firstname = firstname;
	}

	public String get_lastname() {
		return lastname;
	}

	public void set_lastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String get_designation() {
		return designation;
	}

	public void set_designation(String designation) {
		this.designation = designation;
	}

	public static void main(String[] args) {
		Q5 Emp = new Q5("Yogesh", "Patwal", "22", "Quality Engineer");
		String firstname = Emp.get_firstname();
		String lastname = Emp.get_lastname();
		String age = Emp.getAge();
		String designation = Emp.get_designation();

		System.out.println("Employee's FirstName: " + firstname);
		System.out.println("Employee's LastName: " + lastname);
		System.out.println("Employee's Age: " + age);
		System.out.println("Employee's Designation: " + designation);
	}

}
