from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.ActuatingFunction import ActuatingFunction

class OpenCloseFunction(ActuatingFunction):
    rdf_type = Namespace('https://w3id.org/saref#').OpenCloseFunction
	
	
    hasCommandOnlyCloseCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyCloseCommand)
    listOfhasCommandOnlyCloseCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyCloseCommand.append(parameter)
        self.hasCommandOnlyCloseCommand = self.listOfhasCommandOnlyCloseCommand
    hasCommandOnlyOpenCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyOpenCommand)
    listOfhasCommandOnlyOpenCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyOpenCommand.append(parameter)
        self.hasCommandOnlyOpenCommand = self.listOfhasCommandOnlyOpenCommand
			
