package persist.repo;

import persist.domain.Classroom;

public interface ClassroomRepo {
	
	String getAllClassrooms();
	String updateClassroom();
	String deleteClassroom();
	String makeClassroom(String classroom);
	

}
