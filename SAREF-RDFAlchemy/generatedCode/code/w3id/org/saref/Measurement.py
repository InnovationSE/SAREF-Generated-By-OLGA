from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Measurement(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Measurement
	
    hasTimestamp = rdfSingle(Namespace('https://w3id.org/saref#').hasTimestamp)	
    hasValue = rdfSingle(Namespace('https://w3id.org/saref#').hasValue)	
	
    isMeasuredInExactlyUnitOfMeasure = rdfList(Namespace('https://w3id.org/saref#').isMeasuredInExactlyUnitOfMeasure)
    listOfisMeasuredInExactlyUnitOfMeasure = []

    def addisMeasuredInExactly (self, parameter):
        self.listOfisMeasuredInExactlyUnitOfMeasure.append(parameter)
        self.isMeasuredInExactlyUnitOfMeasure = self.listOfisMeasuredInExactlyUnitOfMeasure
			
    isMeasuredInOnlyUnitOfMeasure = rdfList(Namespace('https://w3id.org/saref#').isMeasuredInOnlyUnitOfMeasure)
    listOfisMeasuredInOnlyUnitOfMeasure = []

    def addisMeasuredInOnly (self, parameter):
        self.listOfisMeasuredInOnlyUnitOfMeasure.append(parameter)
        self.isMeasuredInOnlyUnitOfMeasure = self.listOfisMeasuredInOnlyUnitOfMeasure
			
    relatesToPropertyExactlyProperty = rdfList(Namespace('https://w3id.org/saref#').relatesToPropertyExactlyProperty)
    listOfrelatesToPropertyExactlyProperty = []

    def addrelatesToPropertyExactly (self, parameter):
        self.listOfrelatesToPropertyExactlyProperty.append(parameter)
        self.relatesToPropertyExactlyProperty = self.listOfrelatesToPropertyExactlyProperty
			
    relatesToPropertyOnlyProperty = rdfList(Namespace('https://w3id.org/saref#').relatesToPropertyOnlyProperty)
    listOfrelatesToPropertyOnlyProperty = []

    def addrelatesToPropertyOnly (self, parameter):
        self.listOfrelatesToPropertyOnlyProperty.append(parameter)
        self.relatesToPropertyOnlyProperty = self.listOfrelatesToPropertyOnlyProperty
			
