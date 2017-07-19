from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.TemporalDuration import TemporalDuration
from w3id.org.saref.UnitOfMeasure import UnitOfMeasure

class TemporalUnit(TemporalDuration,UnitOfMeasure):
    rdf_type = Namespace('http://www.w3.org/2006/time#').TemporalUnit
	
	
