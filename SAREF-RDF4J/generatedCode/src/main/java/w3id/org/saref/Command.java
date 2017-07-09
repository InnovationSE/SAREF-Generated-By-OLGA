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


import w3id.org.saref.IFunction;  
import w3id.org.saref.IState;  
	


public  class Command implements ICommand {

	IRI newInstance;
	
	public Command(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("https://w3id.org/saref#Command"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public void setHasdescription(String param)
	{
	 GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasDescription"), GLOBAL.factory.createLiteral(param));
	}
			
	
	public void addIscommandof_Min1(IFunction parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#isCommandOf"), parameter.iri());
	}
	public void addActsupon_Only(IState parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#actsUpon"), parameter.iri());
	}
	
}
