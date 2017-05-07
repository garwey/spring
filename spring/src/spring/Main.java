package spring;

import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] args) {
		// ��ȡSpring��ApplicationContext�����ļ���ע��IOC������
		// (Map: key:String, bean��ǩ��id����ֵ ==>value:Object, bean��ǩclass������ָ���ʵ��)
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = new Person("James");
		Expression expr = new SpelExpressionParser().parseExpression(
				"������#{name}", new TemplateParserContext());
		System.out.print(expr.getValue(p));
	}
}
