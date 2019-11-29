package org.jake.write.ioc;

/**
 * The type Bean definition.
 *
 * @author yujuan
 * @time 2019 /11/29 17:38:31
 */
public class BeanDefinition {
    /**
     * The Bean
     */
    private Object bean;
    /**
     * The Bean class.
     */
    private Class beanClass;
    /**
     * The Class name.
     */
    private String className;

    /**
     * The Property values.
     */
    private PropertyValues propertyValues = new PropertyValues();

    /**
     * Gets bean.
     *
     * @return the bean
     * @author yujuan
     * @time 2019 /11/29 17:38:31
     */
    public Object getBean() {
        return bean;
    }

    /**
     * Sets bean.
     *
     * @param bean the bean
     * @author yujuan
     * @time 2019 /11/29 17:38:31
     */
    public void setBean(Object bean) {
        this.bean = bean;
    }

    /**
     * Gets bean class.
     *
     * @return the bean class
     * @author yujuan
     * @time 2019 /11/29 17:38:31
     */
    public Class getBeanClass() {
        return beanClass;
    }

    /**
     * Sets bean class.
     *
     * @param beanClass the bean class
     * @author yujuan
     * @time 2019 /11/29 17:38:31
     */
    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    /**
     * Gets class name.
     *
     * @return the class name
     * @author yujuan
     * @time 2019 /11/29 17:38:31
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets class name.
     *
     * @param className the class name
     * @author yujuan
     * @time 2019 /11/29 17:38:31
     */
    public void setClassName(String className) {
        this.className = className;
        try {
            this.beanClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Gets property values.
     *
     * @return the property values
     * @author yujuan
     * @time 2019 /11/29 17:38:32
     */
    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    /**
     * Sets property values.
     *
     * @param propertyValues the property values
     * @author yujuan
     * @time 2019 /11/29 17:38:32
     */
    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
