fun main() {
    val breaki = 0

    println("""Список команд:
        1. Добавить новый расход
        2. Вывести список всех расходов
        3. Подсчёт суммы расходов по каждой категории
    """.trimIndent())

    input()

    do {
        input()
        print("Введите команду: ")
    } while (breaki == 0)

}

fun add() {

    println("Введите информацию о расходе: сумма, категория, время")
    val amount:Double = readln().toDouble()
    val category:String = readln()
    val time:String = readln()
    Expense.addTrata(amount,category, time)
    println("Расход добавлена!")
}

fun input(){
    val input:String? = readlnOrNull()

    when (input) {
        "1" -> add()
        "2" -> Expense.print()
        "3" -> println(Expense.summa())
        else -> { println("Ввод неверный, попробуйте снова!")
            input()
        }
    }

}