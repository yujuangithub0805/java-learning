package org.jake.write.ioc.test;

import org.jake.write.ioc.*;
import org.junit.Test;

import java.util.Map;

public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xml = new XmlBeanDefinitionReader(new ResourceLoader());
        xml.readerXML("myspring.xml");
        BeanFactory beanFactory = new AutowireBeanFactory();

        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xml.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
        ReferenceBean referenceBean = (ReferenceBean) beanFactory.getBean("referenceBean");
        referenceBean.say();
    }

}
