package org.jake.write.ioc;

public class PropertyValue {

    private String name;

    private Object value;

  public PropertyValue() {
  }

  public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }
}
