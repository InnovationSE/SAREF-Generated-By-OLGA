/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package www.w3.org.time;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldLink;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldPropertyType;

import saref.jsonld.util.RefId;

import www.w3.org.time.DateTimeDescription;
import www.w3.org.time.GeneralDateTimeDescription;
import www.w3.org.time.TemporalPosition;
import www.w3.org.owl.IThing;
	


public  class MonthOfYear implements IMonthOfYear {

	Map<String, List<RefId>> relations;
	
	public MonthOfYear(String id) {
		super();
		this.id = "http://www.w3.org/2006/time#" + id;
		relations = new HashMap<String, List<RefId>>();
		monthOfYearMaxThing = new ArrayList<>();
		unitTypeExactlyThing = new ArrayList<>();
		timeZoneMaxThing = new ArrayList<>();
		dayOfWeekMaxThing = new ArrayList<>();
		hasTRSExactlyThing = new ArrayList<>();
		
	}

	@JsonldId
	public String id;
	
	@JsonIgnore
	public RefId getRefId()
	{
		return new RefId(id);
	}
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("@type")
	public String getType()
	{
		return "http://www.w3.org/2006/time#MonthOfYear";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#month", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#month")
	public String month;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#month", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#month")
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime month_XSDDateTime;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#day", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#day")
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime day_XSDDateTime;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#year", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#year")
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime year_XSDDateTime;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#day", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#day")
	public String day_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#dayOfYear", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#dayOfYear")
	public String dayOfYear_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#hour", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#hour")
	public String hour_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#week", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#week")
	public String week_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#month", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#month")
	public String month_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#minute", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#minute")
	public String minute_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#year", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#year")
	public String year_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#second", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#second")
	public String second_String;
	
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#monthOfYear") 
	private List<RefId> monthOfYearMaxThing;
	public void addmonthOfYearMax1(IThing parameter)
	{
		monthOfYearMaxThing.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#unitType") 
	private List<RefId> unitTypeExactlyThing;
	public void addunitTypeExactly1(IThing parameter)
	{
		unitTypeExactlyThing.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#timeZone") 
	private List<RefId> timeZoneMaxThing;
	public void addtimeZoneMax1(IThing parameter)
	{
		timeZoneMaxThing.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#dayOfWeek") 
	private List<RefId> dayOfWeekMaxThing;
	public void adddayOfWeekMax1(IThing parameter)
	{
		dayOfWeekMaxThing.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#hasTRS") 
	private List<RefId> hasTRSExactlyThing;
	public void addhasTRSExactly1(IThing parameter)
	{
		hasTRSExactlyThing.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("http://www.w3.org/2006/time#monthOfYear")
	public List<RefId> getmonthOfYearThing()
	{
		return monthOfYearMaxThing;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("http://www.w3.org/2006/time#unitType")
	public List<RefId> getunitTypeThing()
	{
		return unitTypeExactlyThing;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("http://www.w3.org/2006/time#timeZone")
	public List<RefId> gettimeZoneThing()
	{
		return timeZoneMaxThing;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("http://www.w3.org/2006/time#dayOfWeek")
	public List<RefId> getdayOfWeekThing()
	{
		return dayOfWeekMaxThing;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("http://www.w3.org/2006/time#hasTRS")
	public List<RefId> gethasTRSThing()
	{
		return hasTRSExactlyThing;
	}
	
}
