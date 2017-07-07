package com.schneider.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ioinformarics.oss.jackson.module.jsonld.JsonldGraph;
import ioinformarics.oss.jackson.module.jsonld.JsonldGraphBuilder;
import ioinformarics.oss.jackson.module.jsonld.JsonldModule;
import ioinformarics.oss.jackson.module.jsonld.JsonldResource;
import w3id.org.saref.*;

public class Program {
	
	public static List ontElements = new ArrayList();
	static JsonldResource _header = null;
	
	public static void main(String[] args) throws FileNotFoundException {

		ITemperatureUnit temperatureUnit = new TemperatureUnit("degree_Celsius");

		IMeasurement indoorTemperature = new Measurement("555");
        indoorTemperature.addisMeasuredInOnly((IUnitOfMeasure) temperatureUnit);
        ((Measurement)indoorTemperature).hasValue = 32.5f;
        ((Measurement)indoorTemperature).hasTimestamp = Calendar.getInstance();
        
        ITemperature temperature = new Temperature("abc");
        ((IProperty)temperature).addrelatesToMeasurementOnly((Measurement)indoorTemperature);
        
        ITemperatureSensor  temperatureSensor  = new TemperatureSensor("111");
        ((TemperatureSensor)temperatureSensor).hasManufacturer_String = "CompanyA";
        ((TemperatureSensor)temperatureSensor).hasModel_String = "M321";
        ((TemperatureSensor)temperatureSensor).hasDescription_String = "Low range Zigee temperature sensor";
        ((IDevice)temperatureSensor).addmakesMeasurementOnly((IMeasurement)indoorTemperature);
        
        ontElements.add(indoorTemperature);
        ontElements.add(temperature);
        ontElements.add(temperatureSensor);
        
        JsonldGraphBuilder builder =  JsonldGraph.Builder.create();
         _header = builder.build(ontElements);
         
        String saref = new File(".").getAbsolutePath() + "/src/main/resources/saref.json";
         
        File jsonLD_File = new File(saref);
 		OutputStream outputStream = new FileOutputStream(jsonLD_File);
 		JsonldModule jsonldModule = new JsonldModule();
 		ObjectMapper objectMapper = new ObjectMapper();

 		try {
 			objectMapper.registerModule(jsonldModule);
 			objectMapper.writer().writeValue(outputStream, _header);

 		} catch (JsonGenerationException e) {
 			e.printStackTrace();
 		} catch (JsonMappingException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 	}
       
	}
