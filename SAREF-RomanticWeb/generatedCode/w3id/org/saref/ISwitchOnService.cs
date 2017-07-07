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
    [Class("https://w3id.org/saref#SwitchOnService")]
    public interface ISwitchOnService  : IService
    {
	  ///<summary> function AddRepresents_Some_OnOffFunction</summary>  
	  ///<param name="IOnOffFunction"></param>
      [Collection("https://w3id.org/saref#represents")]
	  ICollection<IOnOffFunction> AddRepresents_Some_OnOffFunction { get; set; }
	
	  ///<summary> function AddIsofferedby_Some_LightSwitch</summary>  
	  ///<param name="ILightSwitch"></param>
      [Collection("https://w3id.org/saref#isOfferedBy")]
	  ICollection<ILightSwitch> AddIsofferedby_Some_LightSwitch { get; set; }
	
	}
}