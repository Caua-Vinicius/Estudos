type TemNome = { nome: string };
type TemIdade = { idade: number };

type Pessoa = TemIdade & TemNome; //Operador de intersection-type &

const pessoa: Pessoa = {
  nome: 'Cauã',
  idade: 18,
};

console.log(pessoa);

type AB = 'A' | 'B';
type AC = 'A' | 'C';
type Intersercao = AB & AC;
