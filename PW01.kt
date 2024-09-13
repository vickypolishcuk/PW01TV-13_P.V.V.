fun main(){

    // Перш ніж виконати завдання, проініціалізуємо змінні та зчитаємо їх з клавіатури.
    // Для зчитування значень з клавіатури використовується вбудована функція readln().
    // Окільки значення з даної функції матимуть тип String, потрібно перетворити його на тип Float для
    // подальшого коректного використання в арифметичних операціях. Для цього застосовується функція toFloat().

    // Зчитуємо значення з клавіатури
    print("Введіть значення водню (H): ")
    var H:Float = readln().toFloat()
    print("Введіть значення вуглецю (C): ")
    var C:Float = readln().toFloat()
    print("Введіть значення сірки (S): ")
    var S:Float = readln().toFloat()
    print("Введіть значення азоту (N): ")
    var N:Float = readln().toFloat()
    print("Введіть значення кисню (O): ")
    var O:Float = readln().toFloat()
    print("Введіть значення золи (A): ")
    var A:Float = readln().toFloat()
    print("Введіть значення вологи (W): ")
    var W:Float = readln().toFloat()

    // Виведемо отримані значення
    println("\n\tВведені значення:")
    println("Водень (H) - $H")
    println("Вуглець (C) - $C")
    println("Сірка (S) - $S")
    println("Азот (N) - $N")
    println("Кисень (O) - $O")
    println("Зола (A) - $A")
    println("Волога (W) - $W")

    // Завдання 1. Розробити калькулятор для розрахунку складу сухої та горючої маси палива та нижчої
    // теплоти згоряння для робочої, сухої та горючої маси.
    println("\nЗавдання 1. Розробити калькулятор для розрахунку складу сухої та горючої маси\n" +
            "палива та нижчої теплоти згоряння для робочої, сухої та горючої маси")
    
    // Функція для розрахунку складу сухої та горючої маси палива та
    //нижчої теплоти згоряння для робочої, сухої та горючої маси
    culc1(H, C, S, N, O, A, W)

    // Завдання 2. Розробити калькулятор для розрахунку елементарного складу та
    // нижчої теплоти згоряння мазуту на робочу масу для складу горючої маси мазуту
    println("\nЗавдання 2. Розробити калькулятор для розрахунку елементарного складу та\n" +
            "нижчої теплоти згоряння мазуту на робочу масу для складу горючої маси мазуту")

    // Присвоїмо нові значення відповідним змінним. Дані зчитуємо з клавіатури
    print("Введіть значення водню (H): ")
    H = readln().toFloat()
    print("Введіть значення вуглецю (C): ")
    C = readln().toFloat()
    print("Введіть значення сірки (S): ")
    S = readln().toFloat()
    print("Введіть значення кисню (O): ")
    O = readln().toFloat()
    print("Введіть значення золи (A): ")
    A = readln().toFloat()
    print("Введіть значення вологи (W): ")
    W = readln().toFloat()
    print("Введіть значення ванадію (V): ")
    var V:Float = readln().toFloat()
    print("Введіть значення теплоти згоряння (Qdaf): ")
    var Qdaf:Float = readln().toFloat()

    // Функція для розрахунку елементарного складу та нижчої теплоти
    // згоряння мазуту на робочу масу для складу горючої маси мазуту
    culc2(H, C, S, Qdaf, O, A, W, V)
}


// Функція для розрахунку складу сухої та горючої маси палива та нижчої
// теплоти згоряння для робочої, сухої та горючої маси
fun culc1(H:Float, C:Float, S:Float, N:Float, O:Float, A:Float, W:Float) {

    // Визначимо коефіцієнти переходу від робочої до сухої маси (Ks) та від робочої до горючої маси (Kg).
    // Для цього використовується надана формула
    var Ks: Float = 100.0f / (100 - W)
    var Kg: Float = 100.0f / (100 - W - A)

    // Виведемо значення коефіцієнтів
    println("\n\tРозрахунок коефіцієнтів")
    println("від робочої до сухої маси (Ks): 100 / (100 - W) -> %.2f".format(Ks))
    println("від робочої до горючої маси (Kg): 100 / (100 - W - A) -> %.2f".format(Kg))

    // Виведемо склад сухої маси, де всі елементи маси були перераховані шляхом множення їх на коефіцієнт Ks
    println("\n\tСклад сухої маси")
    println("Водень (H): H * Ks -> %.2f".format(H * Ks))
    println("Вуглець (C): C * Ks -> %.2f".format(C * Ks))
    println("Сірка (S): S * Ks -> %.2f".format(S * Ks))
    println("Азот (N): N * Ks -> %.2f".format(N * Ks))
    println("Кисень (O): O * Ks -> %.2f".format(O * Ks))
    println("Зола (A): A * Ks -> %.2f".format(A * Ks))
    println(("Перевірка: %.2f + %.2f + %.2f + %.2f + %.2f + %.2f = ${H * Ks + C * Ks + S * Ks + N * Ks + O * Ks +
            A * Ks}").format(H * Ks, C * Ks, S * Ks, N * Ks, O * Ks, A * Ks))

    // Виведемо склад горючої маси, де всі елементи маси були перераховані шляхом множення їх на коефіцієнт Kg
    println("\n\tСклад горючої маси")
    println("Водень (H): H * Kg -> %.2f".format(H * Kg))
    println("Вуглець (C): C * Kg -> %.2f".format(C * Kg))
    println("Сірка (S): S * Kg -> %.2f".format(S * Kg))
    println("Азот (N): N * Kg -> %.2f".format(N * Kg))
    println("Кисень (O): O * Kg -> %.2f".format(O * Kg))
    println(("Перевірка: %.2f + %.2f + %.2f + %.2f + %.2f = ${H * Kg + C * Kg + S * Kg + N * Kg + O * Kg}" +
            "").format(H * Kg, C * Kg, S * Kg, N * Kg, O * Kg))

    // Проініціалізуємо змінну для нижчої теплоти згоряння робочої маси та обчислимо її значення за наданою формулою
    val Q = 339 * C + 1030 * H - 108.8 * (O - S) - 25 * W // нижча теплота згорання робочої маси

    // Виведемо значення на екран
    println("\n\tНижча теплота згоряння для")
    println("робочої маси: %.2f кДж/кг або %.2f МДж/кг".format(Q, Q / 1000))
    println("сухої маси: (Q / 1000 + 0.025 * W) * Ks -> %.2f МДж/кг".format((Q / 1000 + 0.025 * W) * Ks))
    println("горючої маси: (Q / 1000 + 0.025 * W) * Kg -> %.2f МДж/кг".format((Q / 1000 + 0.025 * W) * Kg))
}

// Функція для розрахунку елементарного складу та нижчої теплоти згоряння мазуту на
// робочу масу для складу горючої маси мазуту
fun culc2(H:Float, C:Float, S:Float, Qdaf:Float, O:Float, A:Float, W:Float, V:Float) {

    // Визначимо коефіцієнти переходу від горючої до робочої маси (K1 та K2).
    var K1: Float = (100 - W - A) / 100
    var K2: Float = (100 - W) / 100

    // Виведемо значення коефіцієнтів
    println("\n\tРозрахунок коефіцієнтів")
    println("K1 = (100 - 2,0 - 0,15) / 100 -> %.2f".format(K1))
    println("K2 = (100 - 2,0) / 100 -> %.2f".format(K2))

    // Виведемо склад робочої маси, де всі елементи маси були перераховані шляхом множення їх на коефіцієнт K1 або K2
    println("\n\tСклад робочої маси мазуту")
    println("Водень (H): H * K1 -> %.2f".format(H * K1))
    println("Вуглець (C): C * K1 -> %.2f".format(C * K1))
    println("Сірка (S): S * K1 -> %.2f".format(S * K1))
    println("Ванадій (V): V * K2 -> %.2f".format(V * K2))
    println("Кисень (O): O * K1 -> %.2f".format(O * K1))
    println("Зола (A): A * K2 -> %.2f".format(A * K2))
    println(("Перевірка: %.2f + %.2f + %.2f + %.2f + %.2f = ${H * K1 + C * K1 + S * K1 + O * K1 + A * K2}" +
            "").format(H * K1, C * K1, S * K1, O * K1, A * K2))

    // Проініціалізуємо змінну для нижчої теплоти згоряння мазуту на робочу масу та обчислимо її значення за наданою формулою
    val Q = Qdaf * ((100 - W - A * K2) / 100) - 0.025 * W // нижча теплота згоряння мазуту на робочу масу

    // Виведемо значення на екран
    println("\n\tТеплота згоряння з горючої маси на робочу: %.2f МДж/кг".format(Q))
}