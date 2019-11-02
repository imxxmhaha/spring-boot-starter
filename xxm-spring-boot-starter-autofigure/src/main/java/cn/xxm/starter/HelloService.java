package cn.xxm.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xxm
 * @create 2019-11-02 22:40
 */
@Service
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    //public HelloProperties getHelloProperties() {
    //    return helloProperties;
    //}
    //
    //public void setHelloProperties(HelloProperties helloProperties) {
    //    this.helloProperties = helloProperties;
    //}

    public String sayHello(String name) {

        return helloProperties.getPrefix() + name + "" + helloProperties.getSuffix();
    }
}
