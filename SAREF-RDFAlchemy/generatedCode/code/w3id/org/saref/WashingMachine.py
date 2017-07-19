from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Appliance import Appliance
from w3id.org.saref.Load import Load

class WashingMachine(Appliance,Load):
    rdf_type = Namespace('https://w3id.org/saref#').WashingMachine
	
	
    hasFunctionSomeStartStopFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionSomeStartStopFunction)
    listOfhasFunctionSomeStartStopFunction = []

    def addhasFunctionSome (self, parameter):
        self.listOfhasFunctionSomeStartStopFunction.append(parameter)
        self.hasFunctionSomeStartStopFunction = self.listOfhasFunctionSomeStartStopFunction
			
    hasStateSomeStartStopState = rdfList(Namespace('https://w3id.org/saref#').hasStateSomeStartStopState)
    listOfhasStateSomeStartStopState = []

    def addhasStateSome (self, parameter):
        self.listOfhasStateSomeStartStopState.append(parameter)
        self.hasStateSomeStartStopState = self.listOfhasStateSomeStartStopState
			
    hasProfileSomeProfile = rdfList(Namespace('https://w3id.org/saref#').hasProfileSomeProfile)
    listOfhasProfileSomeProfile = []

    def addhasProfileSome (self, parameter):
        self.listOfhasProfileSomeProfile.append(parameter)
        self.hasProfileSomeProfile = self.listOfhasProfileSomeProfile
			
