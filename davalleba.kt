fun main (){
    val koordinati1 =P(X=5F,Y=8F)

    val koordinati2 =P(X=9F,Y=12F)

    println(message = koordinati2)
    println(message = koordinati1)
    println(message = koordinati2 == koordinati1)
    koordinati1.movingX(3F)
    koordinati2.movingY(5F)

}
class P(private var X: Float, private var Y: Float) {

    fun movingX(t:Float){
        val P = Y - t
        println("1-li koordinati x-istvis gadava:$X;$P koordinatshi")

    }
    fun movingY(q:Float){
        val R = X - q
        println("me-2 koordinati y-istvis gadava:$R;$Y koordinatshi")
    }

    override fun toString(): String {
        return "($X;$Y)"
    }

    override fun equals(another: Any?): Boolean {
        if (another is P) {
            if (X==another.X&&Y==another.Y) {
                return false
            }
        }
        return true
    }

}