package persist.repo;

import persist.domain.Classroom;

public interface ClassroomRepo {
	
	String getAllClassrooms();
	String updateClassroom(Classroom room, String name);
	String deleteClassroom(Long id);
	String makeClassroom(String classroom);
	String getAllTrainees();
	

}
