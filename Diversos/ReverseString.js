function ReverseString(input) {
    let invertedString = '';
    for (let i = input.length - 1; i >= 0; i--) {
        invertedString += input[i];
    }
    return invertedString;
}

const StringInput = 'Bom dia pessoal';
const ReversedString = ReverseString(StringInput);
console.log(ReversedString); // Saída: 'laossep aid moB'