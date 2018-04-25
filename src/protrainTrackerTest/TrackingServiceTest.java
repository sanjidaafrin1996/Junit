package protrainTrackerTest;

import org.junit.Test;

import com.simpleprogrammer.proteintracker.TrackingService;
import static org.junit.Assert.*;

public class TrackingServiceTest {
	
	@	Test
	public void TrackingTest(){
		TrackingService service =new TrackingService();
		assertEquals("Tracking service total is not zero", 0 ,service.getTotal());
	}

}
