package org.jake.write.ioc;

import cn.hutool.core.util.StrUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

/**
 * The type Xml bean definition reader.
 *
 * @author yujuan
 * @time 2019 /11/29 17:42:13
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    /**
     * Instantiates a new Xml bean definition reader.
     *
     * @param resourceLoader the resource loader
     * @author yujuan
     * @time 2019 /11/29 17:42:13
     */
    public XmlBeanDefinitionReader(ResourceLoader resourceLoader) {
        super(resourceLoader);
    }

    /**
     * Reader xml.
     *
     * @param location the location
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:42:13
     */
    public void readerXML(String location) throws Exception {
        InputStream inputStream = getResourceLoader().getResource(location).getInputStream();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputStream);
        registerBeanDefinitions(document);
        inputStream.close();
    }

    /**
     * Register bean definitions.
     *
     * @param document the document
     * @author yujuan
     * @time 2019 /11/29 17:42:13
     */
    private void registerBeanDefinitions(Document document) {
        Element root = document.getDocumentElement();
        parseBeanDefinitions(root);
    }

    /**
     * Parse bean definitions.
     *
     * @param root the root
     * @author yujuan
     * @time 2019 /11/29 17:42:13
     */
    private void parseBeanDefinitions(Element root) {
        NodeList childNodes = root.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            if (node instanceof Element) {
                Element ele = (Element) node;
                processBeanDefinition(ele);
            }
        }
    }

    /**
     * Process bean definition.
     *
     * @param element the element
     * @author yujuan
     * @time 2019 /11/29 17:42:13
     */
    private void processBeanDefinition(Element element) {
        String name = element.getAttribute("name");
        String className = element.getAttribute("class");
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setClassName(className);
        addPropertyValues(element, beanDefinition);
        getRegistry().put(name, beanDefinition);
    }

    /**
     * Add property values.
     *
     * @param element        the element
     * @param beanDefinition the bean definition
     * @author yujuan
     * @time 2019 /11/29 17:42:13
     */
    private void addPropertyValues(Element element, BeanDefinition beanDefinition) {
        NodeList propertyList = element.getElementsByTagName("property");
        for (int i = 0; i < propertyList.getLength(); i++) {
            Node node = propertyList.item(i);
            if (node instanceof Element) {
                Element propertyElement = (Element) node;
                String name = propertyElement.getAttribute("name");
                String value = propertyElement.getAttribute("value");
                if (!StrUtil.isBlank(value)) {
                    beanDefinition.getPropertyValues().addPropertyValue(new PropertyValue(name, value));
                } else {
                    String ref = propertyElement.getAttribute("ref");
                    if (StrUtil.isBlank(ref)) {
                        throw new IllegalArgumentException("<property> 标签中应该有ref或者value的其中一项");
                    }
                    BeanReference beanReference = new BeanReference(ref);
                    beanDefinition.getPropertyValues().addPropertyValue(new PropertyValue(name, beanReference));
                }
            }
        }
    }

}
