import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {

    lateinit var math: Math

    @Before
    fun setup(){
        math = Math()
    }

    @Test
    fun addTest() {
        val actual = math.add(1, 2)
        val expected = 3
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNumber1LessNumber2_minimumShouldBeNumber1() {
        val expected = math.minimum(1,3)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNumber2LessNumber1_minimumShouldBeNumber2() {
        val expected = math.minimum(3,1)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }
}