from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class UnitOfMeasure(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').UnitOfMeasure
	
	
