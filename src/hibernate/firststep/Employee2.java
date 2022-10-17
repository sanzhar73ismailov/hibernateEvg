package hibernate.firststep;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
CREATE TABLE `emp` (
`ID` int NOT NULL AUTO_INCREMENT,
`FIRST_NAME` varchar(50) NOT NULL,
`LAST_NAME` varchar(50) NOT NULL,
PRIMARY KEY (`ID`)
);
 */

@Entity  
@Table(name= "empeug2")   
public class Employee2 {
	@Id 
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;

	public Employee2() {
		super();
	}

	public Employee2(int id, String firstName, String lastName) {
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
