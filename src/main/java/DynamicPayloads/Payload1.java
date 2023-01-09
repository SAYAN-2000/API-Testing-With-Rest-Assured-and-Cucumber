package DynamicPayloads;

public class Payload1 {
	public static String getpayload(String id) {
		return id;
	}
	public static String Swaggerpayload(String no)
	{
		return "pet/"+no+"/uploadImage";
	}
}
