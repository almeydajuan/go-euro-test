package ar.com.jalmeyda.domain;

import java.io.Serializable;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class Location implements Serializable {

	private Long _id;
	private String name;
	private String type;
	private GeoPosition geo_position;

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GeoPosition getGeo_position() {
		return geo_position;
	}

	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Location)) return false;

		Location location = (Location) o;

		if (!get_id().equals(location.get_id())) return false;
		if (!getName().equals(location.getName())) return false;
		if (!getType().equals(location.getType())) return false;
		return getGeo_position().equals(location.getGeo_position());
	}

	@Override
	public int hashCode() {
		int result = get_id().hashCode();
		result = 31 * result + getName().hashCode();
		result = 31 * result + getType().hashCode();
		result = 31 * result + getGeo_position().hashCode();
		return result;
	}
}
