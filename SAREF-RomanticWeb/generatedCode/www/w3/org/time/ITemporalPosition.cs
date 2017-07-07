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

using www.w3.org.owl;  
namespace www.w3.org.time
{
    [Class("http://www.w3.org/2006/time#TemporalPosition")]
    public interface ITemporalPosition : IEntity
    {
	  ///<summary> function AddHastrs_Exactly_1Thing</summary>  
	  ///<param name="IThing"></param>
      [Collection("http://www.w3.org/2006/time#hasTRS")]
	  ICollection<IThing> AddHastrs_Exactly_1Thing { get; set; }
	
	}
}