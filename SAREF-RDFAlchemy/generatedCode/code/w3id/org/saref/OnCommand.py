from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Command import Command

class OnCommand(Command):
    rdf_type = Namespace('https://w3id.org/saref#').OnCommand
	
	
    actsUponOnlyOnOffState = rdfList(Namespace('https://w3id.org/saref#').actsUponOnlyOnOffState)
    listOfactsUponOnlyOnOffState = []

    def addactsUponOnly (self, parameter):
        self.listOfactsUponOnlyOnOffState.append(parameter)
        self.actsUponOnlyOnOffState = self.listOfactsUponOnlyOnOffState
			
