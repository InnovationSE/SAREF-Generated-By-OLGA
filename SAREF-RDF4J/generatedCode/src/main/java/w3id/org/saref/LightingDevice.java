/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package w3id.org.saref;

import saref.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


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
	


public  class LightingDevice implements ILightingDevice {

	IRI newInstance;
	
	public LightingDevice(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("https://w3id.org/saref#LightingDevice"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public void setHasdescription_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasDescription"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setHasmanufacturer_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasManufacturer"), GLOBAL.factory.createLiteral(param));
	}
	
	public void setHasmodel_String(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasModel"), GLOBAL.factory.createLiteral(param));
	}
	
	
	
	public void addOffers_Only(IService parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#offers"), parameter.iri());
	}
			
	public void addConsistsof_Only(IDevice parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#consistsOf"), parameter.iri());
	}
			
	public void addMeasuresproperty_Only(IProperty parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#measuresProperty"), parameter.iri());
	}
			
	public void addHastypicalconsumption_Only(IPower parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasTypicalConsumption"), parameter.iri());
	}
			
	public void addHastypicalconsumption_Only(IEnergy parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasTypicalConsumption"), parameter.iri());
	}
			
	public void addAccomplishes_Min1(ITask parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#accomplishes"), parameter.iri());
	}
			
	public void addControlsproperty_Only(IProperty parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#controlsProperty"), parameter.iri());
	}
			
	public void addHasstate_Only(IState parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasState"), parameter.iri());
	}
			
	public void addMakesmeasurement_Only(IMeasurement parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#makesMeasurement"), parameter.iri());
	}
			
	public void addIsusedfor_Only(ICommodity parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#isUsedFor"), parameter.iri());
	}
			
	public void addHasfunction_Min1(IFunction parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasFunction"), parameter.iri());
	}
			
	public void addHasprofile_Only(IProfile parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasProfile"), parameter.iri());
	}
			
}
