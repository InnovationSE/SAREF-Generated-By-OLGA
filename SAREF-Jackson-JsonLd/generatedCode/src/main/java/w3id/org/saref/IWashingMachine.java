/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/

package w3id.org.saref;

import java.util.ArrayList;
import java.util.List;

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

import w3id.org.saref.IAppliance;  
import w3id.org.saref.ILoad;  
import w3id.org.saref.IStartStopFunction;  
import w3id.org.saref.IStartStopState;  
import w3id.org.saref.IProfile;  


public interface IWashingMachine extends IAppliance, ILoad {

	/**
	* @return RefId
	*/
	@JsonIgnore
	public RefId getRefId();
	
	/**
	* addhasFunctionSome
	* @param IStartStopFunction
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasFunction") 
	public void addhasFunctionSome(IStartStopFunction parameter);
			
	/**
	* addhasStateSome
	* @param IStartStopState
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasState") 
	public void addhasStateSome(IStartStopState parameter);
			
	/**
	* addhasProfileSome
	* @param IProfile
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasProfile") 
	public void addhasProfileSome(IProfile parameter);
			
	
}