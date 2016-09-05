package ar.com.jalmeyda.api;

import ar.com.jalmeyda.model.Location;
import ar.com.jalmeyda.model.builder.LocationBuilder;
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
		// GIVEN
		String berlin = "Berlin";

		// WHEN
		List<Location> locations = new ApiClient().getLocations(berlin);

		// THEN
		Assert.assertTrue(locations.contains(getBerlinLocation()));
	}

	@Test
	public void testGetUnknownCity() {
		// GIVEN
		String unknownCity = "unknownCity";

		// WHEN
		List<Location> locations = new ApiClient().getLocations(unknownCity);

		// THEN
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
