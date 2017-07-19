from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList

from www.w3.org.time.TemporalPosition import TemporalPosition

class GeneralDateTimeDescription(TemporalPosition):
    rdf_type = Namespace('http://www.w3.org/2006/time#').GeneralDateTimeDescription
	
    day = rdfSingle(Namespace('http://www.w3.org/2006/time#').day)	
    dayOfYear = rdfSingle(Namespace('http://www.w3.org/2006/time#').dayOfYear)	
    hour = rdfSingle(Namespace('http://www.w3.org/2006/time#').hour)	
    week = rdfSingle(Namespace('http://www.w3.org/2006/time#').week)	
    month = rdfSingle(Namespace('http://www.w3.org/2006/time#').month)	
    minute = rdfSingle(Namespace('http://www.w3.org/2006/time#').minute)	
    year = rdfSingle(Namespace('http://www.w3.org/2006/time#').year)	
    second = rdfSingle(Namespace('http://www.w3.org/2006/time#').second)	
	
    monthOfYearMaxThing = rdfList(Namespace('http://www.w3.org/2006/time#').monthOfYearMaxThing)
    listOfmonthOfYearMaxThing = []

    def addmonthOfYearMax (self, parameter):
        self.listOfmonthOfYearMaxThing.append(parameter)
        self.monthOfYearMaxThing = self.listOfmonthOfYearMaxThing
			
    unitTypeExactlyThing = rdfList(Namespace('http://www.w3.org/2006/time#').unitTypeExactlyThing)
    listOfunitTypeExactlyThing = []

    def addunitTypeExactly (self, parameter):
        self.listOfunitTypeExactlyThing.append(parameter)
        self.unitTypeExactlyThing = self.listOfunitTypeExactlyThing
			
    timeZoneMaxThing = rdfList(Namespace('http://www.w3.org/2006/time#').timeZoneMaxThing)
    listOftimeZoneMaxThing = []

    def addtimeZoneMax (self, parameter):
        self.listOftimeZoneMaxThing.append(parameter)
        self.timeZoneMaxThing = self.listOftimeZoneMaxThing
			
    dayOfWeekMaxThing = rdfList(Namespace('http://www.w3.org/2006/time#').dayOfWeekMaxThing)
    listOfdayOfWeekMaxThing = []

    def adddayOfWeekMax (self, parameter):
        self.listOfdayOfWeekMaxThing.append(parameter)
        self.dayOfWeekMaxThing = self.listOfdayOfWeekMaxThing
			
