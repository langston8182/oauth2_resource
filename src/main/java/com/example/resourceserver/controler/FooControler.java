package com.example.resourceserver.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.resourceserver.modele.Foo;

/**
 * @author dem9527
 */
@Controller
public class FooControler {
    //@PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/private")
    @ResponseBody
    public Foo findById() {
        return new Foo(2l, "str");
    }
}
