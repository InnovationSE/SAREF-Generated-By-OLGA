from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.FunctionRelated import FunctionRelated

class Sensor(FunctionRelated):
    rdf_type = Namespace('https://w3id.org/saref#').Sensor
	
	
    hasFunctionSomeSensingFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeSensingFunction)
    listOfhasFunctionSomeSensingFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeSensingFunction.append(parameter)
        self.hasFunctionSomeSensingFunction = self.listOfhasFunctionSomeSensingFunction
			
