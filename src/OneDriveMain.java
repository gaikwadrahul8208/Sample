import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;

import com.cloudrail.si.CloudRail;
import com.cloudrail.si.servicecode.commands.awaitCodeRedirect.LocalReceiver;
import com.cloudrail.si.services.OneDrive;

@Controller
public class OneDriveMain {
	

	public static void main(String[] args) throws FileNotFoundException{
		String path = "/";

		CloudRail.setAppKey("5a570436fd458621e44b2d4d");
    	InputStream is = new FileInputStream("C://Users//lenovo//Desktop//DeskTop//TestPlugin//testgif.gif");
    	
		OneDrive services = new OneDrive(
				new LocalReceiver(2000),
				"985281a6-ff2a-4bbd-966a-511d4636a2c5",
				"EwA4A8l6BAAU7p9QDpi/D7xJLwsTgCg3TskyTaQAAZybAZ9kHGfDInV6LBcfwL1OartL2mUrmrjMl6lwiGL/Rc3M9yaPMDWBR9RfFT/vJL7SEUzsLwUkCpMXsff0MgTYSjZCtjqWrh3PauKxPsBHNIPtjyR6MWxa1ZwT+adAVGbEzVDj+PrCRS0+UI+YGMV0c3Tc5mMgIK5RZtuuupRwQHTXiNJ5sHWHanPQ7vYoHh0kfXYdSiJ27MfFjvrdNcaS0Xxc1WGR3Ngd/jnejstfleWxBwJJF0NilIDJkZVXNlySIufxJXo4P/ru74ROBLyqfvrlznA7zVC/a57yyl7B0VyL8BZ/tiuyMHJeMlyb+bvNHGUIP5/JdCtvlWQTLBcDZgAACBxSPqRTkyNUCAKmqW8HdubMjaouR/IYXiAu3WsFt2UpFQJ2Za50spqHo9iw0rBcMc+a9BAetcHZ+cD/kgwx6fpd2hRNsyvcaxVkNPTFWzglSHRLPNuziLetGht2ToU9pRC6wuqWQtWbcFOMvA/hnVt0R3lH6QSTsb8kCRuSlvcW03dKj2CPxjOOqAI24y3bJ6oPnbVDvO5p32x35aVA9FuuPZbgBNyQxWpmmUsDGBhRP2vQyJ3Ct7GwDWkARr2WDMCeG4OJEP5KeUqJUX8QKVemqhqG1SFEztKL1BJN9h3eaMdmbiSr1UeFfp5XcVv/spEplnAud+I+Fw1gKDgsZryLcrQPKUw865NfXopljkiwHnFwbM/k4aIjJTYtsaHRcZQ/kGhYzqgIOzDEJv3nJ/cJzG+og/kWBIU5vFKaCDBtHeGQsHKlVL+cRin48a0c8PwS6RypwREcWWwELOK/OD/Bel393ak5KNNSd6MpH8rSw0j3/MchNHQtL504EXfY+HDOYZ/tAIY3obOvudLQcwFq/jFHqLn2kkLd410PO4OEEmRwFjKpB2ZDOarBUZMhZVC0ErO+0NiAY27/rgRcu23tcOK1OAgqCqujNqhkcuok+EN+k54TbCZvtESOithyFOzfiyRlETkUfvrqih0DuCWc3CnfnCcl2+azxIK4GDzUuEjW87cJ/Nr0sNCsVB7CaQ/0RgI=",
//				"qthuEZSOAJP8585([}ekn6)",
				"https://onedrive.live.com",
				"Mb8c9cb2d-f626-18b0-8f7a-3d57fe31e799");
		System.out.println("After Constructor");
		
		/*services.upload(
				path,
				is,
				1024L,
				true
				);*/
		
		String sharedLink = services.createShareLink("/test_jpeg.jpg");
		System.out.println("sharedLink" +sharedLink);
	}
}
