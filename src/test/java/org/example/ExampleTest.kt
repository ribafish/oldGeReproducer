package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

class ExampleTest {

    @Test
    fun `Passing test`() {
        assertEquals(1, 1)
    }

    @Test
    fun `Flaky test`() {
        assert(Random.nextFloat() > 0.5f)
    }
}