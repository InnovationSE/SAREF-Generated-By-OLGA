from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.ActuatingFunction import ActuatingFunction

class LevelControlFunction(ActuatingFunction):
    rdf_type = Namespace('https://w3id.org/saref#').LevelControlFunction
	
	
    hasCommandOnlyStepDownCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyStepDownCommand)
    listOfhasCommandOnlyStepDownCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyStepDownCommand.append(parameter)
        self.hasCommandOnlyStepDownCommand = self.listOfhasCommandOnlyStepDownCommand
    hasCommandOnlySetAbsoluteLevelCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlySetAbsoluteLevelCommand)
    listOfhasCommandOnlySetAbsoluteLevelCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlySetAbsoluteLevelCommand.append(parameter)
        self.hasCommandOnlySetAbsoluteLevelCommand = self.listOfhasCommandOnlySetAbsoluteLevelCommand
    hasCommandOnlyStepUpCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyStepUpCommand)
    listOfhasCommandOnlyStepUpCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyStepUpCommand.append(parameter)
        self.hasCommandOnlyStepUpCommand = self.listOfhasCommandOnlyStepUpCommand
    hasCommandOnlySetRelativeLevelCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlySetRelativeLevelCommand)
    listOfhasCommandOnlySetRelativeLevelCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlySetRelativeLevelCommand.append(parameter)
        self.hasCommandOnlySetRelativeLevelCommand = self.listOfhasCommandOnlySetRelativeLevelCommand
			
