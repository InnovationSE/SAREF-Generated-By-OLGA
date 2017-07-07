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
    [Class("https://w3id.org/saref#EventFunction")]
    public interface IEventFunction  : IFunction
    {
	  ///<summary> function AddHascommand_Only_NotifyCommand</summary>  
	  ///<param name="INotifyCommand"></param>
      [Collection("https://w3id.org/saref#hasCommand")]
	  ICollection<INotifyCommand> AddHascommand_Only_NotifyCommand { get; set; }
	
	  ///<summary> function AddHasthresholdmeasurement_Min_1Measurement</summary>  
	  ///<param name="IMeasurement"></param>
      [Collection("https://w3id.org/saref#hasThresholdMeasurement")]
	  ICollection<IMeasurement> AddHasthresholdmeasurement_Min_1Measurement { get; set; }
	
	}
}