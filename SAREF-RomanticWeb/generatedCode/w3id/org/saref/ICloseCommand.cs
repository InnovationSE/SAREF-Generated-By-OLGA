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
    [Class("https://w3id.org/saref#CloseCommand")]
    public interface ICloseCommand  : ICommand
    {
	  ///<summary> function AddActsupon_Only_OpenCloseState</summary>  
	  ///<param name="IOpenCloseState"></param>
      [Collection("https://w3id.org/saref#actsUpon")]
	  ICollection<IOpenCloseState> AddActsupon_Only_OpenCloseState { get; set; }
	
	}
}