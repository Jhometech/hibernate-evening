package in.javahome.hibernate.inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name="TXN_ID")
@Entity	
public class ChequePayment extends CashPayment {
	@Column(name = "CHEQUE_NO")
	private String chequeNo;

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

}
