package ar.com.jalmeyda.file;

import ar.com.jalmeyda.model.Location;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class FileLine {

	private Location location;

	public FileLine(Location location) {
		this.location = location;
	}

	public String generateLine() {
		return new StringBuilder().append(location.get_id())
		                          .append(",")
		                          .append(location.getName())
		                          .append(",")
		                          .append(location.getType())
		                          .append(",")
		                          .append(location.getGeo_position().getLatitude())
		                          .append(",")
		                          .append(location.getGeo_position().getLongitude())
		                          .toString();
	}
}
