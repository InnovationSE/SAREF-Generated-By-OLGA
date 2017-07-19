from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Service(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Service
	
	
    isOfferedByMinDevice = rdfList(Namespace('https://w3id.org/saref#').isOfferedByMinDevice)
    listOfisOfferedByMinDevice = []

    def addisOfferedByMin (self, parameter):
        self.listOfisOfferedByMinDevice.append(parameter)
        self.isOfferedByMinDevice = self.listOfisOfferedByMinDevice
			
    representsMinFunction = rdfList(Namespace('https://w3id.org/saref#').representsMinFunction)
    listOfrepresentsMinFunction = []

    def addrepresentsMin (self, parameter):
        self.listOfrepresentsMinFunction.append(parameter)
        self.representsMinFunction = self.listOfrepresentsMinFunction
			
