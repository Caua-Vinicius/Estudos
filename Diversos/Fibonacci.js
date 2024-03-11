function verificarFibonacci(numero) {
    let a = 0;
    let b = 1;
    
    // Casos base
    if (numero === 0) return `${numero} pertence à sequência de Fibonacci.`;
    if (numero === 1) return `${numero} pertence à sequência de Fibonacci.`;

    // Calcula a sequência de Fibonacci até encontrar um número maior ou igual ao número fornecido
    while (b < numero) {
        const temp = b;
        b = a + b;
        a = temp;
    }

    // Verifica se o número fornecido pertence à sequência
    if (b === numero) {
        return `${numero} pertence à sequência de Fibonacci.`;
    } else {
        return `${numero} não pertence à sequência de Fibonacci.`;
    }
}

console.log(verificarFibonacci(10)); // Saída: 10 não pertence à sequência de Fibonacci