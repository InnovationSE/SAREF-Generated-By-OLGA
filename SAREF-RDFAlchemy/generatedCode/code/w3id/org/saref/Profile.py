from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Profile(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Profile
	
	
    hasTimeOnlyTime = rdfList(Namespace('https://w3id.org/saref#').hasTimeOnlyTime)
    listOfhasTimeOnlyTime = []

    def addhasTimeOnly (self, parameter):
        self.listOfhasTimeOnlyTime.append(parameter)
        self.hasTimeOnlyTime = self.listOfhasTimeOnlyTime
			
    isAboutOnlyProperty = rdfList(Namespace('https://w3id.org/saref#').isAboutOnlyProperty)
    listOfisAboutOnlyProperty = []

    def addisAboutOnly (self, parameter):
        self.listOfisAboutOnlyProperty.append(parameter)
        self.isAboutOnlyProperty = self.listOfisAboutOnlyProperty
    isAboutOnlyCommodity = rdfList(Namespace('https://w3id.org/saref#').isAboutOnlyCommodity)
    listOfisAboutOnlyCommodity = []

    def addisAboutOnly (self, parameter):
        self.listOfisAboutOnlyCommodity.append(parameter)
        self.isAboutOnlyCommodity = self.listOfisAboutOnlyCommodity
			
    hasPriceOnlyPrice = rdfList(Namespace('https://w3id.org/saref#').hasPriceOnlyPrice)
    listOfhasPriceOnlyPrice = []

    def addhasPriceOnly (self, parameter):
        self.listOfhasPriceOnlyPrice.append(parameter)
        self.hasPriceOnlyPrice = self.listOfhasPriceOnlyPrice
			
    consistsOfOnlyProfile = rdfList(Namespace('https://w3id.org/saref#').consistsOfOnlyProfile)
    listOfconsistsOfOnlyProfile = []

    def addconsistsOfOnly (self, parameter):
        self.listOfconsistsOfOnlyProfile.append(parameter)
        self.consistsOfOnlyProfile = self.listOfconsistsOfOnlyProfile
			
