package ar.com.jalmeyda;

import ar.com.jalmeyda.api.ApiClient;
import ar.com.jalmeyda.model.Location;
import ar.com.jalmeyda.file.FileGenerator;

import java.util.List;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class Application {

	public static void main(String[] args) {
		if (args.length != 1) {
			throw new RuntimeException("Wrong number of arguments");
		}
		String cityName = args[0];
		List<Location> locations = new ApiClient().getLocations(cityName);
		new FileGenerator().generateFile(cityName, locations);
	}
}
