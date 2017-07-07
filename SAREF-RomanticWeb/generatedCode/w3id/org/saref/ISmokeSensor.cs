///<summary> 
/// This file is automatically generated by OLGA
/// author OLGA
/// version 1.0 
///</summary> 

using RomanticWeb.Entities;
using RomanticWeb.Mapping.Attributes;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;
using System.Reflection;
using static System.Net.WebRequestMethods;

using w3id.org.saref;  
namespace w3id.org.saref
{
    [Class("https://w3id.org/saref#SmokeSensor")]
    public interface ISmokeSensor  : ISensor
    {
	  ///<summary> function AddMeasuresproperty_Some_Smoke</summary>  
	  ///<param name="ISmoke"></param>
      [Collection("https://w3id.org/saref#measuresProperty")]
	  ICollection<ISmoke> AddMeasuresproperty_Some_Smoke { get; set; }
	
	  ///<summary> function AddConsistsof_Some_Sensor</summary>  
	  ///<param name="ISensor"></param>
      [Collection("https://w3id.org/saref#consistsOf")]
	  ICollection<ISensor> AddConsistsof_Some_Sensor { get; set; }
	
	  ///<summary> function AddHasfunction_Some_EventFunction</summary>  
	  ///<param name="IEventFunction"></param>
      [Collection("https://w3id.org/saref#hasFunction")]
	  ICollection<IEventFunction> AddHasfunction_Some_EventFunction { get; set; }
	
	}
}