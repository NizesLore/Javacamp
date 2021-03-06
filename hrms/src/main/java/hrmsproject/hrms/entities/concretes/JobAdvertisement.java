package hrmsproject.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	/*@Column(name="employer_id")
	private int employerId;
	
	@Column(name="job_positiion_id")
	private int jobPositionId;
	
	@Column(name="city_id")
	private int cityId;*/
	
	@Column(name="job_definiton")
	private String jobDefiniton;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="created_date")
	private LocalDateTime createdDate=LocalDateTime.now();
	
	@Column(name="updated_date")
	private LocalDateTime updatedDate;
	
	@Column(name="is_activated")
	private boolean  isActivated;
	
	@Column(name="is_deleted")
	private boolean isDeleted;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	

}
