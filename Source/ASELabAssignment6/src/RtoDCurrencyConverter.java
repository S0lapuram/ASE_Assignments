import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/RtoDConvert")
public class RtoDCurrencyConverter {
	
	@GET
	@Produces("application/xml")
	public String convertRtoD() {
 
		Double Rupee = 0.0;
		Double Dollar = 0.015;
		Dollar = Rupee*Dollar;
 
		String result = "@Produces(\"application/xml\") Output: \n\nDollar Value Output: \n\n" + Dollar;
		return "<RtoDConvert>" + "<Rupee>" + Rupee + "</Rupee>" + "<RtoDoutput>" + result + "</RtoDoutput>" + "</RtoDConvert>";
	}
 
	
	@Path("{R}")
	@GET
	@Produces("application/xml")
	public String RtoDfromInput(@PathParam("R") Double R) {
	
		Double Dollar = 0.015;
		Dollar = R*Dollar;
 
		String result = "@Produces(\"application/xml\") Output: \n\nRupee Value Output: \n\n" + Dollar;
		return "<RtoDConvert>" + "<Rupee>" + R + "</Rupee>" + "<RtoDoutput>" + result + "</RtoDoutput>" + "</RtoDConvert>";
	}
}
