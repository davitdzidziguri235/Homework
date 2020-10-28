fun main () {

    val f1 = Fraction(21F, 11F)

    val f2 = Fraction(8F, 2F)


    println(f1.gamravleba(f2))
    println(f1.damateba(f2))
    f1.shekveca()


}

class Fraction(l: Float, x:Float) {

    private var numer: Float = l
    private var denom: Float = x

    override fun toString(): String {
        return "$numer/$denom"
    }

    fun gamravleba(fraction: Fraction): Fraction {
        val a = numer * fraction.numer
        val t = denom * fraction.denom
        return Fraction(a, t)

    }
    fun damateba(fraction: Fraction): Fraction {
        val m = denom * fraction.denom
        val w = m/denom * numer
        val g = m/fraction.denom * fraction.numer
        return Fraction(w+g, m)



    }

            fun shekveca() {
                var x = numer
                var y = denom
                while( x!= 0F && y != 0F ){
                    if(x > y) {
                        x =x % y
                    }
                    else {
                        y = y % x
            }

        }

        val m = x+y
                val n = numer/m
        val d = denom/m
        this.denom = d
        this.numer = n
        println("$n/$d")
    }
}