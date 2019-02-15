package persist.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Trainee {

	private Long traineeID;
	private String traineeName;
	@ManyToOne
	@JoinColumn(name = "classroomID")
	private Classroom classroom;
	
	public Trainee() {
		
	}
	
	public Trainee(String name) {
		this.traineeName = name;
	}

	public Long getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}
