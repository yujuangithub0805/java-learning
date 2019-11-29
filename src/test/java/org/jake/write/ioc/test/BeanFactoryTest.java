package org.jake.write.ioc.test;

import org.jake.write.ioc.*;
import org.junit.Test;

public class BeanFactoryTest {
    private String className = "org.jake.write.ioc.test.HelloWorld";

    private String property = "text";

    private String value = "测试";

    private String name = "hello";

    @Test
    public void test() throws Exception {
        BeanFactory beanFactory = new AutowireBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setClassName(className);
        PropertyValues propertyValues = new PropertyValues();
        beanDefinition.setPropertyValues(propertyValues);
        beanDefinition.getPropertyValues().addPropertyValue(new PropertyValue(property, value));
        beanFactory.registerBeanDefinition(name, beanDefinition);
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean(name);
        helloWorld.say();
    }

}
