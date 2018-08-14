/**
 *
 */
package org.rakesh.sahu.elm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sahu.rakeshh@gmail.com
 *
 *         #java,#j2ee,#spring,#rest,#hibernate
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		triangle.draw();

		Circle circle = (Circle) beanFactory.getBean("circle");
		circle.draw();
	}

}
