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

import w3id.org.saref.IDevice;  
import w3id.org.saref.IFunction;  






public  class Service implements IService {

	Map<String, List<RefId>> relations;
	
	public Service(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		isOfferedByMinDevice = new ArrayList<>();
		representsMinFunction = new ArrayList<>();
		
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
		return "https://w3id.org/saref#Service";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isOfferedBy") 
	private List<RefId> isOfferedByMinDevice;
	public void addisOfferedByMin1(IDevice parameter)
	{
		isOfferedByMinDevice.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#represents") 
	private List<RefId> representsMinFunction;
	public void addrepresentsMin1(IFunction parameter)
	{
		representsMinFunction.add(parameter.getRefId());
	}
	
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isOfferedBy")
	public List<RefId> getisOfferedByDevice()
	{
		return isOfferedByMinDevice;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#represents")
	public List<RefId> getrepresentsFunction()
	{
		return representsMinFunction;
	}
	
}
