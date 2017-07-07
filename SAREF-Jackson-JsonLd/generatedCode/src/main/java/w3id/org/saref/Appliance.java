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

import w3id.org.saref.FunctionRelated;
import w3id.org.saref.Device;
import w3id.org.saref.IService;
import w3id.org.saref.IDevice;
import w3id.org.saref.IProperty;
import w3id.org.saref.IPower;
import w3id.org.saref.IEnergy;
import w3id.org.saref.ITask;
import w3id.org.saref.IState;
import w3id.org.saref.IMeasurement;
import w3id.org.saref.ICommodity;
import w3id.org.saref.IFunction;
import w3id.org.saref.IProfile;
	


public  class Appliance implements IAppliance {

	Map<String, List<RefId>> relations;
	
	public Appliance(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		offersOnlyService = new ArrayList<>();
		consistsOfOnlyDevice = new ArrayList<>();
		measuresPropertyOnlyProperty = new ArrayList<>();
		hasTypicalConsumptionOnlyPower = new ArrayList<>();
		hasTypicalConsumptionOnlyEnergy = new ArrayList<>();
		accomplishesMinTask = new ArrayList<>();
		controlsPropertyOnlyProperty = new ArrayList<>();
		hasStateOnlyState = new ArrayList<>();
		makesMeasurementOnlyMeasurement = new ArrayList<>();
		isUsedForOnlyCommodity = new ArrayList<>();
		hasFunctionMinFunction = new ArrayList<>();
		hasProfileOnlyProfile = new ArrayList<>();
		
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
		return "https://w3id.org/saref#Appliance";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "https://w3id.org/saref#hasDescription", type = "owl:DatatypeProperty")
	@JsonProperty("https://w3id.org/saref#hasDescription")
	public String hasDescription_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "https://w3id.org/saref#hasManufacturer", type = "owl:DatatypeProperty")
	@JsonProperty("https://w3id.org/saref#hasManufacturer")
	public String hasManufacturer_String;
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "https://w3id.org/saref#hasModel", type = "owl:DatatypeProperty")
	@JsonProperty("https://w3id.org/saref#hasModel")
	public String hasModel_String;
	
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#offers") 
	private List<RefId> offersOnlyService;
	public void addoffersOnly(IService parameter)
	{
		offersOnlyService.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#consistsOf") 
	private List<RefId> consistsOfOnlyDevice;
	public void addconsistsOfOnly(IDevice parameter)
	{
		consistsOfOnlyDevice.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#measuresProperty") 
	private List<RefId> measuresPropertyOnlyProperty;
	public void addmeasuresPropertyOnly(IProperty parameter)
	{
		measuresPropertyOnlyProperty.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasTypicalConsumption") 
	private List<RefId> hasTypicalConsumptionOnlyPower;
	public void addhasTypicalConsumptionOnly(IPower parameter)
	{
		hasTypicalConsumptionOnlyPower.add(parameter.getRefId());
	}
			
	private List<RefId> hasTypicalConsumptionOnlyEnergy;
	public void addhasTypicalConsumptionOnly(IEnergy parameter)
	{
		hasTypicalConsumptionOnlyEnergy.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#accomplishes") 
	private List<RefId> accomplishesMinTask;
	public void addaccomplishesMin1(ITask parameter)
	{
		accomplishesMinTask.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#controlsProperty") 
	private List<RefId> controlsPropertyOnlyProperty;
	public void addcontrolsPropertyOnly(IProperty parameter)
	{
		controlsPropertyOnlyProperty.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasState") 
	private List<RefId> hasStateOnlyState;
	public void addhasStateOnly(IState parameter)
	{
		hasStateOnlyState.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#makesMeasurement") 
	private List<RefId> makesMeasurementOnlyMeasurement;
	public void addmakesMeasurementOnly(IMeasurement parameter)
	{
		makesMeasurementOnlyMeasurement.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isUsedFor") 
	private List<RefId> isUsedForOnlyCommodity;
	public void addisUsedForOnly(ICommodity parameter)
	{
		isUsedForOnlyCommodity.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasFunction") 
	private List<RefId> hasFunctionMinFunction;
	public void addhasFunctionMin1(IFunction parameter)
	{
		hasFunctionMinFunction.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasProfile") 
	private List<RefId> hasProfileOnlyProfile;
	public void addhasProfileOnly(IProfile parameter)
	{
		hasProfileOnlyProfile.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#offers")
	public List<RefId> getoffersService()
	{
		return offersOnlyService;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#consistsOf")
	public List<RefId> getconsistsOfDevice()
	{
		return consistsOfOnlyDevice;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#measuresProperty")
	public List<RefId> getmeasuresPropertyProperty()
	{
		return measuresPropertyOnlyProperty;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasTypicalConsumption")
	public List<RefId> gethasTypicalConsumptionPower()
	{
		return hasTypicalConsumptionOnlyPower;
	}
	public List<RefId> gethasTypicalConsumptionEnergy()
	{
		return hasTypicalConsumptionOnlyEnergy;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#accomplishes")
	public List<RefId> getaccomplishesTask()
	{
		return accomplishesMinTask;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#controlsProperty")
	public List<RefId> getcontrolsPropertyProperty()
	{
		return controlsPropertyOnlyProperty;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasState")
	public List<RefId> gethasStateState()
	{
		return hasStateOnlyState;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#makesMeasurement")
	public List<RefId> getmakesMeasurementMeasurement()
	{
		return makesMeasurementOnlyMeasurement;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isUsedFor")
	public List<RefId> getisUsedForCommodity()
	{
		return isUsedForOnlyCommodity;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasFunction")
	public List<RefId> gethasFunctionFunction()
	{
		return hasFunctionMinFunction;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasProfile")
	public List<RefId> gethasProfileProfile()
	{
		return hasProfileOnlyProfile;
	}
	
}
