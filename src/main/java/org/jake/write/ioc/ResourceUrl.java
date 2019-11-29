package org.jake.write.ioc;


import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ResourceUrl implements Resource {
    private URL url;

    public ResourceUrl(URL url) {
        this.url = url;
    }


    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
