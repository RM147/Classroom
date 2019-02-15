package persist.repo;

import persist.domain.Classroom;

public interface ClassroomRepo {
	
	String getAllTrainees();
	String getATrainee(Long id);
	String updateTrainee(Long id, String name);
	String deleteTrainee(Long id);
	String addTrainee(Classroom room, String name);

}
