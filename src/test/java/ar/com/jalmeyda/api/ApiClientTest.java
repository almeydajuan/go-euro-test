package ar.com.jalmeyda.api;

import ar.com.jalmeyda.domain.Location;
import ar.com.jalmeyda.domain.builder.LocationBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class ApiClientTest {

	@Test
	public void testGetBerlin() {
		String berlin = "Berlin";
		List<Location> locations = new ApiClient().getLocations(berlin);

		Assert.assertTrue(locations.contains(getBerlinLocation()));
	}

	@Test
	public void testGetUnknownCity() {
		String unknownCity = "unknownCity";
		List<Location> locations = new ApiClient().getLocations(unknownCity);

		Assert.assertTrue(locations.isEmpty());
	}

	private Location getBerlinLocation() {
		return new LocationBuilder()
				.with_id(376217L)
				.withName("Berlin")
				.withType("location")
				.withLatitude(new BigDecimal("52.52437"))
				.withLongitude(new BigDecimal("13.41053"))
				.build();
	}
}
