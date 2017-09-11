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

import w3id.org.saref.UnitOfMeasure;



import www.wurvoc.org.vocabularies.om_1_8.United_States_dollar.United_States_dollar;
import www.wurvoc.org.vocabularies.om_1_8.pound_sterling.pound_sterling;
import www.wurvoc.org.vocabularies.om_1_8.euro.euro;



public  class Currency implements ICurrency {

	Map<String, List<RefId>> relations;
	
	public Currency(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		United_States_dollar united_states_dollar = new United_States_dollar("United_States_dollar");
		pound_sterling pound_sterling = new pound_sterling("pound_sterling");
		euro euro = new euro("euro");
		
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
		return "https://w3id.org/saref#Currency";
	}
	
	
	
	
	
	
}
