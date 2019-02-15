package persist.repo;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import business.service.ClassroomService;
import persist.domain.Classroom;
import persist.domain.Trainee;
import util.JSONUtil;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepo implements ClassroomRepo {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	public String makeClassroom(String classroom) {
		Classroom room = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(room);
		return "Classroom made.";
	}

	public String getAllClassrooms() {
		Query query = manager.createQuery("Select c FROM Classroom c");
		Collection<Classroom> movies = (Collection<Classroom>) query.getResultList();

		return util.getJSONForObject(movies);
	}

	public String updateClassroom(Classroom room, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteClassroom(Long id) {
		
		if (manager.contains(manager.find(Classroom.class, id))) {
			
			manager.remove(manager.find(Classroom.class, id));
			return "{\"message\": \"classroom sucessfully deleted\"}";
		}
		return "Classroom could not be deleted";
	}

	@Override
	public String getAllTrainees() {
		Query query = manager.createQuery("Select t FROM Trainee t");
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();

		return util.getJSONForObject(trainees);
	}

	@Override
	public String delTrainee(Long id) {
if (manager.contains(manager.find(Trainee.class, id))) {
			
			manager.remove(manager.find(Trainee.class, id));
			return "{\"message\": \"trainee sucessfully deleted\"}";
		}
		return "Trainee could not be deleted";
	}

}
