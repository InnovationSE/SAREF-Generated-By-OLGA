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
    [Class("http://www.wurvoc.org/vocabularies/om-1.8/euro")]
    public interface Ieuro : ICurrency
    {
	}
}