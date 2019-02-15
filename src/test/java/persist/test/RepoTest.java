package persist.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import persist.domain.Classroom;
import persist.domain.Trainee;
import persist.repo.ClassroomDBRepo;
import util.JSONUtil;

@RunWith(MockitoJUnitRunner.class)
public class RepoTest {
	
	@InjectMocks
	private ClassroomDBRepo repo;
	
	@Mock
	private EntityManager manager;
	@Mock
	private Query query;
	
	private JSONUtil util;
	
	@Before
	public void setup() {
		repo.setManager(manager);
		util = new JSONUtil();
		repo.setUtil(util);
	}
	
	@Test
	public void addTraineeTest() {
		Classroom room = new Classroom("Jenny");
		assertEquals("Josh has been added", repo.addTrainee(room, "Josh"));
		
	}

}
