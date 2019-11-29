package org.jake.write.ioc;


/**
 * The interface Bean factory.
 *
 * @author yujuan
 * @time 2019 /11/29 17:30:01
 */
public interface BeanFactory {

    /**
     * 根据name 获取bean
     *
     * @param name the name
     * @return the bean
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:30:01
     */
    Object getBean(String name) throws Exception;

    /**
     * 注册bean
     *
     * @param name           the name
     * @param beanDefinition the bean definition
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:30:01
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
