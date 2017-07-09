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


import w3id.org.saref.IStepDownCommand;  
import w3id.org.saref.ISetAbsoluteLevelCommand;  
import w3id.org.saref.IStepUpCommand;  
import w3id.org.saref.ISetRelativeLevelCommand;  
import w3id.org.saref.ActuatingFunction;
import w3id.org.saref.Function;
import w3id.org.saref.ICommand;
	


public  class LevelControlFunction implements ILevelControlFunction {

	IRI newInstance;
	
	public LevelControlFunction(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("https://w3id.org/saref#LevelControlFunction"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	
	public void addHascommand_Only(IStepDownCommand parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasCommand"), parameter.iri());
	}
	public void addHascommand_Only(ISetAbsoluteLevelCommand parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasCommand"), parameter.iri());
	}
	public void addHascommand_Only(IStepUpCommand parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasCommand"), parameter.iri());
	}
	public void addHascommand_Only(ISetRelativeLevelCommand parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasCommand"), parameter.iri());
	}
	
	public void addHascommand_Min1(ICommand parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#hasCommand"), parameter.iri());
	}
			
}
