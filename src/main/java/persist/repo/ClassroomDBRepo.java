package persist.repo;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.io.IOException;
import java.lang.reflect.Array;
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

	@Transactional(REQUIRED)
	public String addTrainee(Classroom room, String name) {
		Trainee aTrainee =  new Trainee("Josh");
		System.out.println(util.getJSONForObject(aTrainee));
		//Trainee aTrainee = util.getObjectForJSON(name, Trainee.class);
		//room.getTrainees().add(aTrainee);
		return aTrainee.getTraineeName() + " has been added.";
	}

	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getATrainee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateTrainee(Long id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteTrainee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
