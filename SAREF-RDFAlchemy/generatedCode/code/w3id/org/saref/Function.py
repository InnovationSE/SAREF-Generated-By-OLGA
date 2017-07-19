from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Function(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Function
	
	
    hasCommandMinCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandMinCommand)
    listOfhasCommandMinCommand = []

    def addhasCommandMin (self, parameter):
        self.listOfhasCommandMinCommand.append(parameter)
        self.hasCommandMinCommand = self.listOfhasCommandMinCommand
			
