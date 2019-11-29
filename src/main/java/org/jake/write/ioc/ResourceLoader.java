package org.jake.write.ioc;

import java.net.URL;

/**
 * The type Resource loader.
 *
 * @author yujuan
 * @time 2019 /11/29 17:42:02
 */
public class ResourceLoader {
    /**
     * Gets resource.
     *
     * @param location the location
     * @return the resource
     * @author yujuan
     * @time 2019 /11/29 17:42:02
     */
    public ResourceUrl getResource(String location) {
        URL url = this.getClass().getClassLoader().getResource(location);
        return new ResourceUrl(url);
    }

}
