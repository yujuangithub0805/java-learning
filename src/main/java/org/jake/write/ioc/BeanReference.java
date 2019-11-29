package org.jake.write.ioc;

/**
 * The type Bean reference.
 *
 * @author yujuan
 * @time 2019 /11/29 17:41:46
 */
public class BeanReference {

    /**
     * The Name.
     */
    private String name;
    /**
     * The Bean.
     */
    private Object bean;

    /**
     * Instantiates a new Bean reference.
     *
     * @param name the name
     * @author yujuan
     * @time 2019 /11/29 17:41:46
     */
    public BeanReference(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     * @author yujuan
     * @time 2019 /11/29 17:41:47
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @author yujuan
     * @time 2019 /11/29 17:41:47
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets bean.
     *
     * @return the bean
     * @author yujuan
     * @time 2019 /11/29 17:41:47
     */
    public Object getBean() {
        return bean;
    }

    /**
     * Sets bean.
     *
     * @param bean the bean
     * @author yujuan
     * @time 2019 /11/29 17:41:47
     */
    public void setBean(Object bean) {
        this.bean = bean;
    }
}
