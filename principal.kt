class Vinho(
    val nome: String,
    val safra: Int,
    val pais: String,
    val preco: Double
)

class Assinante(
    val nome: String,
    val planoAnual: Boolean
)

class CaixaMensal(
    val vinhos: List<Vinho>,
    val brindeEspecial: String?
) {

    fun calcularSubtotal(): Double {
        var subtotal = 0.0

        for (vinho in vinhos) {
            subtotal += vinho.preco
        }

        return subtotal
    }

    fun calcularPrecoFinal(assinante: Assinante): Double {
        val subtotal = calcularSubtotal()

        return if (assinante.planoAnual == true) {
            subtotal * 0.80
        } else {
            subtotal
        }
    }

    fun obterBrinde(): String {
        return brindeEspecial ?: "Nenhum acessório extra"
    }

    fun quantidadeGarrafas(categoria: Int): Int {
        return when (categoria) {
            1 -> 2
            2 -> 4
            3 -> 6
            else -> 0
        }
    }
}

fun main() {

    val vinho1 = Vinho("Vinho Tinto", 2022, "Brasil", 80.0)
    val vinho2 = Vinho("Vinho Branco", 2023, "Chile", 100.0)
    val vinho3 = Vinho("Vinho Rosé", 2022, "Argentina", 90.0)

    val assinante = Assinante("Yas", true)

    val caixa = CaixaMensal(
        listOf(vinho1, vinho2, vinho3),
        null
    )

    val subtotal = caixa.calcularSubtotal()
    val precoFinal = caixa.calcularPrecoFinal(assinante)
    val brinde = caixa.obterBrinde()

    println("Assinante: ${assinante.nome}")
    println("Subtotal dos vinhos: R$ $subtotal")
    println("Preço final: R$ $precoFinal")
    println("Brinde: $brinde")

    println("Silver: ${caixa.quantidadeGarrafas(1)} garrafas")
    println("Gold: ${caixa.quantidadeGarrafas(2)} garrafas")
    println("Platinum: ${caixa.quantidadeGarrafas(3)} garrafas")
}