using RomanticWeb;
using RomanticWeb.DotNetRDF;
using RomanticWeb.Entities;
using RomanticWeb.Mapping;
using RomanticWeb.Ontologies;
using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using VDS.RDF;
using VDS.RDF.Writing;
using w3id.org.saref;

namespace SarefApp
{
    class Program
    {
        static IEntityContext context;
        static ITripleStore store;
        static string clientURI = "http://www.saref.instance/example";

        static void Main(string[] args)
        {
            InitContext();
            CreateThingsTopology();

            IGraph g = new Graph();
            IList graphList = store.Graphs.ToList();

            foreach (IGraph currentGraph in graphList)
            {
                g.Merge(currentGraph);
            }

            RdfXmlWriter rdfxmlwriter = new RdfXmlWriter();
            rdfxmlwriter.Save(g, "C:\\output.rdf");
        }

        public static void CreateThingsTopology()
        {
            Idegree_Celsius degreeCelius = context.Create<Idegree_Celsius>(new Uri(clientURI+"#1"));

            IMeasurement indoorTemperature = context.Create<IMeasurement>(new Uri(clientURI + "#2"));
            indoorTemperature.AddIsmeasuredin_Only_UnitOfMeasure.Add(degreeCelius);
            indoorTemperature.Hasvalue = 32;
            indoorTemperature.Hastimestamp = DateTime.UtcNow;

            ITemperature temperature = context.Create<ITemperature>(new Uri(clientURI + "#3"));
            temperature.AddRelatestomeasurement_Only_Measurement.Add(indoorTemperature);
           
            ITemperatureSensor temperatureSensor = context.Create<ITemperatureSensor>(new Uri(clientURI + "#4"));
            temperatureSensor.Hasmanufacturer = "CompanyA";
            temperatureSensor.Hasmodel = "M321";
            temperatureSensor.Hasdescription = "Low range Zigee temperature sensor";
            temperatureSensor.AddMakesmeasurement_Only_Measurement.Add(indoorTemperature);
           
            // commit data to store
            context.Commit();
        }

            public static void InitContext()
        {
            var contextFactory = new EntityContextFactory();
            contextFactory.WithMappings((MappingBuilder builder) =>
            {
                builder.FromAssemblyOf<ITemperatureSensor>();
            });

            store = new TripleStore();
            contextFactory.WithDotNetRDF(store);
            contextFactory.WithMetaGraphUri(new Uri(clientURI));
            context = contextFactory.CreateContext();
                    
        }
    }
}
