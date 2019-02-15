package persist.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	
	private static final String MOCK_OBJECT = "{\"trainer\":\"Alice\"}";
	private static final String MOCK_ARRAY = "[{\"trainer\":\"Alice\"}]";
	
	@Before
	public void setup() {
		repo.setManager(manager);
		util = new JSONUtil();
		repo.setUtil(util);
	}
	
	@Test
	public void testCreateMovie() {
		String reply = repo.makeClassroom(MOCK_OBJECT);
		Assert.assertEquals(reply, "Classroom made.");
	}
	
	@Test
	public void getAllTest() {
		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
		List<Classroom> rooms = new ArrayList<Classroom>();
		rooms.add(new Classroom("Alice"));
		Mockito.when(query.getResultList()).thenReturn(rooms);
		Assert.assertEquals(MOCK_ARRAY, repo.getAllClassrooms());	
		
	}
	
	@Test
	public void testDeleteRoom() {
		String reply = repo.deleteClassroom(1L);
		Assert.assertEquals(reply, "{\"message\": \"movie sucessfully deleted\"}");
	}

}
