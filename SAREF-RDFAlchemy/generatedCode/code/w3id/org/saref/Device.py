from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
from rdfalchemy import rdfSingle, rdfMultiple, rdfList


class Device(rdfSubject):
    rdf_type = Namespace('https://w3id.org/saref#').Device
	
    hasDescription = rdfSingle(Namespace('https://w3id.org/saref#').hasDescription)	
    hasManufacturer = rdfSingle(Namespace('https://w3id.org/saref#').hasManufacturer)	
    hasModel = rdfSingle(Namespace('https://w3id.org/saref#').hasModel)	
	
    offersOnlyService = rdfList(Namespace('https://w3id.org/saref#').offersOnlyService)
    listOfoffersOnlyService = []

    def addoffersOnly (self, parameter):
        self.listOfoffersOnlyService.append(parameter)
        self.offersOnlyService = self.listOfoffersOnlyService
			
    consistsOfOnlyDevice = rdfList(Namespace('https://w3id.org/saref#').consistsOfOnlyDevice)
    listOfconsistsOfOnlyDevice = []

    def addconsistsOfOnly (self, parameter):
        self.listOfconsistsOfOnlyDevice.append(parameter)
        self.consistsOfOnlyDevice = self.listOfconsistsOfOnlyDevice
			
    measuresPropertyOnlyProperty = rdfList(Namespace('https://w3id.org/saref#').measuresPropertyOnlyProperty)
    listOfmeasuresPropertyOnlyProperty = []

    def addmeasuresPropertyOnly (self, parameter):
        self.listOfmeasuresPropertyOnlyProperty.append(parameter)
        self.measuresPropertyOnlyProperty = self.listOfmeasuresPropertyOnlyProperty
			
    hasTypicalConsumptionOnlyPower = rdfList(Namespace('https://w3id.org/saref#').hasTypicalConsumptionOnlyPower)
    listOfhasTypicalConsumptionOnlyPower = []

    def addhasTypicalConsumptionOnly (self, parameter):
        self.listOfhasTypicalConsumptionOnlyPower.append(parameter)
        self.hasTypicalConsumptionOnlyPower = self.listOfhasTypicalConsumptionOnlyPower
    hasTypicalConsumptionOnlyEnergy = rdfList(Namespace('https://w3id.org/saref#').hasTypicalConsumptionOnlyEnergy)
    listOfhasTypicalConsumptionOnlyEnergy = []

    def addhasTypicalConsumptionOnly (self, parameter):
        self.listOfhasTypicalConsumptionOnlyEnergy.append(parameter)
        self.hasTypicalConsumptionOnlyEnergy = self.listOfhasTypicalConsumptionOnlyEnergy
			
    accomplishesMinTask = rdfList(Namespace('https://w3id.org/saref#').accomplishesMinTask)
    listOfaccomplishesMinTask = []

    def addaccomplishesMin (self, parameter):
        self.listOfaccomplishesMinTask.append(parameter)
        self.accomplishesMinTask = self.listOfaccomplishesMinTask
			
    controlsPropertyOnlyProperty = rdfList(Namespace('https://w3id.org/saref#').controlsPropertyOnlyProperty)
    listOfcontrolsPropertyOnlyProperty = []

    def addcontrolsPropertyOnly (self, parameter):
        self.listOfcontrolsPropertyOnlyProperty.append(parameter)
        self.controlsPropertyOnlyProperty = self.listOfcontrolsPropertyOnlyProperty
			
    hasStateOnlyState = rdfList(Namespace('https://w3id.org/saref#').hasStateOnlyState)
    listOfhasStateOnlyState = []

    def addhasStateOnly (self, parameter):
        self.listOfhasStateOnlyState.append(parameter)
        self.hasStateOnlyState = self.listOfhasStateOnlyState
			
    makesMeasurementOnlyMeasurement = rdfList(Namespace('https://w3id.org/saref#').makesMeasurementOnlyMeasurement)
    listOfmakesMeasurementOnlyMeasurement = []

    def addmakesMeasurementOnly (self, parameter):
        self.listOfmakesMeasurementOnlyMeasurement.append(parameter)
        self.makesMeasurementOnlyMeasurement = self.listOfmakesMeasurementOnlyMeasurement
			
    isUsedForOnlyCommodity = rdfList(Namespace('https://w3id.org/saref#').isUsedForOnlyCommodity)
    listOfisUsedForOnlyCommodity = []

    def addisUsedForOnly (self, parameter):
        self.listOfisUsedForOnlyCommodity.append(parameter)
        self.isUsedForOnlyCommodity = self.listOfisUsedForOnlyCommodity
			
    hasFunctionMinFunction = rdfList(Namespace('https://w3id.org/saref#').hasFunctionMinFunction)
    listOfhasFunctionMinFunction = []

    def addhasFunctionMin (self, parameter):
        self.listOfhasFunctionMinFunction.append(parameter)
        self.hasFunctionMinFunction = self.listOfhasFunctionMinFunction
			
    hasProfileOnlyProfile = rdfList(Namespace('https://w3id.org/saref#').hasProfileOnlyProfile)
    listOfhasProfileOnlyProfile = []

    def addhasProfileOnly (self, parameter):
        self.listOfhasProfileOnlyProfile.append(parameter)
        self.hasProfileOnlyProfile = self.listOfhasProfileOnlyProfile
			
