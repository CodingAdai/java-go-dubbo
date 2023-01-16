package com.example.springboot3dubbo3;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author daixiaodong
 * @date 2023/1/16
 */
@DubboService(protocol = CommonConstants.DUBBO)
public class DemoServiceImpl implements DemoService {
    @Override
    public Response sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: " + RpcContext.getCurrentServiceContext().getRemoteAddress());
        return new Response(true, name);
    }
}