from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Task(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Task
	
	
    isAccomplishedByMinDevice = rdfList(Namespace('https://w3id.org/saref#').isAccomplishedByMinDevice)
    listOfisAccomplishedByMinDevice = []

    def addisAccomplishedByMin (self, parameter):
        self.listOfisAccomplishedByMinDevice.append(parameter)
        self.isAccomplishedByMinDevice = self.listOfisAccomplishedByMinDevice
			
