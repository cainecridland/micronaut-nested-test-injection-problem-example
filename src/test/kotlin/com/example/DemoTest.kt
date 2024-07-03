package com.example
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import jakarta.inject.Inject
import org.junit.jupiter.api.Nested

@MicronautTest
class DemoTest {

//    @Nested
//    inner class InnerDemoTest {

        @Inject
        lateinit var application: EmbeddedApplication<*>

        @Inject
        lateinit var myThing: MyThing

        @Test
        fun testItWorks() {
            Assertions.assertTrue(application.isRunning)
        }

        @Test
        fun testInjection() {
            println("START")
            myThing.helloWorld()
            println("END")
        }
//    }

}
