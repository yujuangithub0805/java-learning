package org.yujuan.java.learning.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class People {
    private String name;
    private String type;
    private Boolean adult = false;

    public People(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
