package com.example.demo8

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @RequestMapping("/hello")
    fun sayHello() = "Hello,Java!"
}