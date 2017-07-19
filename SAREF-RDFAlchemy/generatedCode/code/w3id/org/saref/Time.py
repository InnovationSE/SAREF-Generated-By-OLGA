from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Property import Property

class Time(Property):
    rdf_type = Namespace('https://w3id.org/saref#').Time
	
	
    consistsOfSomeTemporalEntity = rdfList(Namespace('https://w3id.org/saref#').consistsOfSomeTemporalEntity)
    listOfconsistsOfSomeTemporalEntity = []

    def addconsistsOfSome (self, parameter):
        self.listOfconsistsOfSomeTemporalEntity.append(parameter)
        self.consistsOfSomeTemporalEntity = self.listOfconsistsOfSomeTemporalEntity
			
