## **Herança** 

143 

## **O que é Herança?** 

- é um dos da Orientada a 

- Herança pilares Programação Objetos (POO), ao lado de encapsulamento, abstração e polimorfismo. 

- Permite uma nova classe **reutilize** e os que (subclasse) **especialize** 

- comportamentos de uma classe existente (superclasse). 

- Objetivos principais: 

   - **Reutilização de código** já testado e confiável. 

   - **Especialização de comportamentos** para classes mais específicas. 

**144** 

## **Vantagens e Relações “** ~~EE~~ **é um” vs. “** ~~——————~~ **tem um”** 

- : 

- **Vantagens da herança** 

   - Evita repetição de código. 

   - comuns. 

   - Centraliza manutenção de funcionalidades 

   - Facilita a extensão e escalabilidade do sistema. 

- **Relações conceituais** : 

   - “ 

   - ○ **É um** `Carro Veículo` ” →Herança (ex: é um tipo de ) 

   - “ 

   - ○ **Tem um** ” →Composição ou agregação (ex: `Carro` tem um `Motor` ) 

**145** 

## **Exemplo introdutório: Veículo e Carro** 

**`// Superclasse // Subclasse public class Veiculo { public class Carro extends Veiculo { private String marca; private String modelo; public Veiculo(String marca) { public Carro(String marca, String modelo) { this.marca = marca; super(marca); // chama o construtor da superclasse } this.modelo = modelo; } public void exibirMarca() { System.out.println("Marca: " + marca); public void exibirModelo() { } System.out.println("Modelo: " + modelo); } } }`** 

**146** 

## **Superclasse e Subclasse: Definições** 

- Uma **superclasse** (ou classe base, ou classe-pai, ou classe-mãe) é aquela que fornece atributos e métodos comuns a várias outras classes. 

- Uma **subclasse** (ou classe derivada, classe-filha) herda os atributos e métodos da superclasse e pode: 

   - Adicionar novos comportamentos; 

   - Modificar comportamentos herdados; 

   - Especializar funcionalidades. 

- Relação: 

   - Subclasse é um tipo **mais específico** da Superclasse. 

**147** 

## **Hierarquias de Classes** 

- : 

- Hierarquias representam níveis de **especialização** 

   - Exemplo: `Forma` → `Circulo` , `Quadrado` 

- Permitem organizar o sistema de forma mais **compreensível** e **modular** . 

- As subclasses herdam **características comuns** e adicionam **detalhes** . 

- **próprios** ~~——~~ 

**148** 

## **Hierarquias de Classes** 

- Classe `Forma` : contém atributo `cor` e método `desenhar()` . 

- Classe `Quadrado` : herda `cor` , adiciona `lado` e implementa `area()` . 

- Classe `Circulo` : herda `cor` , adiciona `raio` e implementa `area()` . 

**`// Superclasse`** 

**`public class Forma {`** 

**`public void desenhar() { System.out.println("Desenhando forma genérica.");`** 

**`}`** 

**`}`** 

**`// Subclasse Círculo`** 

**`public class Circulo extends Forma { @Override public void desenhar() {`** 

**`System.out.println("Desenhando um círculo.");`** 

**`}`** 

**`// Subclasse Quadrado`** 

**`public class Quadrado extends Forma { @Override`** 

**`public void desenhar() {`** 

**`System.out.println("Desenhando um quadrado.");`** 

**`}`** 

**`}`** 

**`}`** 

**149** 

## **A palavra-chave** `extends` **em Java** 

- Em Java, a herança entre classes é declarada com a palavra-chave 

   - `extends` . 

- Sintaxe básica: 

`class Subclasse extends Superclasse {` 

`// atributos e métodos específicos da subclasse` 

`}` 

- Ao usar `extends` , a subclasse **herda** todos os membros públicos ( `public` ) e protegidos ( `protected` ) da superclasse. 

- A **de** e herança permite **reaproveitamento código especialização** 

- **de comportamento** . 

**150** 

## **Regras sobre** `extends` 

- : 

- Java suporta apenas **herança simples** 

   - Uma subclasse **pode herdar de apenas uma** superclasse. 

`class Animal {} class Cachorro extends Animal {} class Cachorro extends Mamifero, Carnivoro {}` 

- Toda classe herda, direta ou indiretamente, da classe `Object` . 

- Não é necessário escrever `extends Object` , pois isso ocorre . 

- **implicitamente** 

**151** 

## **O que se herdada em uma subclasse** 

- Uma subclasse herda da superclasse: 

   - Todos os **métodos** declarados como `public` e `protected` . 

- Todos os **atributos** `public` e `protected` . 

- ● Esses membros herdados ser utilizados diretamente na podem 

- subclasse, a menos que sejam sobrescritos ou ocultados. 

**`public class Animal { protected String nome;`** 

**`public void emitirSom() { System.out.println("Som genérico");`** 

**`public class Cachorro extends Animal { public void latir() { System.out.println(nome + " está latindo"); }`** 

**`}`** 

**`}`** 

**`}`** 

**152** 

**O que** —— **não é herdado em uma subclasse** 

- **Não são herdados** : 

   - Construtores da superclasse. 

   - Membros com modificador `private` . 

- Isso significa que: 

   - A subclasse precisa declarar seus próprios **construtores** . 

   - ○ A subclasse **não pode acessar diretamente** atributos `private` da superclasse. 

- Para acessar membros `private` , utiliza-se **getters/setters** fornecidos pela superclasse. 

**153** 

## **Revisão: Modificadores de Acesso** 

- Em Java, o modificador de acesso determina **onde** um membro (atributo ou método) pode ser acessado: 

   - `private` : acesso **apenas dentro da própria classe** . 

   - `protected` : acesso **dentro da classe, subclasses e pacote** . 

   - `public` : acesso **irrestrito** de qualquer lugar. 

- Em de o modificador de acesso hierarquias herança, impacta 

- diretamente **o** . **que é herdado e como é acessado** 

**154** 

## **Diferenças importantes em Herança** 

- `protected` permite que subclasses acessem membros diretamente, mesmo que estejam em outro pacote. 

- Apesar disso, **é preferível evitar** membros `protected` : 

   - Pode quebrar o princípio do encapsulamento. 

   - ○ Deixa a mais e a implementação rígida sujeita mudanças 

   - acopladas. 

- Em vez de usar `protected` , prefira: 

   - Manter os atributos como `private` . 

   - Criar métodos ou `public protected` para acesso controlado. 

**155** 

## **Boas Práticas em Herança (Engenharia de Software)** 

- **Evite** ao máximo atributos `protected` . 

- Prefira **encapsular** atributos com `private` e criar métodos de acesso controlado ( `get` / `set` ) quando necessário. 

- Permite **melhor controle** sobre como os dados são **acessados** ou **modificados** . 

- Torna o código mais **modular** , **seguro** e **de fácil manutenção** . 

**156** 

## **Construtores em Hierarquia de Herança** 

- Construtores **não são herdados** em Java. 

- Toda subclasse deve chamar **ou** um **explicitamente implicitamente** 

- construtor da superclasse. 

- Para isso, usamos a palavra-chave `super()` dentro do construtor da subclasse. 

- **Regra obrigatória** : a chamada a `super()` deve ser a primeira instrução do construtor da subclasse. 

**157** 

## _**vs.**_ `super()` **: Chamada Explícita Implícita** 

- **Chamada explícita** : 

   - Quando usamos `super(parametros)` no início do construtor da subclasse. 

- **Chamada implícita** : 

   - Se não escrevermos `super()` , o compilador adiciona automaticamente uma chamada ao **construtor sem parâmetros da superclasse** . 

- Se a superclasse **não tiver construtor padrão** , devemos obrigatoriamente fazer a chamada explícita. 

**158** 

## **Exemplo Prático: Construtores** 

- Vamos observar como a chamada ao construtor da superclasse é feita na subclasse: 

**`public class Pessoa { public class Estudante extends Pessoa { private String nome; private String curso; public Pessoa(String nome) { public Estudante(String nome, String curso) { this.nome = nome; super(nome); // Chamada explícita ao construtor da superclasse } this.curso = curso; } }`** 

**`}`** 

**159** 

## **Herança Universal em Java: classe** `Object` 

- Em Java, **todas as classes** herdam, direta ou indiretamente, da classe **`Object`** . 

- Isso significa que qualquer classe criada por você **já possui métodos herdados** da classe `Object` , mesmo sem usar `extends` . 

- A classe `Object` é definida no pacote `java.lang` , importado automaticamente. 

**160** 

## **Métodos Herdados da Classe Object** 

- Os métodos mais comuns herdados de `Object` são: ○ `toString()` – Retorna uma representação em texto do objeto. 

- ○ `equals(Object obj)` – Compara dois objetos para verificar se são “iguais”. 

   - `hashCode()` – Retorna um código de hash do objeto, usado em estruturas como `HashMap` . 

- Você pode **sobrescrever esses métodos** para adaptá-los à lógica da sua aplicação. 

Veremos como fazer isso no nosso próximo assunto: **Polimorfismo** 

**161** 

## **Exemplo: Comunidade Acadêmica** 

- Podemos diferentes de em uma representar tipos pessoas instituição 

- de ensino através de herança. 

- A superclasse `Pessoa` representa atributos comuns a indivíduos da instituição. 

   - Contém `nome` e `cpf` . 

- Subclasses especializam `Pessoa` : 

   - `Estudante` adiciona `matricula` . 

   - ○ `Funcionario` adiciona `salario` . 

- Utiliza `super(...)` para inicializar construtores herdados. 

**162** 

## **Exemplo: Comunidade Acadêmica** 

**`public class Pessoa { private String nome; private String cpf;`** 

**`public Pessoa(String nome, String cpf) { this.nome = nome; this.cpf = cpf; }`** 

**`public String getNome() { return nome; } public String getCpf() { return cpf; }`** 

**`}`** 

**163** 

## **Exemplo: Comunidade Acadêmica** 

**`public class Estudante extends Pessoa { private String matricula; public Estudante(String nome, String cpf, String matricula) { super(nome, cpf); this.matricula = matricula; }`** 

**`public String getMatricula() { return matricula; }`** 

**`}`** 

**164** 

## **Exemplo: Comunidade Acadêmica** 

**`public class Funcionario extends Pessoa { private double salario; public Funcionario(String nome, String cpf, double salario) { super(nome, cpf); this.salario = salario; }`** 

**`public double getSalario() { return salario; }`** 

**`}`** 

**165** 

## **Boas Práticas de Herança (1/4)** 

- Minimizar o uso de membros `protected` : 

   - Evite tornar atributos `protected` indiscriminadamente. 

   - Mesmo subclasses não devem acessar diretamente atributos de outra classe; prefira o acesso através de métodos controlados. 

   - **Problema** : Acesso direto reduz o encapsulamento e dificulta futuras alterações internas sem afetar subclasses. 

**166** 

## **Boas Práticas de Herança (2/4)** 

- : 

- Não quebrar o princípio do **encapsulamento** 

   - Prefira sempre atributos `private` e disponibilize acesso controlado através de **getters** e **setters** . 

   - Garanta que modificações internas da superclasse não comprometam o funcionamento das subclasses. 

   - Se possível, desenhe classes de forma que alterações internas não “vazem” para o exterior. 

**167** 

## **Boas Práticas de Herança (3/4)** 

- Usar corretamente e : **herança agregação/composição** 

   - “ ” 

   - ○ : use existir uma clara **é um Herança** apenas quando relação **é uma** 

   - (ex.: um Circulo Forma). 

   - **Agregação/Composição** : prefira quando o relacionamento for “ **tem um** ” ou “ **é de** ” uma Pessoa **tem um composto** (ex.: 

   - Endereco). 

   - Não force hierarquias de herança quando composição resolver melhor a modelagem. 

**168** 

## **Boas Práticas de Herança (4/4)** 

- Dicas de Engenharia de Software: 

   - Projete superclasses para serem **genéricas** e **reutilizáveis** . 

   - Evite criar hierarquias de **herança muito profundas** (preferir 2 ou 3 níveis). 

   - Considere o **de futuras** na **impacto mudanças** superclasse 

   - sobre as subclasses existentes. 

   - Sempre **documente bem** o comportamento esperado dos métodos que podem ser sobrescritos. 

**169** 

## **Recapitulando Herença em Java (1/2)** 

- é um dos da POO e reutilizar atributos e 

- **Herança** pilares permite métodos de uma classe base em novas classes. 

- : classe mais define atributos e 

- **Superclasse** genérica que comportamentos comuns. 

- **Subclasse** : da herda e especialização superclasse, que pode 

- estender ou sobrescrever seus comportamentos. 

- O Java utiliza a palavra-chave `extends` para declarar herança entre classes. 

   - Não existe herança múltipla em Java. 

**170** 

## **Recapitulando Herença em Java (2/2)** 

- **Subclasses herdam** : 

   - Métodos `public` e `protected` . 

- **Subclasses NÃO herdam** : 

   - Construtores. 

   - Atributos `private` . 

- A chamada ao construtor da deve ser feita com superclasse 

- `super()` , sempre como **primeira linha** do construtor da subclasse. 

- Toda classe em Java herda, direta ou indiretamente, da classe . 

- `Object` 

**171** 

## **Exercícios propostos** 

Verificar atividade no Moodle 

**172** 

