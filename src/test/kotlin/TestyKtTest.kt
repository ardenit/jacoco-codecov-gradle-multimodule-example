import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TestyKtTest {

    @Test
    fun testSum() {
        assertEquals(5, sum(2, 3))
    }

    @Test
    fun testNothing() {
        assertTrue(true)
    }
}