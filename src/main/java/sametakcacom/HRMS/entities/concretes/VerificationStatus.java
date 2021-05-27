package sametakcacom.HRMS.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="verification_status")
@AllArgsConstructor
@NoArgsConstructor
public class VerificationStatus {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="email_verification")
	private boolean emailVerification;
	
	@Column(name="system_verification")
	private boolean systemVerification;
	
	@Column(name="mernis_verification")
	private boolean mernisVerification;
	
	 
	
}
