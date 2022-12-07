package uz.pdp.blogpost.backend.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseConfiguration {


	private static Properties load(){

		Properties properties=new Properties();


		try {
			FileReader fileReader=new FileReader("src/main/resources/application.properties");

			properties.load(fileReader);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return  properties;

	}
}
