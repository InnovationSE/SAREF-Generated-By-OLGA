from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Function import Function

class SensingFunction(Function):
    rdf_type = Namespace('https://w3id.org/saref#').SensingFunction
	
	
    hasSensingRangeSomeMeasurement = rdfList(Namespace('https://w3id.org/saref#').hasSensingRangeSomeMeasurement)
    listOfhasSensingRangeSomeMeasurement = []

    def addhasSensingRangeSome (self, parameter):
        self.listOfhasSensingRangeSomeMeasurement.append(parameter)
        self.hasSensingRangeSomeMeasurement = self.listOfhasSensingRangeSomeMeasurement
			
    hasSensorTypeOnlyProperty = rdfList(Namespace('https://w3id.org/saref#').hasSensorTypeOnlyProperty)
    listOfhasSensorTypeOnlyProperty = []

    def addhasSensorTypeOnly (self, parameter):
        self.listOfhasSensorTypeOnlyProperty.append(parameter)
        self.hasSensorTypeOnlyProperty = self.listOfhasSensorTypeOnlyProperty
			
    hasCommandOnlyGetSensingDataCommand = rdfList(Namespace('https://w3id.org/saref#').hasCommandOnlyGetSensingDataCommand)
    listOfhasCommandOnlyGetSensingDataCommand = []

    def addhasCommandOnly (self, parameter):
        self.listOfhasCommandOnlyGetSensingDataCommand.append(parameter)
        self.hasCommandOnlyGetSensingDataCommand = self.listOfhasCommandOnlyGetSensingDataCommand
			
