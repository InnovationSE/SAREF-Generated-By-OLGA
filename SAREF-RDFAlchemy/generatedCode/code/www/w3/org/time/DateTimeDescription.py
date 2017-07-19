from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.GeneralDateTimeDescription import GeneralDateTimeDescription

class DateTimeDescription(GeneralDateTimeDescription):
    rdf_type = Namespace('http://www.w3.org/2006/time#').DateTimeDescription
	
    month = rdfSingle(Namespace('http://www.w3.org/2006/time#').month)	
    day = rdfSingle(Namespace('http://www.w3.org/2006/time#').day)	
    year = rdfSingle(Namespace('http://www.w3.org/2006/time#').year)	
	
