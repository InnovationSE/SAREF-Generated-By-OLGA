from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class TemporalDuration(rdfSubject):
    rdf_type = Namespace('http://www.w3.org/2006/time#').TemporalDuration
	
	
