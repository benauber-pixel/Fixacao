//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun main() {
        // Questão 1: Inversão de Vetor
        val numeros = intArrayOf(10, 20, 30, 40, 50, 60)
        var inicio = 0
        var fim = numeros.size - 1
        while (inicio < fim) {
            val temp = numeros[inicio]
            numeros[inicio] = numeros[fim]
            numeros[fim] = temp
            inicio++
            fim--
        }
        println("1. Vetor invertido: ${numeros.contentToString()}")

        // Questão 2: Busca e Interrupção
        val transacoes = arrayOf("TX-101", "TX-202", "TX-303", "TX-404", "TX-505")
        val codigoBuscado = "TX-303"
        var encontrado = false
        for (i in 0 until transacoes.size) {
            if (transacoes[i] == codigoBuscado) {
                println("2. Código '$codigoBuscado' encontrado na posição $i.")
                encontrado = true
                break
            }
        }
        if (!encontrado) {
            println("2. Código '$codigoBuscado' não encontrado.")
        }

        // Questão 3: Média de Temperaturas
        val temperaturas = doubleArrayOf(28.5, 31.0, 27.2, 33.4, 30.1, 29.0, 32.5)
        var somaTemp = 0.0
        for (temp in temperaturas) {
            somaTemp += temp
        }
        val mediaTemp = somaTemp / temperaturas.size
        println("3. Média geral: ${"%.2f".format(mediaTemp)}°C")
        print("3. Dias (índices) acima da média: ")
        for (i in temperaturas.indices) {
            if (temperaturas[i] > mediaTemp) {
                print("$i ")
            }
        }
        println()

        // Questão 4: Filtragem de Pares com Step
        val array20 = IntArray(20) { i -> i + 1 }
        var somaIndicesPares = 0
        for (i in 0 until array20.size step 2) {
            somaIndicesPares += array20[i]
        }
        println("4. Soma dos valores em índices pares: $somaIndicesPares")

        // Questão 5: Listagem com Índices
        val tarefas = arrayOf(
            "Revisar tela de login",
            "Corrigir bug no carrinho",
            "Atualizar documentação da API",
            "Publicar versão beta"
        )
        println("5. Lista de tarefas:")
        for ((indice, descricao) in tarefas.withIndex()) {
            println("   ${indice + 1}. $descricao")
        }

        // Questão 6: Soma por Linhas (Matriz 3x4)
        val matriz3x4 = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        )
        println("6. Soma por linhas:")
        for (linha in 0 until matriz3x4.size) {
            var somaLinha = 0
            for (coluna in 0 until matriz3x4[linha].size) {
                somaLinha += matriz3x4[linha][coluna]
            }
            println("   Linha $linha: $somaLinha")
        }

        // Questão 7: Matriz Transposta (2x3 -> 3x2)
        val original = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6)
        )
        val transposta = Array(3) { IntArray(2) }
        for (i in 0 until original.size) {
            for (j in 0 until original[i].size) {
                transposta[j][i] = original[i][j]
            }
        }
        println("7. Matriz Original (2x3):")
        for (linha in original) println("   ${linha.contentToString()}")
        println("7. Matriz Transposta (3x2):")
        for (linha in transposta) println("   ${linha.contentToString()}")

        // Questão 8: Análise de Diagonais (Matriz 4x4)
        val matriz4x4 = arrayOf(
            intArrayOf(10, 2, 3, 4),
            intArrayOf(5, 20, 7, 8),
            intArrayOf(9, 1, 30, 2),
            intArrayOf(4, 5, 6, 40)
        )
        var somaDiagonalPrincipal = 0
        println("8. Matriz 4x4:")
        for (i in 0 until matriz4x4.size) {
            print("   ")
            for (j in 0 until matriz4x4[i].size) {
                print("${matriz4x4[i][j]}\t")
                if (i == j) {
                    somaDiagonalPrincipal += matriz4x4[i][j]
                }
            }
            println()
        }
        println("8. Soma da Diagonal Principal: $somaDiagonalPrincipal")

        // Questão 9: Identificação de Zeros com Continue (Matriz 3x3)
        val matriz3x3 = arrayOf(
            intArrayOf(5, 0, 12),
            intArrayOf(0, 8, 0),
            intArrayOf(3, 7, 0)
        )
        var somaPositivos = 0
        for (i in 0 until matriz3x3.size) {
            for (j in 0 until matriz3x3[i].size) {
                val valor = matriz3x3[i][j]
                if (valor == 0) {
                    continue
                }
                if (valor > 0) {
                    somaPositivos += valor
                }
            }
        }
        println("9. Soma dos valores maiores que zero: $somaPositivos")

        // Questão 10: Boletim de Alunos
        val boletim = Array(3) { DoubleArray(2) }
        boletim[0][0] = 8.0; boletim[0][1] = 7.5
        boletim[1][0] = 5.0; boletim[1][1] = 6.0
        boletim[2][0] = 9.0; boletim[2][1] = 8.0
        var somaMedias = 0.0
        println("10. Boletim:")
        for (i in 0 until boletim.size) {
            val mediaAluno = (boletim[i][0] + boletim[i][1]) / boletim[i].size
            somaMedias += mediaAluno
            val situacao = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"
            println("   Aluno ${i + 1}: Média ${"%.2f".format(mediaAluno)} - $situacao")
        }
        val mediaGeralTurma = somaMedias / boletim.size
        println("10. Média geral da turma: ${"%.2f".format(mediaGeralTurma)}")
    }
}