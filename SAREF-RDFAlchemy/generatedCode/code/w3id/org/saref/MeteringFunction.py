from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Function import Function

class MeteringFunction(Function):
    rdf_type = Namespace('https://w3id.org/saref#').MeteringFunction
	
	
    hasCommandOnlyGetCurrentMeterValueCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyGetCurrentMeterValueCommand)
    listOfhasCommandOnlyGetCurrentMeterValueCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyGetCurrentMeterValueCommand.append(parameter)
        self.hasCommandOnlyGetCurrentMeterValueCommand = self.listOfhasCommandOnlyGetCurrentMeterValueCommand
    hasCommandOnlyGetMeterDataCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyGetMeterDataCommand)
    listOfhasCommandOnlyGetMeterDataCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyGetMeterDataCommand.append(parameter)
        self.hasCommandOnlyGetMeterDataCommand = self.listOfhasCommandOnlyGetMeterDataCommand
    hasCommandOnlyGetMeterHistoryCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyGetMeterHistoryCommand)
    listOfhasCommandOnlyGetMeterHistoryCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyGetMeterHistoryCommand.append(parameter)
        self.hasCommandOnlyGetMeterHistoryCommand = self.listOfhasCommandOnlyGetMeterHistoryCommand
			
    hasMeterReadingTypeOnlyProperty = rdfList(Namespace('https://w3id.org/saref#').hasMeterReadingTypeOnlyProperty)
    listOfhasMeterReadingTypeOnlyProperty = []

    def addhasMeterReadingTypeOnly (self, parameter):
        self.listOfhasMeterReadingTypeOnlyProperty.append(parameter)
        self.hasMeterReadingTypeOnlyProperty = self.listOfhasMeterReadingTypeOnlyProperty
    hasMeterReadingTypeOnlyCommodity = rdfList(Namespace('https://w3id.org/saref#').hasMeterReadingTypeOnlyCommodity)
    listOfhasMeterReadingTypeOnlyCommodity = []

    def addhasMeterReadingTypeOnly (self, parameter):
        self.listOfhasMeterReadingTypeOnlyCommodity.append(parameter)
        self.hasMeterReadingTypeOnlyCommodity = self.listOfhasMeterReadingTypeOnlyCommodity
			
    hasMeterReadingOnlyMeasurement = rdfList(Namespace('https://w3id.org/saref#').hasMeterReadingOnlyMeasurement)
    listOfhasMeterReadingOnlyMeasurement = []

    def addhasMeterReadingOnly (self, parameter):
        self.listOfhasMeterReadingOnlyMeasurement.append(parameter)
        self.hasMeterReadingOnlyMeasurement = self.listOfhasMeterReadingOnlyMeasurement
			
