package org.jake.write.ioc;

import java.io.InputStream;

/**
 * The interface Resource.
 *
 * @author yujuan
 * @time 2019 /11/29 17:41:58
 */
public interface Resource {

    /**
     * Gets input stream.
     *
     * @return the input stream
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:41:58
     */
    InputStream getInputStream() throws Exception;
}
