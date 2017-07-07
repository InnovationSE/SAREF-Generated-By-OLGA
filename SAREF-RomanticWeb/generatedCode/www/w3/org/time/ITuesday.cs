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
    [Class("http://www.w3.org/2006/time#Tuesday")]
    public interface ITuesday : IDayOfWeek
    {
	}
}