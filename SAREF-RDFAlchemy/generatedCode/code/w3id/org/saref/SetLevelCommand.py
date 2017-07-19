from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Command import Command

class SetLevelCommand(Command):
    rdf_type = Namespace('https://w3id.org/saref#').SetLevelCommand
	
	
    actsUponOnlyMultiLevelState = rdfList(Namespace('https://w3id.org/saref#').actsUponOnlyMultiLevelState)
    listOfactsUponOnlyMultiLevelState = []

    def addactsUponOnly (self, parameter):
        self.listOfactsUponOnlyMultiLevelState.append(parameter)
        self.actsUponOnlyMultiLevelState = self.listOfactsUponOnlyMultiLevelState
			
