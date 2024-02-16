interface Pessoa {
  nome: string;
  readonly sobrenome: string;
}

const pessoa: Pessoa = {
  nome: 'Cauã' as const,
  sobrenome: 'Vinicius',
};

pessoa.nome = 'jose';
console.log(pessoa.nome);

export { Pessoa };
