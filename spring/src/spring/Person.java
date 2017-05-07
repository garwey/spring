package spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware {
	private Set books;
	private Dog dog;
	private String name;
	private Properties properties;
	private List<String> schools;
	private Map scores;
	String beanName;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Set getBooks() {
		return books;
	}

	public Dog getDog() {
		return dog;
	}

	public String getName() {
		return name;
	}

	public Properties getProperties() {
		return properties;
	}

	public List<String> getSchools() {
		return schools;
	}

	public Map getScores() {
		return scores;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setSchools(List<String> schools) {
		this.schools = schools;
	}

	public void setScores(Map scores) {
		this.scores = scores;
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}

	public static void dig() {
		System.out.println("digging");
	}

}
