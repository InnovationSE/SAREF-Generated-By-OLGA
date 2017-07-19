from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Sensor import Sensor

class TemperatureSensor(Sensor):
    rdf_type = Namespace('https://w3id.org/saref#').TemperatureSensor
	
	
    hasFunctionSomeSensingFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeSensingFunction)
    listOfhasFunctionSomeSensingFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeSensingFunction.append(parameter)
        self.hasFunctionSomeSensingFunction = self.listOfhasFunctionSomeSensingFunction
			
    measuresPropertySomeTemperature = rdfList(Namespace('https://w3id.org/saref#').measuresPropertySomeTemperature)
    listOfmeasuresPropertySomeTemperature = []

    def addmeasuresPropertySome (self, parameter):
        self.listOfmeasuresPropertySomeTemperature.append(parameter)
        self.measuresPropertySomeTemperature = self.listOfmeasuresPropertySomeTemperature
			
    consistsOfSomeSensor = rdfList(Namespace('https://w3id.org/saref#').consistsOfSomeSensor)
    listOfconsistsOfSomeSensor = []

    def addconsistsOfSome (self, parameter):
        self.listOfconsistsOfSomeSensor.append(parameter)
        self.consistsOfSomeSensor = self.listOfconsistsOfSomeSensor
			
