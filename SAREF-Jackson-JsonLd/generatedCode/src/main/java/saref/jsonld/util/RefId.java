package saref.jsonld.util;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;

public class RefId {

	@JsonldId
	public String id;
	
	public RefId(String id)
	{
		this.id = id;
	}
}