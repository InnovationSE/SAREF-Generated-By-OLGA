from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.TemporalDuration import TemporalDuration

class Duration(TemporalDuration):
    rdf_type = Namespace('http://www.w3.org/2006/time#').Duration
	
    numericDuration = rdfSingle(Namespace('http://www.w3.org/2006/time#').numericDuration)	
	
    unitTypeExactlyThing = rdfList(Namespace('http://www.w3.org/2006/time#').unitTypeExactlyThing)
    listOfunitTypeExactlyThing = []

    def addunitTypeExactly (self, parameter):
        self.listOfunitTypeExactlyThing.append(parameter)
        self.unitTypeExactlyThing = self.listOfunitTypeExactlyThing
			
