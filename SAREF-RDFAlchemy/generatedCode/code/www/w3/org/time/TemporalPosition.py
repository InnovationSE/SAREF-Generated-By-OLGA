from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class TemporalPosition(rdfSubject):
    rdf_type = Namespace('http://www.w3.org/2006/time#').TemporalPosition
	
	
    hasTRSExactlyThing = rdfList(Namespace('http://www.w3.org/2006/time#').hasTRSExactlyThing)
    listOfhasTRSExactlyThing = []

    def addhasTRSExactly (self, parameter):
        self.listOfhasTRSExactlyThing.append(parameter)
        self.hasTRSExactlyThing = self.listOfhasTRSExactlyThing
			
