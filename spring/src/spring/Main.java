package spring;

import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] args) {
		// 获取Spring的ApplicationContext配置文件，注入IOC容器中
		// (Map: key:String, bean标签的id属性值 ==>value:Object, bean标签class属性所指类的实例)
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = new Person("James");
		Expression expr = new SpelExpressionParser().parseExpression(
				"名字是#{name}", new TemplateParserContext());
		System.out.print(expr.getValue(p));
	}
}
