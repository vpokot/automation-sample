package com.cnh.test.properties;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface DefaultConfig extends Config {
    @Key("base.url")
    String host();
    @Key("authorization")
    String authToken();
}
