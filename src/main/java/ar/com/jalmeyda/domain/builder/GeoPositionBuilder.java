package ar.com.jalmeyda.domain.builder;

import ar.com.jalmeyda.domain.GeoPosition;

import java.math.BigDecimal;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
class GeoPositionBuilder {

	private BigDecimal latitude;
	private BigDecimal longitude;

	public GeoPosition build() {
		GeoPosition instance = new GeoPosition();
		instance.setLatitude(latitude);
		instance.setLongitude(longitude);
		return instance;
	}

	public GeoPositionBuilder withLatitude(BigDecimal latitude) {
		this.latitude = latitude;
		return this;
	}

	public GeoPositionBuilder withLongitude(BigDecimal longitude) {
		this.longitude = longitude;
		return this;
	}
}
