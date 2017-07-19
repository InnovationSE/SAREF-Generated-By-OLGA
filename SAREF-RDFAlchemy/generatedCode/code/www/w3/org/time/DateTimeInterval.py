from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.ProperInterval import ProperInterval

class DateTimeInterval(ProperInterval):
    rdf_type = Namespace('http://www.w3.org/2006/time#').DateTimeInterval
	
	
