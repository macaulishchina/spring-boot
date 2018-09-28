package top.macaulish.pls

import org.apache.log4j.Logger
import org.junit.Test

class TestWhaterer {

    private val log = Logger.getLogger(TestWhaterer::class.java)

    @Test
    fun testLogger(){
        log.info("Hello world!")
    }
}