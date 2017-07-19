from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.ActuatingFunction import ActuatingFunction

class StartStopFunction(ActuatingFunction):
    rdf_type = Namespace('https://w3id.org/saref#').StartStopFunction
	
	
    hasCommandOnlyStartCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyStartCommand)
    listOfhasCommandOnlyStartCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyStartCommand.append(parameter)
        self.hasCommandOnlyStartCommand = self.listOfhasCommandOnlyStartCommand
    hasCommandOnlyStopCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyStopCommand)
    listOfhasCommandOnlyStopCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyStopCommand.append(parameter)
        self.hasCommandOnlyStopCommand = self.listOfhasCommandOnlyStopCommand
			
