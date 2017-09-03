package hello;

import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/docs")
    public String docs() {  		
        return "docs and docs";
    }
    
    @RequestMapping("/users")
    public JSONObject users() {  	
    	 JSONObject obj = new JSONObject();

         obj.put("name", "foo");
         obj.put("num", new Integer(100));
         obj.put("balance", new Double(1000.21));
         obj.put("is_vip", new Boolean(true));


    		
        return obj;
    }
    
}
