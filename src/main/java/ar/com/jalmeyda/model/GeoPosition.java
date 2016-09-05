package ar.com.jalmeyda.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class GeoPosition implements Serializable {

	private BigDecimal latitude;
	private BigDecimal longitude;

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GeoPosition)) return false;

		GeoPosition that = (GeoPosition) o;

		if (!getLatitude().equals(that.getLatitude())) return false;
		return getLongitude().equals(that.getLongitude());
	}

	@Override
	public int hashCode() {
		int result = getLatitude().hashCode();
		result = 31 * result + getLongitude().hashCode();
		return result;
	}
}
