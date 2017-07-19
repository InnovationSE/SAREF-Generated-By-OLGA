from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.GeneralDurationDescription import GeneralDurationDescription

class DurationDescription(GeneralDurationDescription):
    rdf_type = Namespace('http://www.w3.org/2006/time#').DurationDescription
	
    hours = rdfSingle(Namespace('http://www.w3.org/2006/time#').hours)	
    minutes = rdfSingle(Namespace('http://www.w3.org/2006/time#').minutes)	
    weeks = rdfSingle(Namespace('http://www.w3.org/2006/time#').weeks)	
    seconds = rdfSingle(Namespace('http://www.w3.org/2006/time#').seconds)	
    months = rdfSingle(Namespace('http://www.w3.org/2006/time#').months)	
    years = rdfSingle(Namespace('http://www.w3.org/2006/time#').years)	
    days = rdfSingle(Namespace('http://www.w3.org/2006/time#').days)	
	
