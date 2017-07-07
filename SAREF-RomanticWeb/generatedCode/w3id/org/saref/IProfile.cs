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
    [Class("https://w3id.org/saref#Profile")]
    public interface IProfile : IEntity
    {
	  ///<summary> function AddHastime_Only_Time</summary>  
	  ///<param name="ITime"></param>
      [Collection("https://w3id.org/saref#hasTime")]
	  ICollection<ITime> AddHastime_Only_Time { get; set; }
	
	  ///<summary> function AddIsabout_Only_Property</summary>  
	  ///<param name="IProperty"></param>
      [Collection("https://w3id.org/saref#isAbout")]
	  ICollection<IProperty> AddIsabout_Only_Property { get; set; }
	
	  ///<summary> function AddIsabout_Only_Commodity</summary>  
	  ///<param name="ICommodity"></param>
      [Collection("https://w3id.org/saref#isAbout")]
	  ICollection<ICommodity> AddIsabout_Only_Commodity { get; set; }
	
	  ///<summary> function AddHasprice_Only_Price</summary>  
	  ///<param name="IPrice"></param>
      [Collection("https://w3id.org/saref#hasPrice")]
	  ICollection<IPrice> AddHasprice_Only_Price { get; set; }
	
	  ///<summary> function AddConsistsof_Only_Profile</summary>  
	  ///<param name="IProfile"></param>
      [Collection("https://w3id.org/saref#consistsOf")]
	  ICollection<IProfile> AddConsistsof_Only_Profile { get; set; }
	
	}
}