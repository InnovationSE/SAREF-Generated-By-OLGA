from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Property(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Property
	
	
    isMeasuredByDeviceOnlyDevice = rdfList(Namespace('https://w3id.org/saref#').isMeasuredByDeviceOnlyDevice)
    listOfisMeasuredByDeviceOnlyDevice = []

    def addisMeasuredByDeviceOnly (self, parameter):
        self.listOfisMeasuredByDeviceOnlyDevice.append(parameter)
        self.isMeasuredByDeviceOnlyDevice = self.listOfisMeasuredByDeviceOnlyDevice
			
    isControlledByDeviceOnlyDevice = rdfList(Namespace('https://w3id.org/saref#').isControlledByDeviceOnlyDevice)
    listOfisControlledByDeviceOnlyDevice = []

    def addisControlledByDeviceOnly (self, parameter):
        self.listOfisControlledByDeviceOnlyDevice.append(parameter)
        self.isControlledByDeviceOnlyDevice = self.listOfisControlledByDeviceOnlyDevice
			
    relatesToMeasurementOnlyMeasurement = rdfList(Namespace('https://w3id.org/saref#').relatesToMeasurementOnlyMeasurement)
    listOfrelatesToMeasurementOnlyMeasurement = []

    def addrelatesToMeasurementOnly (self, parameter):
        self.listOfrelatesToMeasurementOnlyMeasurement.append(parameter)
        self.relatesToMeasurementOnlyMeasurement = self.listOfrelatesToMeasurementOnlyMeasurement
			
