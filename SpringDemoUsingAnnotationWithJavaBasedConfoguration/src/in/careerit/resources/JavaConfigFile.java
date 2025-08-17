package in.careerit.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("in.careerit.beans")
//@ComponentScan({"in.careerit.beans"})

@ComponentScan(basePackages = {"in.careerit.beans"} )
public class JavaConfigFile {
	
}