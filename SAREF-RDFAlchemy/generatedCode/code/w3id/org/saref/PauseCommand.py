from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Command import Command

class PauseCommand(Command):
    rdf_type = Namespace('https://w3id.org/saref#').PauseCommand
	
	
