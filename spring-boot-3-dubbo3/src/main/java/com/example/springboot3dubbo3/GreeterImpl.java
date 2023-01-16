package com.example.springboot3dubbo3;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author daixiaodong
 * @date 2023/1/16
 */
@DubboService(protocol = CommonConstants.TRIPLE, version = "1.0")
public class GreeterImpl extends DubboGreeterTriple.GreeterImplBase {
    @Override
    public HelloReply greet(HelloRequest request) {
        return HelloReply.newBuilder()
                .setMessage("Hello," + request.getName() + "!")
                .build();
    }
}