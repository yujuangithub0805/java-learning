package org.jake.write.ioc;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Abstract bean definition reader.
 *
 * @author yujuan
 * @time 2019 /11/29 17:39:26
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    /**
     * The Registry.
     */
    private Map<String, BeanDefinition> registry;

    /**
     * The Resource loader.
     */
    private ResourceLoader resourceLoader;

    /**
     * Instantiates a new Abstract bean definition reader.
     *
     * @param resourceLoader the resource loader
     * @author yujuan
     * @time 2019 /11/29 17:39:26
     */
    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    /**
     * Gets registry.
     *
     * @return the registry
     * @author yujuan
     * @time 2019 /11/29 17:39:26
     */
    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    /**
     * Gets resource loader.
     *
     * @return the resource loader
     * @author yujuan
     * @time 2019 /11/29 17:39:26
     */
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
