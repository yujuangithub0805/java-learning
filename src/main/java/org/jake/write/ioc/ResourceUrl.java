package org.jake.write.ioc;


import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * The type Resource url.
 *
 * @author yujuan
 * @time 2019 /11/29 17:42:07
 */
public class ResourceUrl implements Resource {
    /**
     * The Url.
     */
    private URL url;

    /**
     * Instantiates a new Resource url.
     *
     * @param url the url
     * @author yujuan
     * @time 2019 /11/29 17:42:07
     */
    public ResourceUrl(URL url) {
        this.url = url;
    }


    /**
     * Gets input stream.
     *
     * @return the input stream
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /11/29 17:42:07
     */
    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
