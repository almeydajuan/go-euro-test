package ar.com.jalmeyda.domain.builder;

import ar.com.jalmeyda.domain.GeoPosition;
import ar.com.jalmeyda.domain.Location;

import java.math.BigDecimal;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class LocationBuilder {

	private BigDecimal latitude;
	private BigDecimal longitude;
	private String type;
	private String name;
	private Long _id;

	public Location build() {
		Location instance = new Location();
		instance.setGeo_position(new GeoPositionBuilder().withLatitude(latitude).withLongitude(longitude).build());
		instance.setType(type);
		instance.setName(name);
		instance.set_id(_id);
		return instance;
	}

	public LocationBuilder withLatitude(BigDecimal latitude) {
		this.latitude = latitude;
		return this;
	}

	public LocationBuilder withLongitude(BigDecimal longitude) {
		this.longitude = longitude;
		return this;
	}

	public LocationBuilder withType(String type) {
		this.type = type;
		return this;
	}

	public LocationBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public LocationBuilder with_id(Long _id) {
		this._id = _id;
		return this;
	}
}
