package top.macaulish.pls.control

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping(path = ["/hello"])
    fun helloWorld():String{
        return "Hello"
    }
}