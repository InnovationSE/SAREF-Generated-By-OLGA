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

import www.w3.org._2002._07.owl.IThing;  






public  class TemporalPosition implements ITemporalPosition {

	Map<String, List<RefId>> relations;
	
	public TemporalPosition(String id) {
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
		return "http://www.w3.org/2006/time#TemporalPosition";
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
