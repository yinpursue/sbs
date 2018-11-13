package cn.yin.xmlRequestAndResponse.controller;

import cn.yin.xmlRequestAndResponse.entity.XmlUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlController {

    @PostMapping(value = "/xmlUser",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    public XmlUser create(@RequestBody XmlUser user) {
        user.setName("hello : " + user.getName());
        user.setAge(user.getAge());
        return user;
    }
}
