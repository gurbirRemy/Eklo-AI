import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


import javax.imageio.ImageIO;


public class chatbot {
	
	public static void getloc(String address, String filename) throws IOException, InterruptedException {
		
		double coordx = 0;
		double coordy = 0;
		
		String URL_address = "https://maps.googleapis.com/maps/api/geocode/json?address="+address.replace(" ", "+")+"&key=AIzaSyAuZVmhMiDiazx5Nn7GhOI8GyAfIFdpzFU";
		
		System.out.println(URL_address);
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(URL_address)).build();
				HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());
		
        String[] splitted = response.body().split(String.valueOf('"'));
        String name = "";
        
        for (int i =0; i<splitted.length;i++) {
        	if (splitted[i].contains("formatted_address")) name = splitted[i+2];
        	if (splitted[i].contains("location")  && !splitted[i].contains("location_type")) {
        		coordx = Double.valueOf(format(splitted[i+3]));
        		coordy = Double.valueOf(format(splitted[i+5]));
        		break;
        	}
        }

        String URL_string = "https://maps.googleapis.com/maps/api/streetview?size=400x400&location="+coordx+","+coordy+"\n&fov=80&heading=70&pitch=0&key=AIzaSyAuZVmhMiDiazx5Nn7GhOI8GyAfIFdpzFU".replace(Character.toString(10), "");
		System.out.println(URL_string);
//		
		
		URL y = new URL(URL_string);
		
		
		BufferedImage image = ImageIO.read(y);
		
		File outputfile = new File(filename+".jpg");
		ImageIO.write(image, "jpg", outputfile);
		
		
	}
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		
		
//		String URL;
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Please input an address: ");
//		String address = in.nextLine().replace(" ", "+");
//		
//		System.out.print("\n\n");
		
		getloc("800 academy way","filename");
		
		
        
        
//        146,148
        
//        coordx = Double.valueOf(format(splitted[146]));
//        coordy = Double.valueOf(format(splitted[148]));
//        
//        System.out.println(format(splitted[125]));
//        System.out.println(coordx);
//        System.out.println(coordy);
        
        
        
        
		
		
		

		
	}
	
	public static String format(String s) {
		return s.replace(":","").replace(",","").replace("}", "").replace("{", "").strip();
	}
	
	
}
