from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Switch import Switch

class DoorSwitch(Switch):
    rdf_type = Namespace('https://w3id.org/saref#').DoorSwitch
	
	
    hasFunctionSomeOpenCloseFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeOpenCloseFunction)
    listOfhasFunctionSomeOpenCloseFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeOpenCloseFunction.append(parameter)
        self.hasFunctionSomeOpenCloseFunction = self.listOfhasFunctionSomeOpenCloseFunction
			
    hasStateSomeOpenCloseState = rdfList(Namespace('https://w3id.org/saref#').hasStateSomeOpenCloseState)
    listOfhasStateSomeOpenCloseState = []

    def addhasStateSome (self, parameter):
        self.listOfhasStateSomeOpenCloseState.append(parameter)
        self.hasStateSomeOpenCloseState = self.listOfhasStateSomeOpenCloseState
			
    consistsOfSomeSwitch = rdfList(Namespace('https://w3id.org/saref#').consistsOfSomeSwitch)
    listOfconsistsOfSomeSwitch = []

    def addconsistsOfSome (self, parameter):
        self.listOfconsistsOfSomeSwitch.append(parameter)
        self.consistsOfSomeSwitch = self.listOfconsistsOfSomeSwitch
			
