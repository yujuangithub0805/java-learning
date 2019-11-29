package org.jake.write.ioc;

/**
 * The type Property value.
 *
 * @author yujuan
 * @time 2019 /11/29 17:41:39
 */
public class PropertyValue {

    /**
     * The Name.
     */
    private String name;

    /**
     * The Value.
     */
    private Object value;

    /**
     * Instantiates a new Property value.
     *
     * @author yujuan
     * @time 2019 /11/29 17:41:39
     */
    public PropertyValue() {
  }

    /**
     * Instantiates a new Property value.
     *
     * @param name  the name
     * @param value the value
     * @author yujuan
     * @time 2019 /11/29 17:41:39
     */
    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Gets name.
     *
     * @return the name
     * @author yujuan
     * @time 2019 /11/29 17:41:39
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets value.
     *
     * @return the value
     * @author yujuan
     * @time 2019 /11/29 17:41:39
     */
    public Object getValue() {
        return this.value;
    }
}
