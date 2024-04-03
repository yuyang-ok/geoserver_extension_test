package com.diit.fabric;

public class Config {
    public String host;
    public int port;
    public String username;
    public String password;

    public Config(

            String host,
            int port,
            String username,
            String password) {
        this.host = host;
        this.port = port;
        this.password = password;
        this.username = username;
    }

    public String to_flight_connect_str() {
        return String.format("jdbc:arrow-flight-sql://%s:%d/?username=%s&password=%s", this.host, this.port,
                this.username, this.password);
    }

}
