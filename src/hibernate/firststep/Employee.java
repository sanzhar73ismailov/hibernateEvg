package hibernate.firststep;

/*
CREATE TABLE `emp` (
`ID` int NOT NULL AUTO_INCREMENT,
`FIRST_NAME` varchar(50) NOT NULL,
`LAST_NAME` varchar(50) NOT NULL,
PRIMARY KEY (`ID`)
);
 */
public class Employee {

	private int id;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
