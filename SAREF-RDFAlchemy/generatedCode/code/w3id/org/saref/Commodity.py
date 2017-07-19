from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Commodity(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Commodity
	
	
    isMeasuredInOnlyUnitOfMeasure = rdfList(Namespace('https://w3id.org/saref#').isMeasuredInOnlyUnitOfMeasure)
    listOfisMeasuredInOnlyUnitOfMeasure = []

    def addisMeasuredInOnly (self, parameter):
        self.listOfisMeasuredInOnlyUnitOfMeasure.append(parameter)
        self.isMeasuredInOnlyUnitOfMeasure = self.listOfisMeasuredInOnlyUnitOfMeasure
			
