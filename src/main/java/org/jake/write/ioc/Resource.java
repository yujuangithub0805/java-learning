package org.jake.write.ioc;

import java.io.InputStream;

public interface Resource {

    InputStream getInputStream() throws Exception;
}
