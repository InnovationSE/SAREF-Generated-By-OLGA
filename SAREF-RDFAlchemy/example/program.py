from rdflib import Namespace, Graph, Literal, RDF, URIRef
from rdfalchemy.rdfSubject import rdfSubject
import datetime
import time

from w3id.org.saref.TemperatureUnit import TemperatureUnit
from w3id.org.saref.Measurement import Measurement
from w3id.org.saref.Temperature  import Temperature
from w3id.org.saref.TemperatureSensor  import TemperatureSensor


if __name__ == '__main__':
    g = rdfSubject.db = Graph()
    SAREF = Namespace("http://www.saref.instance/example/")
    temperatureUnit = TemperatureUnit(URIRef(SAREF + "1"))

    indoorMeasurement = Measurement(URIRef(SAREF + "2"))
    indoorMeasurement.addisMeasuredInOnly(temperatureUnit)
    indoorMeasurement.hasValue = 32
    ts = time.time()
    indoorMeasurement.hasTimestamp = datetime.datetime.fromtimestamp(ts).strftime('%Y-%m-%d %H:%M:%S')

    temperature = Temperature(URIRef(SAREF + "3"))
    temperature.addrelatesToMeasurementOnly(indoorMeasurement)

    temperatureSensor = TemperatureSensor(URIRef(SAREF + "4"))
    temperatureSensor.hasManufacturer = "CompanyA"
    temperatureSensor.hasModel = "M321"
    temperatureSensor.hasDescription = "Low range Zigee temperature sensor"
    temperatureSensor.addmakesMeasurementOnly(indoorMeasurement)

    g.serialize(destination='C:/output.ttl',format='turtle')

