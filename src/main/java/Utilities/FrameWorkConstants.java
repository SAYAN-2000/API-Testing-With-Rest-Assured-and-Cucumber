package Utilities;

public class FrameWorkConstants {
	
	public static String GET_URI()
	{
		String res = "https://api.coindesk.com/v1/bpi/currentprice.json";
		return res;
	}
	
	public static String POST_URI() {
		String res="https://reqres.in/api/users";
		return res;
	}
	public static String DELETE_URI() {
		String res= "https://reqres.in";
		return res;
	}
	public static String PATCH_URI() {
		String res = "https://reqres.in";
		return res;
	}
	
	public static String SWAGGER_URI() {
		String res="https://petstore.swagger.io/v2/";
		return res;
	}

}
