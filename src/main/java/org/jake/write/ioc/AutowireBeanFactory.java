package org.jake.write.ioc;

import java.lang.reflect.Field;

/**
 * The type Autowire bean factory.
 *
 * @author yujuan
 * @time 2019 /11/29 17:39:45
 */
public class AutowireBeanFactory extends AbstractBeanFactory {


    /**
     * 实现类实现对bean的创建
     *
     * @param beanDefinition the bean definition
     * @return the object
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:39:46
     */
    @Override
    Object doCreate(BeanDefinition beanDefinition) throws Exception {
        Object bean = beanDefinition.getBeanClass().newInstance();
        addPropertyValue(bean, beanDefinition);
        return bean;
    }

    /**
     * 对应字段的set
     *
     * @param bean           the bean
     * @param beanDefinition the bean definition
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:39:46
     */
    private void addPropertyValue(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            declaredField.set(bean, value);
        }
    }
}
