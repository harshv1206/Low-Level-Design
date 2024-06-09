package DesignPatterns.CreationalDesignPatterns.Builder;

public class Url {
    private String protocol;
    private String hostName;
    private String port;
    private String queryParam;
    private String pathParam;

    public Url(UrlBuilder urlBuilder) {
        this.protocol = urlBuilder.protocol;
        this.hostName = urlBuilder.hostName;
        this.pathParam = urlBuilder.pathParam;
        this.port = urlBuilder.port;
        this.queryParam = urlBuilder.queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    public String getPathParam() {
        return pathParam;
    }

    public void setPathParam(String pathParam) {
        this.pathParam = pathParam;
    }
}
