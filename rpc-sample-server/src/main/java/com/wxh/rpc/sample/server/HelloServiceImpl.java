package com.wxh.rpc.sample.server;

import com.wxh.rpc.sample.api.HelloService;
import com.wxh.rpc.sample.api.Person;
import com.wxh.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }

}
