package com.schneider.example.rdf4j.saref;


import java.util.Date;

import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

import saref.global.util.GLOBAL;
import w3id.org.saref.IDevice;
import w3id.org.saref.IMeasurement;
import w3id.org.saref.IProperty;
import w3id.org.saref.ITemperature;
import w3id.org.saref.ITemperatureSensor;
import w3id.org.saref.ITemperatureUnit;
import w3id.org.saref.IUnitOfMeasure;
import w3id.org.saref.Measurement;
import w3id.org.saref.Temperature;
import w3id.org.saref.TemperatureSensor;
import w3id.org.saref.TemperatureUnit;


public class SAREFRDF4UsageExample {

	public static void main(String[] args) {
		
		String ns = "http://w3id/saref/instance/example#";
		
		ITemperatureUnit temperatureUnit = new TemperatureUnit(ns, "degree_Celsius");
		IMeasurement indoorTemperature = new Measurement(ns, "2");
        indoorTemperature.addIsmeasuredin_Only((IUnitOfMeasure) temperatureUnit);
        ((Measurement)indoorTemperature).setHasvalue(32.5f);
        ((Measurement)indoorTemperature).setHastimestamp(new Date());
        
        ITemperature temperature = new Temperature(ns, "3");
        ((IProperty)temperature).addRelatestomeasurement_Only((Measurement)indoorTemperature);
        
        ITemperatureSensor  temperatureSensor  = new TemperatureSensor(ns, "4");
        ((TemperatureSensor)temperatureSensor).setHasmanufacturer_String("CompanyA");
        ((TemperatureSensor)temperatureSensor).setHasmodel_String("M321");
        ((TemperatureSensor)temperatureSensor).setHasdescription_String("Low range Zigee temperature sensor");
        ((IDevice)temperatureSensor).addMakesmeasurement_Only((IMeasurement)indoorTemperature);
        
        Rio.write(GLOBAL.model, System.out, RDFFormat.TURTLE);
	}
	
}
