from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.owl.Thing import Thing

class TemporalEntity(Thing):
    rdf_type = Namespace('http://www.w3.org/2006/time#').TemporalEntity
	
	
