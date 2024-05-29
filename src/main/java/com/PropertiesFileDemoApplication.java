
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ConfigurationProperties("com")
public class PropertiesFileDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(PropertiesFileDemoApplication.class, args);
		System.out.println("PropertiesFileDemoApplication.main()");
		Emp e=ctx.getBean("emp",Emp.class);
		System.out.println(e);
	}

}
