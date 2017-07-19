from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Resource(rdfSubject):
    rdf_type = Namespace('http://www.w3.org/2000/01/rdf-schema#').Resource
	
	
