from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.FunctionRelated import FunctionRelated

class Actuator(FunctionRelated):
    rdf_type = Namespace('https://w3id.org/saref#').Actuator
	
	
    hasFunctionSomeActuatingFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeActuatingFunction)
    listOfhasFunctionSomeActuatingFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeActuatingFunction.append(parameter)
        self.hasFunctionSomeActuatingFunction = self.listOfhasFunctionSomeActuatingFunction
			
