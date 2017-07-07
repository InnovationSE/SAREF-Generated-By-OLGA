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

import w3id.org.saref.ICommand;  
import w3id.org.saref.IMultiLevelState;  


public interface IStepDownCommand extends ICommand {

	/**
	* @return RefId
	*/
	@JsonIgnore
	public RefId getRefId();
	
	/**
	* addactsUponOnly
	* @param IMultiLevelState
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#actsUpon") 
	public void addactsUponOnly(IMultiLevelState parameter);
			
	
}
