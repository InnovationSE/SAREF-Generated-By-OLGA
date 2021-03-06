/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/

package www.w3.org.time;

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

import www.w3.org.time.ITemporalPosition;  
import www.w3.org.owl.IThing;  


public interface IGeneralDateTimeDescription extends ITemporalPosition {

	/**
	* @return RefId
	*/
	@JsonIgnore
	public RefId getRefId();
	
	/**
	* addmonthOfYearMax1
	* @param IThing
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#monthOfYear") 
	public void addmonthOfYearMax1(IThing parameter);
			
	/**
	* addunitTypeExactly1
	* @param IThing
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#unitType") 
	public void addunitTypeExactly1(IThing parameter);
			
	/**
	* addtimeZoneMax1
	* @param IThing
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#timeZone") 
	public void addtimeZoneMax1(IThing parameter);
			
	/**
	* adddayOfWeekMax1
	* @param IThing
	*/		
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("http://www.w3.org/2006/time#dayOfWeek") 
	public void adddayOfWeekMax1(IThing parameter);
			
	
}
