package com.abiewska.jvm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("rest")
public class Rest {
	
	@GET
	@Path("/sleep/{time}")
	public String getTime(@PathParam("time") Integer time){
		Integer t = MyClass.sleep(time);
		return "Uspiony na: "+t;
		
	}

}
