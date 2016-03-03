import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	
	@Path("/DtoRConvert")
	public class DtoRCurrencyConverter {
		
		@GET
		@Produces("application/xml")
		public String convertRtoD() {
	 
			Double Rupee = 67.45;
			Double Dollar = 0.0;
			Rupee = Rupee*Dollar;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nRupee value Output: \n\n" + Rupee;
			return "<DtoRConvert>" + "<Dollar>" + Dollar + "</Dollar>" + "<DtoRoutput>" + result + "</DtoRoutput>" + "</DtoRConvert>";
		}
	 
		
		@Path("{D}")
		@GET
		@Produces("application/xml")
		public String RtoDfromInput(@PathParam("D") Double D) {
		
			Double Rupee = 67.45;
			
			Rupee = D*Rupee;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nDollar Value Output: \n\n" + Rupee;
			return "<DtoRConvert>" + "<Dollar>" + D + "</Dollar>" + "<DtoRoutput>" + result + "</DtoRoutput>" + "</DtoRConvert>";
		}
	}


