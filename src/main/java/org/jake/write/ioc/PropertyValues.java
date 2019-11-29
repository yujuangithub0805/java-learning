package org.jake.write.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Property values.
 *
 * @author yujuan
 * @time 2019 /11/29 17:41:52
 */
public class PropertyValues {

    /**
     * The Property value list.
     */
    private List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * Instantiates a new Property values.
     *
     * @author yujuan
     * @time 2019 /11/29 17:41:52
     */
    public PropertyValues() {
    }

    /**
     * Add property value.
     *
     * @param propertyValue the property value
     * @author yujuan
     * @time 2019 /11/29 17:41:52
     */
    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    /**
     * Gets property value list.
     *
     * @return the property value list
     * @author yujuan
     * @time 2019 /11/29 17:41:52
     */
    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
