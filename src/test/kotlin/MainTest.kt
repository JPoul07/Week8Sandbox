import org.example.factorial
import org.example.main
import org.example.staircasePossibilities
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FactorialTest {
    @Test
    fun `test factorial base case 0 returns one`() {
        val actual = factorial(0)
        assertEquals(1, actual)
    }

    @Test
    fun `test factorial base case 1 returns one`() {
        val actual = factorial(1)
        assertEquals(1, actual)
    }

    @Test
    fun `test factorial with n being more than 1 return expected value`() {
        val expected = 3 * 2 * 1
        assertEquals(expected, factorial(3))
    }

    @Test
    fun `test staircase with n being 1 returns base case`() {
        assertEquals(1, staircasePossibilities(1))
    }

    @Test
    fun `test staircase with n being 2 returns 2`() {
        assertEquals(2, staircasePossibilities(2))
    }
    @Test
    fun `test staircase possibilities with 3 returns 3 options`() {
        assertEquals(3, staircasePossibilities(3))
    }

    @Test
    fun `test staircase possibilities with 4 returns 5 options`() {
        assertEquals(5, staircasePossibilities(4))
    }

    @Test
    fun `test staircase possibilities with 5 return 8 options`() {
        assertEquals(8, staircasePossibilities(5))
    }
}