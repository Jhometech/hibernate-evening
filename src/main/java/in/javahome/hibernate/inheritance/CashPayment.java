package in.javahome.hibernate.inheritance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENTS")
@Inheritance(strategy = InheritanceType.JOINED)
public class CashPayment implements Serializable {
	@Id
	@GeneratedValue
	private Integer txnId;
	@Column(name = "AMOUNT")
	private Double amount;

	public Integer getTxnId() {
		return txnId;
	}

	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
