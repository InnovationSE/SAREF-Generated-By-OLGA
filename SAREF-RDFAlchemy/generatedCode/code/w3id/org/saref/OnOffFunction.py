from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.ActuatingFunction import ActuatingFunction

class OnOffFunction(ActuatingFunction):
    rdf_type = Namespace('https://w3id.org/saref#').OnOffFunction
	
	
    hasCommandOnlyOffCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyOffCommand)
    listOfhasCommandOnlyOffCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyOffCommand.append(parameter)
        self.hasCommandOnlyOffCommand = self.listOfhasCommandOnlyOffCommand
    hasCommandOnlyOnCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyOnCommand)
    listOfhasCommandOnlyOnCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyOnCommand.append(parameter)
        self.hasCommandOnlyOnCommand = self.listOfhasCommandOnlyOnCommand
    hasCommandOnlyToggleCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyToggleCommand)
    listOfhasCommandOnlyToggleCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyToggleCommand.append(parameter)
        self.hasCommandOnlyToggleCommand = self.listOfhasCommandOnlyToggleCommand
			
