fun main() {
    //ქვემოთ რო არ ჩაიხედო ხოლმე:
    //x ის მიმართ გადატანა - reflectX()
    //---------------------------------
    //n ზე შეკვეცა - simplify(n)
    //შეკრება - addFractions()
    //გამოკლება - subFractions()
    //გამრავლება - multFractions()
    //გაყოფა - divFractions()


}


class Point {
    var x: Float = 0F
    var y: Float = 0F

    override fun toString(): String {
        return "$x, $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (other.x == x && other.y == y) {
                return true
            }
        }
        return false
    }

    fun reflectX(){
        this.y = -1 * this.y
    }
}


class Fraction {
    var numerator: Float = 0F
    var denominator: Float = 0F

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun simplify(n: Float) {
        numerator = numerator / n
        denominator = denominator / n

    }

    fun addFractions(other: Fraction): String {
        var a = denominator * other.denominator


        numerator = numerator * (a / denominator)
        denominator = a.toFloat()
        other.numerator = other.numerator * (a / other.denominator)
        other.denominator = a.toFloat()

        numerator = numerator + other.numerator

        return "$numerator/$a"


    }

    fun subFractions(other: Fraction): String {
        var a = denominator * other.denominator

        numerator = numerator * (a / denominator)
        denominator = a.toFloat()
        other.numerator = other.numerator * (a / other.denominator)
        other.denominator = a.toFloat()

        numerator = numerator - other.numerator

        return "$numerator/$a"

    }

    fun multFractions(other: Fraction): String {
        numerator = numerator * other.numerator
        denominator = denominator * other.denominator

        return "$numerator/$denominator"
    }

    fun divFractions(other: Fraction): String {
        numerator = numerator * other.denominator
        denominator = denominator * other.numerator

        return "$numerator/$denominator"
    }


}

