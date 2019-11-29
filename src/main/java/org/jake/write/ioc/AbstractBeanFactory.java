package org.jake.write.ioc;

import java.util.HashMap;


/**
 * 抽象bean 工程
 *
 * @author yujuan
 * @time 2019 /11/29 17:30:27
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    /**
     * 用来存放bean的容器
     */
    private HashMap<String, BeanDefinition> map = new HashMap<>();

    /**
     * Gets bean.
     *
     * @param name the name
     * @return the bean
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:30:27
     */
    @Override
    public Object getBean(String name) throws Exception {
        BeanDefinition beanDefinition = map.get(name);
        if (beanDefinition == null) {
            throw new IllegalArgumentException("no bean named " + name + " is defined");
        }
        Object bean = beanDefinition.getBean();
        if (bean == null) {
            bean = doCreate(beanDefinition);
        }
        return bean;
    }

    /**
     * 创建bean 由具体的实现工厂去实现
     *
     * @param beanDefinition the bean definition
     * @return the object
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:30:27
     */
    abstract Object doCreate(BeanDefinition beanDefinition) throws Exception;

    /**
     * 注册bean
     *
     * @param name           the name
     * @param beanDefinition the bean definition
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:30:27
     */
    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreate(beanDefinition);
        beanDefinition.setBean(bean);
        map.put(name, beanDefinition);
    }
}
