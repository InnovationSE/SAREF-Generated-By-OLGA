from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Command import Command

class StopCommand(Command):
    rdf_type = Namespace('https://w3id.org/saref#').StopCommand
	
	
    actsUponOnlyStartStopState = rdfList(Namespace('https://w3id.org/saref#').actsUponOnlyStartStopState)
    listOfactsUponOnlyStartStopState = []

    def addactsUponOnly (self, parameter):
        self.listOfactsUponOnlyStartStopState.append(parameter)
        self.actsUponOnlyStartStopState = self.listOfactsUponOnlyStartStopState
			
