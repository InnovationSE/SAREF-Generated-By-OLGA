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
	
	
	static JsonldResource _sarefOntologyInstance = null;
	
	public static void main(String[] args) throws FileNotFoundException {

		List listOfOntologyInstances = create_SAREF_Instances();
        
        JsonldGraphBuilder builder =  JsonldGraph.Builder.create();
         _sarefOntologyInstance = builder.build(listOfOntologyInstances);
         
        String saref = new File(".").getAbsolutePath() + "/src/main/resources/saref.jsonld";
         
        File jsonLD_File = new File(saref);
 		OutputStream outputStream = new FileOutputStream(jsonLD_File);
 		JsonldModule jsonldModule = new JsonldModule();
 		ObjectMapper objectMapper = new ObjectMapper();

 		try {
 			objectMapper.registerModule(jsonldModule);
 			objectMapper.writer().writeValue(outputStream, _sarefOntologyInstance);

 		} catch (JsonGenerationException e) {
 			e.printStackTrace();
 		} catch (JsonMappingException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 	}
	
	private static List create_SAREF_Instances()
	{
		//TemperatureUnit
		ITemperatureUnit temperatureUnit = new TemperatureUnit("degree_Celsius");

		//Measurement
		IMeasurement indoorTemperature = new Measurement("1");
        indoorTemperature.addisMeasuredInOnly((IUnitOfMeasure) temperatureUnit);
        ((Measurement)indoorTemperature).hasValue = 32.5f;
        ((Measurement)indoorTemperature).hasTimestamp = Calendar.getInstance();
        
        //Temperature
        ITemperature temperature = new Temperature("2");
        ((IProperty)temperature).addrelatesToMeasurementOnly((Measurement)indoorTemperature);
        
        //Temperature Sensor
        ITemperatureSensor  temperatureSensor  = new TemperatureSensor("3");
        ((TemperatureSensor)temperatureSensor).hasManufacturer_String = "CompanyA";
        ((TemperatureSensor)temperatureSensor).hasModel_String = "M321";
        ((TemperatureSensor)temperatureSensor).hasDescription_String = "Low range Zigee temperature sensor";
        ((IDevice)temperatureSensor).addmakesMeasurementOnly((IMeasurement)indoorTemperature);
        
        List ontElements = new ArrayList();
        //Add the created instances to the list of ontology elements
        ontElements.add(indoorTemperature);
        ontElements.add(temperature);
        ontElements.add(temperatureSensor);
        
        return ontElements;
	}
       
	}
