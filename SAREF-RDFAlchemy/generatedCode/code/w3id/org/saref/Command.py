from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Command(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Command
	
    hasDescription = rdfSingle(Namespace('https://w3id.org/saref#').hasDescription)	
	
    isCommandOfMinFunction = rdfList(Namespace('https://w3id.org/saref#').isCommandOfMinFunction)
    listOfisCommandOfMinFunction = []

    def addisCommandOfMin (self, parameter):
        self.listOfisCommandOfMinFunction.append(parameter)
        self.isCommandOfMinFunction = self.listOfisCommandOfMinFunction
			
    actsUponOnlyState = rdfList(Namespace('https://w3id.org/saref#').actsUponOnlyState)
    listOfactsUponOnlyState = []

    def addactsUponOnly (self, parameter):
        self.listOfactsUponOnlyState.append(parameter)
        self.actsUponOnlyState = self.listOfactsUponOnlyState
			
