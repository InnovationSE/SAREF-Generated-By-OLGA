from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.TemporalDuration import TemporalDuration

class GeneralDurationDescription(TemporalDuration):
    rdf_type = Namespace('http://www.w3.org/2006/time#').GeneralDurationDescription
	
    seconds = rdfSingle(Namespace('http://www.w3.org/2006/time#').seconds)	
    minutes = rdfSingle(Namespace('http://www.w3.org/2006/time#').minutes)	
    hours = rdfSingle(Namespace('http://www.w3.org/2006/time#').hours)	
    months = rdfSingle(Namespace('http://www.w3.org/2006/time#').months)	
    days = rdfSingle(Namespace('http://www.w3.org/2006/time#').days)	
    years = rdfSingle(Namespace('http://www.w3.org/2006/time#').years)	
    weeks = rdfSingle(Namespace('http://www.w3.org/2006/time#').weeks)	
	
    hasTRSExactlyThing = rdfList(Namespace('http://www.w3.org/2006/time#').hasTRSExactlyThing)
    listOfhasTRSExactlyThing = []

    def addhasTRSExactly (self, parameter):
        self.listOfhasTRSExactlyThing.append(parameter)
        self.hasTRSExactlyThing = self.listOfhasTRSExactlyThing
			
