from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Command import Command

class StepDownCommand(Command):
    rdf_type = Namespace('https://w3id.org/saref#').StepDownCommand
	
	
    actsUponOnlyMultiLevelState = rdfList(Namespace('https://w3id.org/saref#').actsUponOnlyMultiLevelState)
    listOfactsUponOnlyMultiLevelState = []

    def addactsUponOnly (self, parameter):
        self.listOfactsUponOnlyMultiLevelState.append(parameter)
        self.actsUponOnlyMultiLevelState = self.listOfactsUponOnlyMultiLevelState
			
