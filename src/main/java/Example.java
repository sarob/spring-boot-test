import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController /*web controller*/
@EnableAutoConfiguration /*guess how to configure spring*/
public class Example {
		@RequestMapping("/") /*routing for HTTP / request mapped to home method */
		String home() {
			return "Hello World!";
		}
		
		public static void main(String[] args) {
			SpringApplication.run(Example.class, args);/*bootstraps app, 
			starts spring, then tomcat, pass Example.class to the run method 
			of SpringApplication with args*/
		}
}