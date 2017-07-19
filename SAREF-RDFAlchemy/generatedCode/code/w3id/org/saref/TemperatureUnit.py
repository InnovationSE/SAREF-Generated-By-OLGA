from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.UnitOfMeasure import UnitOfMeasure

class TemperatureUnit(UnitOfMeasure):
    rdf_type = Namespace('https://w3id.org/saref#').TemperatureUnit
	
	
