package hrmsproject.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="activation_codes")
public class ActivationCode {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="activation_code")
	private String activationCode;
	
	@Column(name="activation_date")
	private LocalDateTime activationDate;
	
	@Column(name="expiration_date")
	private LocalDateTime expirationDate;
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="is_deleted")
	private boolean isDeleted;

}
