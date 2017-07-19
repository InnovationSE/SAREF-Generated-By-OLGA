from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Function import Function

class EventFunction(Function):
    rdf_type = Namespace('https://w3id.org/saref#').EventFunction
	
	
    hasCommandOnlyNotifyCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyNotifyCommand)
    listOfhasCommandOnlyNotifyCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyNotifyCommand.append(parameter)
        self.hasCommandOnlyNotifyCommand = self.listOfhasCommandOnlyNotifyCommand
			
    hasThresholdMeasurementMinMeasurement = rdfList(Namespace('https://w3id.org/saref#').hasThresholdMeasurementMinMeasurement)
    listOfhasThresholdMeasurementMinMeasurement = []

    def addhasThresholdMeasurementMin (self, parameter):
        self.listOfhasThresholdMeasurementMinMeasurement.append(parameter)
        self.hasThresholdMeasurementMinMeasurement = self.listOfhasThresholdMeasurementMinMeasurement
			
