package DesignPatterns.Builder;

public class UrlBuilder {
    public   String protocol;
    public  String hostName;
    public  String port;
    public  String pathParam;
    public  String queryParam;


    public UrlBuilder setProtocol(String protocol){
        this.protocol = protocol;
        return this;
    }
    public UrlBuilder setHostName(String hostName){
        this.hostName = hostName;
        return this;
    }
    public UrlBuilder setPort(String port){
        this.port = port;
        return this;
    }

    public UrlBuilder setPathParam(String pathParam){
        this.pathParam = pathParam;
        return this;
    }

    public UrlBuilder setQueryParam(String queryParam){
        this.queryParam = queryParam;
        return this;
    }
    public Url build(){
        return new Url(this);
    }

}
