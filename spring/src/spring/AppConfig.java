package spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Value("jack") String name;
	@Bean(name = "Jacky")
	public Person person() {
		Person p = new Person();
		p.setName(name);
		p.setDog(dog());
		return p;
	}

	@Bean(name = "dog")
	public Dog dog() {
		return new Dog();
	}

}
