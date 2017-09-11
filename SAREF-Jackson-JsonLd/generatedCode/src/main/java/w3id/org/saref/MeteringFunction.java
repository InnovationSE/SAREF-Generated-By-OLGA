/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package w3id.org.saref;

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

import w3id.org.saref.IGetCurrentMeterValueCommand;  
import w3id.org.saref.IGetMeterDataCommand;  
import w3id.org.saref.IGetMeterHistoryCommand;  
import w3id.org.saref.IProperty;  
import w3id.org.saref.ICommodity;  
import w3id.org.saref.IMeasurement;  
import w3id.org.saref.Function;


import w3id.org.saref.ICommand;




public  class MeteringFunction implements IMeteringFunction {

	Map<String, List<RefId>> relations;
	
	public MeteringFunction(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		hasCommandOnlyGetCurrentMeterValueCommand = new ArrayList<>();
		hasCommandOnlyGetMeterDataCommand = new ArrayList<>();
		hasCommandOnlyGetMeterHistoryCommand = new ArrayList<>();
		hasMeterReadingTypeOnlyProperty = new ArrayList<>();
		hasMeterReadingTypeOnlyCommodity = new ArrayList<>();
		hasMeterReadingOnlyMeasurement = new ArrayList<>();
		hasCommandMinCommand = new ArrayList<>();
		
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
		return "https://w3id.org/saref#MeteringFunction";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand") 
	private List<RefId> hasCommandOnlyGetCurrentMeterValueCommand;
	public void addhasCommandOnly(IGetCurrentMeterValueCommand parameter)
	{
		hasCommandOnlyGetCurrentMeterValueCommand.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand") 
	private List<RefId> hasCommandOnlyGetMeterDataCommand;
	public void addhasCommandOnly(IGetMeterDataCommand parameter)
	{
		hasCommandOnlyGetMeterDataCommand.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand") 
	private List<RefId> hasCommandOnlyGetMeterHistoryCommand;
	public void addhasCommandOnly(IGetMeterHistoryCommand parameter)
	{
		hasCommandOnlyGetMeterHistoryCommand.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasMeterReadingType") 
	private List<RefId> hasMeterReadingTypeOnlyProperty;
	public void addhasMeterReadingTypeOnly(IProperty parameter)
	{
		hasMeterReadingTypeOnlyProperty.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasMeterReadingType") 
	private List<RefId> hasMeterReadingTypeOnlyCommodity;
	public void addhasMeterReadingTypeOnly(ICommodity parameter)
	{
		hasMeterReadingTypeOnlyCommodity.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasMeterReading") 
	private List<RefId> hasMeterReadingOnlyMeasurement;
	public void addhasMeterReadingOnly(IMeasurement parameter)
	{
		hasMeterReadingOnlyMeasurement.add(parameter.getRefId());
	}
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand")
	private List<RefId> hasCommandMinCommand;
	public void addhasCommandMin1(ICommand parameter)
	{
		hasCommandMinCommand.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasCommand")
	public List<RefId> gethasCommandCommand()
	{
		return hasCommandMinCommand;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasMeterReadingType")
	public List<RefId> gethasMeterReadingTypeProperty()
	{
		return hasMeterReadingTypeOnlyProperty;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasMeterReadingType")
	public List<RefId> gethasMeterReadingTypeCommodity()
	{
		return hasMeterReadingTypeOnlyCommodity;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasMeterReading")
	public List<RefId> gethasMeterReadingMeasurement()
	{
		return hasMeterReadingOnlyMeasurement;
	}
	
}
