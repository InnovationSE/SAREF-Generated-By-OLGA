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

import w3id.org.saref.ITime;  
import w3id.org.saref.IProperty;  
import w3id.org.saref.ICommodity;  
import w3id.org.saref.IPrice;  
import w3id.org.saref.IProfile;  






public  class Profile implements IProfile {

	Map<String, List<RefId>> relations;
	
	public Profile(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		hasTimeOnlyTime = new ArrayList<>();
		isAboutOnlyProperty = new ArrayList<>();
		isAboutOnlyCommodity = new ArrayList<>();
		hasPriceOnlyPrice = new ArrayList<>();
		consistsOfOnlyProfile = new ArrayList<>();
		
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
		return "https://w3id.org/saref#Profile";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasTime") 
	private List<RefId> hasTimeOnlyTime;
	public void addhasTimeOnly(ITime parameter)
	{
		hasTimeOnlyTime.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isAbout") 
	private List<RefId> isAboutOnlyProperty;
	public void addisAboutOnly(IProperty parameter)
	{
		isAboutOnlyProperty.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isAbout") 
	private List<RefId> isAboutOnlyCommodity;
	public void addisAboutOnly(ICommodity parameter)
	{
		isAboutOnlyCommodity.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasPrice") 
	private List<RefId> hasPriceOnlyPrice;
	public void addhasPriceOnly(IPrice parameter)
	{
		hasPriceOnlyPrice.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#consistsOf") 
	private List<RefId> consistsOfOnlyProfile;
	public void addconsistsOfOnly(IProfile parameter)
	{
		consistsOfOnlyProfile.add(parameter.getRefId());
	}
	
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasTime")
	public List<RefId> gethasTimeTime()
	{
		return hasTimeOnlyTime;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isAbout")
	public List<RefId> getisAboutProperty()
	{
		return isAboutOnlyProperty;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isAbout")
	public List<RefId> getisAboutCommodity()
	{
		return isAboutOnlyCommodity;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasPrice")
	public List<RefId> gethasPricePrice()
	{
		return hasPriceOnlyPrice;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#consistsOf")
	public List<RefId> getconsistsOfProfile()
	{
		return consistsOfOnlyProfile;
	}
	
}
