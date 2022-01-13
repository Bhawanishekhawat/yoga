package online.classes.yoga.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "yoga_user")
public class YogaUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Long id;
	@NotNull(message = "{firstName}")
	@Column(name="First_Name")
	private String firstName;
	@NotNull(message = "{lastName}")
	@Column(name="Last_Name")
	private String lastName;
	@NotNull(message = "{email_id}")
	@Column(name="Email_id")
	@Email(message = "{email}")
	private String email;
	@NotNull(message = "{mobileNo}")
	@Column(name="Mobile_Number")
	@Digits(integer = 10, fraction = 0, message = "{MobileNo}")
	@Min(value = 1000000000, message = "{MobileNo}")
	private Long mobileNo;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name="Date_Of_Birth")
	@JsonFormat(pattern = "dd-mm-yyyy")
	private  Date dateOfBirth;
	@Enumerated(EnumType.STRING)
	private SchedulePreference schedulePreference;
	@Enumerated(EnumType.STRING)
	private ClassLevel classLevel;
	@Enumerated(EnumType.STRING)
	private SessionPackages sessionPackages;

}
