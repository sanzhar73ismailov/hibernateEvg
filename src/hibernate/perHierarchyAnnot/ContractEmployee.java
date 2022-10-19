package hibernate.perHierarchyAnnot;

import javax.persistence.*;

@Entity
@Table(name = "cont_emp")
@DiscriminatorValue("con_emp")
public class ContractEmployee extends Emp {

	@Column(name = "pay_per_hour")
	private float payPerHour;

	@Column(name = "contract_duration")
	private String contractDuration;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

}
