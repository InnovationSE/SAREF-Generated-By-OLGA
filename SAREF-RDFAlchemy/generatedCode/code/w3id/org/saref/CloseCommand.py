from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Command import Command

class CloseCommand(Command):
    rdf_type = Namespace('https://w3id.org/saref#').CloseCommand
	
	
    actsUponOnlyOpenCloseState = rdfList(Namespace('https://w3id.org/saref#').actsUponOnlyOpenCloseState)
    listOfactsUponOnlyOpenCloseState = []

    def addactsUponOnly (self, parameter):
        self.listOfactsUponOnlyOpenCloseState.append(parameter)
        self.actsUponOnlyOpenCloseState = self.listOfactsUponOnlyOpenCloseState
			
