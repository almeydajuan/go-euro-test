package ar.com.jalmeyda.api;

import ar.com.jalmeyda.model.Location;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class ApiClient {

	public static final String URL = "http://api.goeuro.com/api/v2/position/suggest/en/{cityName}";
	private RestTemplate restTemplate;

	public ApiClient() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(objectMapper);

		restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(converter);
	}

	public List<Location> getLocations(String cityName) {
		return Arrays.asList(restTemplate.getForEntity(URL, Location[].class, cityName).getBody());
	}
}
