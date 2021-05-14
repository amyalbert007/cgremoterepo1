package com.cg2021.MyFirstMavenProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
//Let's see the simple example to inherit the bean.
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! with maven" );
        Resource r=new ClassPathResource("NewFile.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee e1=(Employee)factory.getBean("e2");  
        e1.show();
    }
}
