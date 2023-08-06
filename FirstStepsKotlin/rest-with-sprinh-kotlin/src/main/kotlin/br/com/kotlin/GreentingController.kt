package br.com.kotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreentingController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeding(@RequestParam(value = "name", defaultValue = "World") name:String?): Greeting{
        return Greeting(counter.incrementAndGet(), content = "Hello $name!")
    }
}