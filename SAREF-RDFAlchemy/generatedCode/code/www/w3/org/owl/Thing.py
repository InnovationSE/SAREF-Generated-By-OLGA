from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Thing(rdfSubject):
    rdf_type = Namespace('http://www.w3.org/2002/07/owl#').Thing
	
	
