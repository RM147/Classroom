package business.service;

import persist.domain.Classroom;

public interface ServiceImpl {
	
	String getAllClassrooms();
	String updateClassroom(Classroom room, String name);
	String deleteClassroom(Long id);
	String makeClassroom(String classroom);
	String getAllTrainees();
	String delTrainee(Long id);

}
