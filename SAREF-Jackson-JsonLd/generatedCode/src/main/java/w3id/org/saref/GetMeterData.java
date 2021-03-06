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

import w3id.org.saref.GetCommand;
import w3id.org.saref.Command;
import w3id.org.saref.IFunction;
import w3id.org.saref.IState;
import w3id.org.saref.IGetMeterDataCommand;

import saref.jsonld.util.RefId;

public class GetMeterData implements IGetMeterDataCommand {

	Map<String, List<RefId>> relations;
	
	public GetMeterData(String id) {
		super();
		this.id = "https://w3id.org/saref#" + "GetMeterData";
		relations = new HashMap<String, List<RefId>>();
		isCommandOfMinFunction = new ArrayList<>();
		actsUponOnlyState = new ArrayList<>();
		
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
		return "https://w3id.org/saref#GetMeterDataCommand";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldPropertyType(id = "https://w3id.org/saref#hasDescription", type = "owl:DatatypeProperty")
	@JsonProperty("https://w3id.org/saref#hasDescription")
	public String hasDescription_String;
	
	
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isCommandOf") 
	private List<RefId> isCommandOfMinFunction;
	public void addisCommandOfMin1(IFunction parameter)
	{
		isCommandOfMinFunction.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#actsUpon") 
	private List<RefId> actsUponOnlyState;
	public void addactsUponOnly(IState parameter)
	{
		actsUponOnlyState.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isCommandOf")
	public List<RefId> getisCommandOfFunction()
	{
		return isCommandOfMinFunction;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#actsUpon")
	public List<RefId> getactsUponState()
	{
		return actsUponOnlyState;
	}
	
}