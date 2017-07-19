from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from w3id.org.saref.Meter import Meter

class EnergyMeter(Meter):
    rdf_type = Namespace('https://w3id.org/saref#').EnergyMeter
	
	
    measuresPropertySomeEnergy = rdfList(Namespace('https://w3id.org/saref#').measuresPropertySomeEnergy)
    listOfmeasuresPropertySomeEnergy = []

    def addmeasuresPropertySome (self, parameter):
        self.listOfmeasuresPropertySomeEnergy.append(parameter)
        self.measuresPropertySomeEnergy = self.listOfmeasuresPropertySomeEnergy
			
    consistsOfSomeMeter = rdfList(Namespace('https://w3id.org/saref#').consistsOfSomeMeter)
    listOfconsistsOfSomeMeter = []

    def addconsistsOfSome (self, parameter):
        self.listOfconsistsOfSomeMeter.append(parameter)
        self.consistsOfSomeMeter = self.listOfconsistsOfSomeMeter
			
