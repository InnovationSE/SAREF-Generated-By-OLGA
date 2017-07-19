from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Switch import Switch

class LightSwitch(Switch):
    rdf_type = Namespace('https://w3id.org/saref#').LightSwitch
	
	
    hasFunctionSomeOnOffFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeOnOffFunction)
    listOfhasFunctionSomeOnOffFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeOnOffFunction.append(parameter)
        self.hasFunctionSomeOnOffFunction = self.listOfhasFunctionSomeOnOffFunction
			
    consistsOfSomeSwitch = rdfList(Namespace('https://w3id.org/saref#').consistsOfSomeSwitch)
    listOfconsistsOfSomeSwitch = []

    def addconsistsOfSome (self, parameter):
        self.listOfconsistsOfSomeSwitch.append(parameter)
        self.consistsOfSomeSwitch = self.listOfconsistsOfSomeSwitch
			
    hasStateSomeOnOffState = rdfList(Namespace('https://w3id.org/saref#').hasStateSomeOnOffState)
    listOfhasStateSomeOnOffState = []

    def addhasStateSome (self, parameter):
        self.listOfhasStateSomeOnOffState.append(parameter)
        self.hasStateSomeOnOffState = self.listOfhasStateSomeOnOffState
			
    measuresPropertySomeLight = rdfList(Namespace('https://w3id.org/saref#').measuresPropertySomeLight)
    listOfmeasuresPropertySomeLight = []

    def addmeasuresPropertySome (self, parameter):
        self.listOfmeasuresPropertySomeLight.append(parameter)
        self.measuresPropertySomeLight = self.listOfmeasuresPropertySomeLight
			
    offersSomeSwitchOnService = rdfList(Namespace('https://w3id.org/saref#').offersSomeSwitchOnService)
    listOfoffersSomeSwitchOnService = []

    def addoffersSome (self, parameter):
        self.listOfoffersSomeSwitchOnService.append(parameter)
        self.offersSomeSwitchOnService = self.listOfoffersSomeSwitchOnService
			
