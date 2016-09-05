package ar.com.jalmeyda.file;

import ar.com.jalmeyda.domain.Location;

import java.io.*;
import java.util.List;

/**
 * Created by Juan Almeyda on 9/4/2016.
 */
public class FileGenerator {

	public static final String END_LINE = "\n";

	public void generateFile(String cityName, List<Location> locations) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(cityName + ".csv", "UTF-8");
			for (Location location : locations) {
				writer.write(new FileLine(location).generateLine() + END_LINE);
			}
			if (locations.isEmpty()) {
				writer.write(END_LINE);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			writer.close();
		}
	}
}
