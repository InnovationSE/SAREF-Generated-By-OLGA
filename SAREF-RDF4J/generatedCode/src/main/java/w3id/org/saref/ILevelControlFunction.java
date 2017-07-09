/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/

package w3id.org.saref;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import w3id.org.saref.IActuatingFunction;  
import w3id.org.saref.IStepDownCommand;  
import w3id.org.saref.ISetAbsoluteLevelCommand;  
import w3id.org.saref.IStepUpCommand;  
import w3id.org.saref.ISetRelativeLevelCommand;  


public interface ILevelControlFunction extends IActuatingFunction {


	public IRI iri();
			
	public void addHascommand_Only(IStepDownCommand parameter);
	public void addHascommand_Only(ISetAbsoluteLevelCommand parameter);
	public void addHascommand_Only(IStepUpCommand parameter);
	public void addHascommand_Only(ISetRelativeLevelCommand parameter);
			
	
}
