from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Service import Service

class SwitchOnService(Service):
    rdf_type = Namespace('https://w3id.org/saref#').SwitchOnService
	
	
    representsSomeOnOffFunction = rdfList(Namespace('https://w3id.org/saref#').representsSomeOnOffFunction)
    listOfrepresentsSomeOnOffFunction = []

    def addrepresentsSome (self, parameter):
        self.listOfrepresentsSomeOnOffFunction.append(parameter)
        self.representsSomeOnOffFunction = self.listOfrepresentsSomeOnOffFunction
			
    isOfferedBySomeLightSwitch = rdfList(Namespace('https://w3id.org/saref#').isOfferedBySomeLightSwitch)
    listOfisOfferedBySomeLightSwitch = []

    def addisOfferedBySome (self, parameter):
        self.listOfisOfferedBySomeLightSwitch.append(parameter)
        self.isOfferedBySomeLightSwitch = self.listOfisOfferedBySomeLightSwitch
			
