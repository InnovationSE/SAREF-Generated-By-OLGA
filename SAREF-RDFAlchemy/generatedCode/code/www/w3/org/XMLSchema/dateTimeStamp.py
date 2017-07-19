from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.rdf.schema.Literal import Literal

class dateTimeStamp(Literal):
    rdf_type = Namespace('http://www.w3.org/2001/XMLSchema#').dateTimeStamp
	
	
