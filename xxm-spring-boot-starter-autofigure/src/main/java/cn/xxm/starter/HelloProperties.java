package cn.xxm.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xxm
 * @create 2019-11-02 22:40
 */
@ConfigurationProperties(prefix = "xxm.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
