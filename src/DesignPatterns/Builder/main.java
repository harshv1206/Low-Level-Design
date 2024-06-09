package DesignPatterns.Builder;

public class main {
    public static void main(String[] args) {

        UrlBuilder builder = new UrlBuilder();
        builder.setProtocol("http://");
        builder.setHostName("mywebsite:");
        builder.setPort("8080");
        Url url = builder.build();

        System.out.print(url.getProtocol());
        System.out.print(url.getHostName());
        System.out.print(url.getPort());

    }
}
