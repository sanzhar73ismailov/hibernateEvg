package hibernate.perHierarchyAnnot;

import javax.persistence.*;

@Entity
@Table(name="reg_emp_annot")
@DiscriminatorValue("reg_emp")
public class RegularEmployee extends Emp {
	@Column
	private float salary;
	@Column
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
