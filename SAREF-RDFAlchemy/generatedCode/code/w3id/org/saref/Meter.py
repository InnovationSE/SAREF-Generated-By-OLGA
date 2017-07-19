from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.FunctionRelated import FunctionRelated

class Meter(FunctionRelated):
    rdf_type = Namespace('https://w3id.org/saref#').Meter
	
	
    hasFunctionSomeMeteringFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeMeteringFunction)
    listOfhasFunctionSomeMeteringFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeMeteringFunction.append(parameter)
        self.hasFunctionSomeMeteringFunction = self.listOfhasFunctionSomeMeteringFunction
			
