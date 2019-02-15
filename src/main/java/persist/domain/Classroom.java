package persist.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomID;

	private String trainer;

	//@OneToMany(mappedBy = "ClassroomID", fetch = FetchType.EAGER)
	//private List<Trainee> trainees;

	public Classroom() {

	}

	public Classroom(String trainer) {
		this.trainer = trainer;
	}

	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

//	public List<Trainee> getTrainees() {
//		return trainees;
//	}
//
//	public void setTrainees(List<Trainee> trainees) {
//		this.trainees = trainees;
//	}

}
