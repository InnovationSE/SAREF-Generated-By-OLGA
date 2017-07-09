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


import w3id.org.saref.UnitOfMeasure;
	


public  class IlluminanceUnit implements IIlluminanceUnit {

	IRI newInstance;
	
	public IlluminanceUnit(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("https://w3id.org/saref#IlluminanceUnit"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	
	
}
