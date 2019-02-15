package business.service;

import javax.inject.Inject;

import persist.domain.Classroom;
import persist.domain.Trainee;
import persist.repo.ClassroomRepo;

public class ClassroomService implements ServiceImpl{
	
	@Inject
	private ClassroomRepo repo;

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String updateClassroom(Classroom room, String name) {
		return repo.updateClassroom(room, name);
	}

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

	public String makeClassroom(String classroom) {
		return repo.makeClassroom(classroom);
	}

	@Override
	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	@Override
	public String delTrainee(Long id) {
		return repo.delTrainee(id);
	}

	@Override
	public String addTrainee(Classroom room, String name) {
		return repo.addTrainee(room, name);
	}

}
