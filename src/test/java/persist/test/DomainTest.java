package persist.test;

import static org.junit.Assert.*;

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

@RunWith(MockitoJUnitRunner.class)
public class DomainTest {
	
	@Test
	public void roomTest() {
		Classroom room = new Classroom();
		Classroom test = new Classroom("Matt");
		room.setTrainer("Matt");
		assertEquals(room.getTrainer(),test.getTrainer());
	}
	
	@Test
	public void traineeTest() {
		Trainee room = new Trainee();
		Classroom test = new Classroom("Matt");
		room.setTraineeName("Matt");
		assertEquals(room.getTraineeName(),test.getTrainer());
	}
	
	

}
