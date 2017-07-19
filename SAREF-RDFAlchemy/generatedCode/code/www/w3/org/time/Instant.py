from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.TemporalEntity import TemporalEntity

class Instant(TemporalEntity):
    rdf_type = Namespace('http://www.w3.org/2006/time#').Instant
	
	
