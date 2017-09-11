/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package www.w3.org._2006.time;

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

import www.w3.org._2006.time.GeneralDurationDescription;
import www.w3.org._2006.time.TemporalDuration;


import www.w3.org._2002._07.owl.IThing;


import www.opengis.net.def.uom.ISO_8601._0.Gregorian.Gregorian;


public  class DurationDescription implements IDurationDescription {

	Map<String, List<RefId>> relations;
	
	public DurationDescription(String id) {
		super();
		this.id = "http://www.w3.org/2006/time#" + id;
		relations = new HashMap<String, List<RefId>>();
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
		return "http://www.w3.org/2006/time#DurationDescription";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#hours", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#hours")
	public java.math.BigDecimal hours;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#minutes", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#minutes")
	public java.math.BigDecimal minutes;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#weeks", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#weeks")
	public java.math.BigDecimal weeks;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#seconds", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#seconds")
	public java.math.BigDecimal seconds;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#months", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#months")
	public java.math.BigDecimal months;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#years", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#years")
	public java.math.BigDecimal years;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#days", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#days")
	public java.math.BigDecimal days;
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#seconds", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#seconds")
	public String seconds_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#minutes", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#minutes")
	public String minutes_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#hours", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#hours")
	public String hours_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#months", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#months")
	public String months_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#days", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#days")
	public String days_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#years", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#years")
	public String years_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "http://www.w3.org/2006/time#weeks", type = "owl:DatatypeProperty")
	@JsonProperty("http://www.w3.org/2006/time#weeks")
	public String weeks_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#hasTRS") 
	private List<RefId> hasTRSGregorian;
	public void addhasTRS(Gregorian parameter)
	{
		hasTRSGregorian.add(parameter.getRefId());
	}			
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#hasTRS")
	private List<RefId> hasTRSExactlyThing;
	public void addhasTRSExactly1(IThing parameter)
	{
		hasTRSExactlyThing.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("http://www.w3.org/2006/time#hasTRS")
	public List<RefId> gethasTRSThing()
	{
		return hasTRSExactlyThing;
	}
	
}