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


import w3id.org.saref.IDevice;  
import w3id.org.saref.IFunction;  
	


public  class Service implements IService {

	IRI newInstance;
	
	public Service(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("https://w3id.org/saref#Service"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	
	public void addIsofferedby_Min1(IDevice parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#isOfferedBy"), parameter.iri());
	}
	public void addRepresents_Min1(IFunction parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#represents"), parameter.iri());
	}
	
}
