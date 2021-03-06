/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package www.w3.org.time;

import saref.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


import www.w3.org.time.GeneralDateTimeDescription;
import www.w3.org.time.TemporalPosition;
import www.w3.org.owl.IThing;
	


public  class DateTimeDescription implements IDateTimeDescription {

	IRI newInstance;
	
	public DateTimeDescription(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#DateTimeDescription"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public void setMonth(XMLGregorianCalendar param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#month"), GLOBAL.factory.createLiteral(param));
	}
			
	public void setDay(XMLGregorianCalendar param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#day"), GLOBAL.factory.createLiteral(param));
	}
			
	public void setYear(XMLGregorianCalendar param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#year"), GLOBAL.factory.createLiteral(param));
	}
			
	public void setDay_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#day"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setDayofyear_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#dayOfYear"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setHour_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#hour"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setWeek_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#week"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setMonth_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#month"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setMinute_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#minute"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setYear_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#year"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setSecond_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#second"), GLOBAL.factory.createLiteral(param));
	}
	
	
	
	public void addMonthofyear_Max1(IThing parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#monthOfYear"), parameter.iri());
	}
			
	public void addUnittype_Exactly1(IThing parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#unitType"), parameter.iri());
	}
			
	public void addTimezone_Max1(IThing parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#timeZone"), parameter.iri());
	}
			
	public void addDayofweek_Max1(IThing parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#dayOfWeek"), parameter.iri());
	}
			
	public void addHastrs_Exactly1(IThing parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("http://www.w3.org/2006/time#hasTRS"), parameter.iri());
	}
			
}
