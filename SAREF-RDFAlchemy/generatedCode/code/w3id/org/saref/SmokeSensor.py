from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Sensor import Sensor

class SmokeSensor(Sensor):
    rdf_type = Namespace('https://w3id.org/saref#').SmokeSensor
	
	
    measuresPropertySomeSmoke = rdfList(Namespace('https://w3id.org/saref#').measuresPropertySomeSmoke)
    listOfmeasuresPropertySomeSmoke = []

    def addmeasuresPropertySome (self, parameter):
        self.listOfmeasuresPropertySomeSmoke.append(parameter)
        self.measuresPropertySomeSmoke = self.listOfmeasuresPropertySomeSmoke
			
    hasFunctionSomeSensingFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeSensingFunction)
    listOfhasFunctionSomeSensingFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeSensingFunction.append(parameter)
        self.hasFunctionSomeSensingFunction = self.listOfhasFunctionSomeSensingFunction
			
    consistsOfSomeSensor = rdfList(Namespace('https://w3id.org/saref#').consistsOfSomeSensor)
    listOfconsistsOfSomeSensor = []

    def addconsistsOfSome (self, parameter):
        self.listOfconsistsOfSomeSensor.append(parameter)
        self.consistsOfSomeSensor = self.listOfconsistsOfSomeSensor
			
    hasFunctionSomeEventFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeEventFunction)
    listOfhasFunctionSomeEventFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeEventFunction.append(parameter)
        self.hasFunctionSomeEventFunction = self.listOfhasFunctionSomeEventFunction
			
