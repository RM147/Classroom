package rest.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import business.service.ClassroomService;
import business.service.ServiceImpl;
import rest.ClassroomPaths;

@RunWith(MockitoJUnitRunner.class)
public class PathsTest {
	
	private static final String MOCK_VALUE = "test_value";
	private static final String MOCK_VALUE2 = "test_value2";
	
	@InjectMocks
	private ClassroomPaths endpoint;
	
	@Mock
	private ClassroomService service;
	
	@Before
	public void setup() {
		endpoint.setService(service);
	}
	
	@Test
	public void testAllTrainees() {
		Mockito.when(service.getAllTrainees()).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAllTrainees());
	}
	
	@Test
	public void testAllRooms() {
		Mockito.when(service.getAllClassrooms()).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAllClassrooms());
	}
	
	@Test
	public void testDelAccounts() {
		Mockito.when(service.deleteClassroom(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.deleteClassroom(1L));
	}
	
	@Test
	public void testCreateAccounts() {
		Mockito.when(service.makeClassroom(MOCK_VALUE2)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.makeClassroom(MOCK_VALUE2));
	}

}
