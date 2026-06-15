<!-- ============================================================ -->
<!-- LIVRO: Programação Orientada a Objetos em Java                -->
<!-- Formato: Markdown preparado para conversão em LaTeX           -->
<!--                                                               -->
<!-- CONVENÇÕES PARA CONVERSÃO LaTeX:                              -->
<!--   \newpage  → indicado por comentário <!-- \newpage -->        -->
<!--   # (h1)   → \chapter{}                                      -->
<!--   ## (h2)  → \section{}                                       -->
<!--   ### (h3) → \subsection{}                                    -->
<!--   #### (h4)→ \subsubsection{}                                 -->
<!--   > bloco  → ambiente \begin{quote}...\end{quote}             -->
<!--   ```java  → ambiente \begin{lstlisting}[language=Java]       -->
<!--   **neg**  → \textbf{}                                        -->
<!--   `código` → \texttt{}                                        -->
<!--   ---      → \begin{center}\rule{0.5\linewidth}{0.4pt}\end{center} -->
<!--   Tabelas  → ambiente tabular                                 -->
<!-- ============================================================ -->

<!-- \begin{titlepage} -->
# Programação Orientada a Objetos em Java

**Guia de estudo para prova**

*Tópicos: Relacionamentos entre Classes, Herança, Polimorfismo e Interfaces*
<!-- \end{titlepage} -->

<!-- \newpage -->
<!-- \tableofcontents -->

---

# Sumário

- [Capítulo 1 — Relacionamentos entre classes](#capítulo-1--relacionamentos-entre-classes)
  - [1.1 O que são relacionamentos entre classes](#11-o-que-são-relacionamentos-entre-classes)
  - [1.2 Associação](#12-associação)
  - [1.3 Agregação](#13-agregação)
  - [1.4 Composição](#14-composição)
  - [1.5 Multiplicidade e cardinalidade](#15-multiplicidade-e-cardinalidade)
  - [1.6 Navegabilidade](#16-navegabilidade)
  - [1.7 Exemplo completo — sistema de biblioteca](#17-exemplo-completo--sistema-de-biblioteca)
  - [1.8 Resumo do capítulo](#18-resumo-do-capítulo)
- [Capítulo 2 — Herança](#capítulo-2--herança)
  - [2.1 O que é herança](#21-o-que-é-herança)
  - [2.2 Superclasse e subclasse](#22-superclasse-e-subclasse)
  - [2.3 A palavra-chave extends](#23-a-palavra-chave-extends)
  - [2.4 O que se herda e o que não se herda](#24-o-que-se-herda-e-o-que-não-se-herda)
  - [2.5 Modificadores de acesso na herança](#25-modificadores-de-acesso-na-herança)
  - [2.6 Construtores em hierarquias de herança](#26-construtores-em-hierarquias-de-herança)
  - [2.7 A classe Object](#27-a-classe-object)
  - [2.8 Boas práticas](#28-boas-práticas)
  - [2.9 Resumo do capítulo](#29-resumo-do-capítulo)
- [Capítulo 3 — Polimorfismo](#capítulo-3--polimorfismo)
  - [3.1 O que é polimorfismo](#31-o-que-é-polimorfismo)
  - [3.2 Polimorfismo estático — sobrecarga](#32-polimorfismo-estático--sobrecarga)
  - [3.3 Polimorfismo dinâmico — sobrescrita](#33-polimorfismo-dinâmico--sobrescrita)
  - [3.4 A anotação @Override e a palavra-chave super](#34-a-anotação-override-e-a-palavra-chave-super)
  - [3.5 Referência de superclasse e vinculação dinâmica](#35-referência-de-superclasse-e-vinculação-dinâmica)
  - [3.6 Classes e métodos abstratos](#36-classes-e-métodos-abstratos)
  - [3.7 Polimorfismo em arrays e parâmetros](#37-polimorfismo-em-arrays-e-parâmetros)
  - [3.8 Boas práticas e princípios de projeto](#38-boas-práticas-e-princípios-de-projeto)
  - [3.9 Resumo do capítulo](#39-resumo-do-capítulo)
- [Capítulo 4 — Interfaces](#capítulo-4--interfaces)
  - [4.1 Conceito e motivação](#41-conceito-e-motivação)
  - [4.2 Interfaces vs. classes abstratas](#42-interfaces-vs-classes-abstratas)
  - [4.3 Declaração e implementação](#43-declaração-e-implementação)
  - [4.4 Interface como tipo de referência](#44-interface-como-tipo-de-referência)
  - [4.5 Múltiplas interfaces](#45-múltiplas-interfaces)
  - [4.6 Interfaces da API padrão do Java](#46-interfaces-da-api-padrão-do-java)
  - [4.7 Métodos default e static (Java 8+)](#47-métodos-default-e-static-java-8)
  - [4.8 Resumo do capítulo](#48-resumo-do-capítulo)

<!-- \newpage -->

---
---

# Capítulo 1 — Relacionamentos entre classes

<!-- \newpage -->

## 1.1 O que são relacionamentos entre classes

### Aprofundamento

Na POO, classes são abstrações de entidades do mundo real — `Pessoa`, `Carro`, `ContaBancaria`, `Produto`. Do mesmo jeito que essas entidades se conectam no dia a dia (uma pessoa mora num endereço, um carro tem um motor), classes também se conectam entre si no código.

Esses vínculos recebem o nome de **relacionamentos entre classes**. Eles indicam como uma classe depende, utiliza ou se liga a outra. Quando modelamos bem esses relacionamentos, o sistema fica mais realista e mais fácil de manter.

Os três objetivos centrais de se definir relacionamentos são:

- Permitir a comunicação entre objetos de classes diferentes
- Refletir estruturas do mundo real dentro do sistema
- Reaproveitar código ao conectar funcionalidades de classes distintas

Exemplos concretos do mundo real:

| Entidade A   | Relação      | Entidade B    |
|-------------|-------------|--------------|
| Pessoa      | tem um      | Endereço     |
| Carro       | possui um   | Motor        |
| Turma       | é composta por | Alunos    |
| Pedido      | envolve     | Produtos     |

Cada um desses exemplos pode representar um tipo de relacionamento diferente — desde uma associação simples até uma composição, a depender do nível de vínculo entre os objetos.

### Resumo rápido

> Relacionamentos entre classes definem como objetos interagem. Os três tipos estruturais são **associação** (referência simples), **agregação** (propriedade fraca) e **composição** (propriedade forte com dependência de ciclo de vida).

<!-- \newpage -->

## 1.2 Associação

### Aprofundamento

Associação é o tipo mais simples de relacionamento. Indica que uma instância de uma classe conhece ou faz referência a outra instância. Não envolve propriedade forte nem dependência de ciclo de vida — é só uma referência comum.

Em UML, a associação aparece como uma linha sólida simples conectando as classes. Uma seta na ponta indica a direção (quem conhece quem).

Exemplo: uma `Pessoa` possui um `Endereco`. O endereço pode ser compartilhado por várias pessoas (membros da mesma família, por exemplo). Não existe vínculo de propriedade exclusiva — ambas as classes existem de forma independente.

```java
public class Pessoa {
    private String nome;
    private Endereco endereco; // Associação com Endereco
}

public class Endereco {
    private String rua;
    private String cidade;
}
```

A seta no diagrama UML mostra que `Pessoa` conhece `Endereco`, mas `Endereco` não sabe nada sobre `Pessoa`.

#### Associação recursiva (auto referenciamento)

Acontece quando uma classe se relaciona com ela mesma. Isso é útil em estruturas hierárquicas — funcionários que têm um supervisor (que também é um funcionário), pastas que contêm subpastas, e por aí vai.

```java
public class Funcionario {
    private String nome;
    private Funcionario supervisor; // auto referenciamento
}
```

Aqui, `Funcionario` tem um atributo `supervisor` do tipo `Funcionario`. Um funcionário pode ser subordinado a outro funcionário. Esse padrão aparece muito em organogramas.

### Resumo rápido

> **Associação** = referência simples entre objetos. Sem propriedade, sem dependência de ciclo de vida. Em UML: linha sólida simples. A auto-associação (recursiva) permite que uma classe referencie a si mesma.

<!-- \newpage -->

## 1.3 Agregação

### Aprofundamento

Agregação é um tipo especial de associação com sentido de "tem um", mas com vida independente. Uma classe agrupa ou contém outras sem ser dona delas. Os objetos agregados podem existir separadamente.

Em UML, a agregação aparece como uma linha com um **losango não preenchido** (vazio) na extremidade da classe agregadora.

Exemplo clássico: um `Departamento` de uma universidade agrega vários `Professor`es. Se o departamento for extinto, os professores continuam existindo — podem ser transferidos para outro departamento, podem atuar em mais de um ao mesmo tempo. Essa independência é o que caracteriza a agregação.

```java
public class Departamento {
    private String nome;
    private Professor[] professores; // Agregação
}

public class Professor {
    private String nome;
}
```

O ponto central aqui: o `Departamento` "tem" professores, mas não é "dono" deles. Destruir o departamento não destrói os professores.

### Resumo rápido

> **Agregação** = relação "tem um" com vida independente. As partes sobrevivem sem o todo. Em UML: losango **vazio** na ponta do todo.

<!-- \newpage -->

## 1.4 Composição

### Aprofundamento

Composição é o relacionamento mais forte que existe na POO. Indica que uma classe é composta por outras que não fazem sentido sozinhas. Os objetos-parte só existem enquanto o objeto principal existir. Há dependência total de ciclo de vida: ao destruir o todo, as partes são destruídas junto.

Em UML, aparece como uma linha com um **losango preenchido** (sólido) na extremidade da classe principal.

Exemplo: a classe `Pessoa` é composta por `Coracao` e `Cerebro`. Esses órgãos não fazem sentido isolados no sistema — existem apenas como parte de uma pessoa. Quando o objeto `Pessoa` é destruído, seus órgãos também deixam de existir.

```java
public class Pessoa {
    private Coracao coracao;   // Composição
    private Cerebro cerebro;   // Composição
}

class Coracao {
    // atributos e métodos do coração
}

class Cerebro {
    // atributos e métodos do cérebro
}
```

A diferença prática entre agregação e composição se resume a isso: na agregação as partes sobrevivem sem o todo; na composição, não.

### Resumo rápido

> **Composição** = relação de propriedade exclusiva e forte. As partes não existem sem o todo. Em UML: losango **preenchido** na ponta do todo.

<!-- \newpage -->

## 1.5 Multiplicidade e cardinalidade

### Aprofundamento

Multiplicidade define quantas instâncias de uma classe podem estar associadas a outra. Em UML, também é chamada de cardinalidade. Indica os limites mínimo e máximo do relacionamento.

Notações comuns:

| Notação | Significado                          |
|---------|--------------------------------------|
| `1`     | Exatamente uma instância             |
| `0..1`  | Zero ou uma (opcional)               |
| `0..*`  | Zero ou mais                         |
| `1..*`  | Uma ou mais                          |
| `3..5`  | Entre três e cinco (restrição fixa)  |

Aplicação nos três tipos de relacionamento:

- **Associação**: uma `Pessoa` pode estar associada a `0..1` `Endereco`
- **Agregação**: um `Departamento` pode agregar `0..*` `Professor`es
- **Composição**: uma `Pessoa` possui `1` `Coracao` e `1` `Cerebro`

### Resumo rápido

> Multiplicidade indica quantas instâncias participam de um relacionamento. Notações: `1`, `0..1`, `0..*`, `1..*`, ou faixas como `3..5`.

<!-- \newpage -->

## 1.6 Navegabilidade

### Aprofundamento

Navegabilidade define a direção da comunicação entre objetos. Indica qual classe possui uma referência para acessar a outra. Em UML, aparece como uma seta de ponta aberta (→), apontando de quem conhece para quem é conhecido.

Dois tipos:

- **Unidirecional**: só uma classe conhece a outra. Exemplo: `Pedido` → `Cliente` — o pedido sabe quem é o cliente, mas o cliente não precisa conhecer todos os pedidos.
- **Bidirecional**: ambas se conhecem. Representada sem seta ou com setas nos dois sentidos.

Exemplos:

- `Pessoa` → `Endereco`: a pessoa conhece seu endereço, mas o endereço não sabe nada sobre a pessoa
- `Departamento` → `Professor`: o departamento acessa os professores, mas os professores não acessam o departamento

### Resumo rápido

> Navegabilidade = direção do conhecimento entre classes. Unidirecional: só um lado conhece o outro. Bidirecional: ambos se conhecem. Em UML: seta aberta (→).

<!-- \newpage -->

## 1.7 Exemplo completo — sistema de biblioteca

### Aprofundamento

Um sistema de biblioteca combina os três tipos de relacionamento:

- **Agregação**: `Biblioteca` agrega múltiplas `Secao`. As seções podem existir independentemente.
- **Composição**: cada `Secao` é composta por `Estante`s. As estantes não fazem sentido fora de sua seção.
- **Associação**: `Estante` está associada a vários `Livro`. `Livro` está associado a `Autor`, com navegabilidade unidirecional (o autor não conhece os livros diretamente).

Multiplicidade:

- `Biblioteca` → `1..*` `Secao`
- `Secao` → `1..*` `Estante`
- `Estante` → `0..*` `Livro`
- `Livro` → `1..*` `Autor`

```java
public class Biblioteca {
    private String nome;
    private Secao[] secoes;       // Agregação
}

public class Secao {
    private String nome;
    private Estante[] estantes;   // Composição
}

public class Estante {
    private int numero;
    private Livro[] livros;       // Associação
}

public class Livro {
    private String titulo;
    private Autor[] autores;      // Associação
}

public class Autor {
    private String nome;
    private String nacionalidade;
}
```

A navegação vai sempre da `Biblioteca` para dentro: `Biblioteca` → `Secao` → `Estante` → `Livro` → `Autor`. Cada classe possui referências explícitas à próxima, mas não o contrário.

### Resumo rápido

> O sistema de biblioteca combina agregação (biblioteca-seção), composição (seção-estante) e associação (estante-livro, livro-autor), com navegabilidade unidirecional de fora para dentro.

<!-- \newpage -->

## 1.8 Resumo do capítulo

| Tipo         | Vínculo         | Ciclo de vida       | UML                      |
|-------------|----------------|--------------------|-----------------------------|
| Associação  | Referência simples | Independente     | Linha sólida simples        |
| Agregação   | "Tem um" fraco   | Independente       | Losango vazio (não preenchido) |
| Composição  | "Tem e é dono"   | Dependente do todo | Losango cheio (preenchido)  |

Outros conceitos do capítulo:

- **Multiplicidade**: quantas instâncias participam (`1`, `0..1`, `0..*`, `1..*`)
- **Navegabilidade**: quem conhece quem (unidirecional ou bidirecional)
- **Associação recursiva**: uma classe referenciando a si mesma

<!-- \newpage -->

---
---

# Capítulo 2 — Herança

<!-- \newpage -->

## 2.1 O que é herança

### Aprofundamento

Herança é um dos quatro pilares da POO (junto com encapsulamento, abstração e polimorfismo). Permite que uma classe nova reutilize e especialize os comportamentos de uma classe já existente.

A ideia é direta: em vez de copiar e colar código, você cria uma classe que "herda" tudo de outra e depois acrescenta ou modifica o que precisar.

Dois objetivos centrais:

1. **Reutilização de código** já testado e confiável
2. **Especialização de comportamentos** para classes mais específicas

Para entender se herança faz sentido, existe um teste simples:

- Relação **"é um"** → herança. Exemplo: `Carro` é um `Veiculo`.
- Relação **"tem um"** → composição ou agregação. Exemplo: `Carro` tem um `Motor`.

Se o "é um" não faz sentido, herança provavelmente não é o caminho certo.

```java
// Superclasse
public class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void exibirMarca() {
        System.out.println("Marca: " + marca);
    }
}

// Subclasse
public class Carro extends Veiculo {
    private String modelo;

    public Carro(String marca, String modelo) {
        super(marca); // chama o construtor da superclasse
        this.modelo = modelo;
    }

    public void exibirModelo() {
        System.out.println("Modelo: " + modelo);
    }
}
```

As vantagens concretas:

- Evita repetição de código
- Centraliza manutenção de funcionalidades comuns
- Facilita a extensão e escalabilidade do sistema

### Resumo rápido

> Herança permite que uma subclasse reutilize e especialize o código de uma superclasse. Teste "é um" para saber se herança faz sentido. Use `extends` em Java.

<!-- \newpage -->

## 2.2 Superclasse e subclasse

### Aprofundamento

Uma **superclasse** (também chamada de classe base, classe-pai ou classe-mãe) fornece atributos e métodos comuns a várias outras classes.

Uma **subclasse** (classe derivada, classe-filha) herda os atributos e métodos da superclasse e pode:

- Adicionar novos comportamentos
- Modificar comportamentos herdados
- Especializar funcionalidades

A relação é de especialização: a subclasse é um tipo mais específico da superclasse.

#### Hierarquias de classes

Hierarquias representam níveis de especialização. Exemplo: `Forma` → `Circulo`, `Quadrado`. Isso organiza o sistema de forma modular — as subclasses herdam características comuns e adicionam seus próprios detalhes.

```java
// Superclasse
public class Forma {
    public void desenhar() {
        System.out.println("Desenhando forma genérica.");
    }
}

// Subclasse Circulo
public class Circulo extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

// Subclasse Quadrado
public class Quadrado extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado.");
    }
}
```

### Resumo rápido

> Superclasse = genérica, fornece código comum. Subclasse = específica, herda e especializa. Hierarquias organizam a especialização em níveis.

<!-- \newpage -->

## 2.3 A palavra-chave extends

### Aprofundamento

Em Java, a herança é declarada com `extends`:

```java
class Subclasse extends Superclasse {
    // atributos e métodos específicos da subclasse
}
```

Ao usar `extends`, a subclasse herda todos os membros `public` e `protected` da superclasse.

Regra importante: **Java só tem herança simples**. Uma subclasse pode herdar de apenas uma superclasse. Isso aqui não compila:

```java
// ERRO: herança múltipla não existe em Java
class Cachorro extends Mamifero, Carnivoro {}
```

Toda classe em Java herda, direta ou indiretamente, da classe `Object`. Não precisa escrever `extends Object` — isso acontece automaticamente.

### Resumo rápido

> `extends` declara herança. Java só permite herança simples (uma superclasse por vez). Toda classe herda de `Object` implicitamente.

<!-- \newpage -->

## 2.4 O que se herda e o que não se herda

### Aprofundamento

**O que a subclasse herda:**

- Todos os métodos `public` e `protected`
- Todos os atributos `public` e `protected`

Esses membros podem ser usados diretamente na subclasse, a menos que sejam sobrescritos.

```java
public class Animal {
    protected String nome;

    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Cachorro extends Animal {
    public void latir() {
        System.out.println(nome + " está latindo");
    }
}
```

**O que a subclasse NÃO herda:**

- **Construtores** da superclasse — a subclasse precisa declarar os seus próprios
- **Membros `private`** — a subclasse não os acessa diretamente

Para acessar atributos `private` da superclasse, a subclasse usa os getters e setters que a superclasse fornecer.

### Resumo rápido

> Herda-se: métodos e atributos `public` e `protected`. Não se herda: construtores e membros `private`. Para acessar `private`, use getters/setters.

<!-- \newpage -->

## 2.5 Modificadores de acesso na herança

### Aprofundamento

O modificador de acesso determina onde um membro pode ser acessado:

| Modificador  | Acesso                                      |
|-------------|---------------------------------------------|
| `private`   | Apenas dentro da própria classe             |
| `protected` | Dentro da classe, subclasses e mesmo pacote |
| `public`    | De qualquer lugar                            |

Na herança, o modificador impacta diretamente o que é herdado e como é acessado.

`protected` permite que subclasses acessem membros diretamente, mesmo estando em outro pacote. Mas aqui vai uma boa prática: **evite membros `protected`**. Motivos:

- Pode quebrar o encapsulamento
- Deixa a implementação rígida e acoplada

O caminho mais seguro: manter atributos como `private` e criar métodos `public` ou `protected` para acesso controlado (getters/setters).

### Resumo rápido

> `private` = só a própria classe. `protected` = classe, subclasses e pacote. `public` = tudo. Prefira `private` + getters/setters em vez de `protected` direto nos atributos.

<!-- \newpage -->

## 2.6 Construtores em hierarquias de herança

### Aprofundamento

Construtores **não são herdados** em Java. Toda subclasse precisa chamar, de forma explícita ou implícita, um construtor da superclasse. Para isso usamos `super()` dentro do construtor da subclasse.

**Regra obrigatória**: a chamada a `super()` deve ser a primeira instrução do construtor da subclasse.

Dois cenários:

- **Chamada explícita**: quando escrevemos `super(parametros)` no início do construtor.
- **Chamada implícita**: se não escrevemos `super()`, o compilador adiciona automaticamente uma chamada ao construtor sem parâmetros da superclasse.

Se a superclasse não tiver construtor padrão (sem parâmetros), a chamada explícita é obrigatória — senão o código não compila.

```java
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso) {
        super(nome); // chamada explícita obrigatória
        this.curso = curso;
    }
}
```

### Resumo rápido

> Construtores não são herdados. Use `super()` na primeira linha do construtor da subclasse. Se a superclasse não tem construtor padrão, `super(params)` é obrigatório.

<!-- \newpage -->

## 2.7 A classe Object

### Aprofundamento

Em Java, todas as classes herdam, direta ou indiretamente, da classe `Object` (pacote `java.lang`, importado automaticamente). Mesmo sem escrever `extends`, sua classe já possui métodos herdados de `Object`.

Os métodos mais comuns:

| Método                 | O que faz                                                   |
|-----------------------|-------------------------------------------------------------|
| `toString()`          | Retorna uma representação em texto do objeto                |
| `equals(Object obj)`  | Compara dois objetos para verificar igualdade               |
| `hashCode()`          | Retorna um código hash, usado em `HashMap` e similares      |

Você pode (e frequentemente deve) sobrescrever esses métodos para adaptá-los à lógica da sua aplicação. A sobrescrita de métodos é tratada no capítulo sobre polimorfismo.

### Resumo rápido

> Toda classe herda de `Object`. Métodos comuns: `toString()`, `equals()`, `hashCode()`. Sobrescreva-os quando o comportamento padrão não servir.

<!-- \newpage -->

## 2.8 Boas práticas

### Aprofundamento

Quatro diretrizes de engenharia de software para usar herança de forma saudável:

**1. Minimize o uso de membros `protected`.**
Mesmo subclasses não devem acessar atributos de outra classe diretamente. Prefira acesso através de métodos controlados. O acesso direto reduz encapsulamento e dificulta alterações futuras.

**2. Não quebre o encapsulamento.**
Prefira atributos `private` com getters/setters. Garanta que modificações internas na superclasse não comprometam as subclasses. Projete classes de forma que mudanças internas não "vazem" para fora.

**3. Use herança e composição corretamente.**
- Relação "é um" → herança. Exemplo: `Circulo` é uma `Forma`.
- Relação "tem um" → composição ou agregação. Exemplo: `Pessoa` tem um `Endereco`.
- Não force hierarquias de herança quando composição resolve melhor.

**4. Mantenha hierarquias rasas.**
- Projete superclasses genéricas e reutilizáveis
- Evite mais de 2 ou 3 níveis de herança
- Considere o impacto de mudanças na superclasse sobre todas as subclasses
- Documente bem os métodos que podem ser sobrescritos

### Resumo rápido

> Evite `protected` em atributos. Mantenha encapsulamento com `private` + getters/setters. Use herança só para "é um", composição para "tem um". Prefira hierarquias de no máximo 2-3 níveis.

<!-- \newpage -->

## 2.9 Resumo do capítulo

| Conceito               | Descrição                                                     |
|------------------------|---------------------------------------------------------------|
| Herança                | Subclasse reutiliza e especializa código da superclasse       |
| `extends`              | Declara herança em Java (herança simples apenas)              |
| Superclasse            | Classe genérica com atributos e comportamentos comuns         |
| Subclasse              | Classe específica que herda e pode estender/sobrescrever      |
| Herda                  | Métodos e atributos `public` e `protected`                    |
| Não herda              | Construtores e membros `private`                              |
| `super()`              | Chama o construtor da superclasse (primeira linha obrigatória)|
| `Object`               | Raiz de toda hierarquia de classes em Java                    |

<!-- \newpage -->

---
---

# Capítulo 3 — Polimorfismo

<!-- \newpage -->

## 3.1 O que é polimorfismo

### Aprofundamento

A palavra vem do grego: "poli" (muitos) + "morfos" (formas). Na prática, significa que objetos de classes diferentes podem responder de maneira diferente ao mesmo método.

Polimorfismo é um dos quatro pilares da POO (junto com encapsulamento, herança e abstração). Permite que um mesmo método tenha comportamentos distintos dependendo do objeto que o chama.

Exemplos do cotidiano:

- O método `fazerSom()`: um cachorro late, um gato mia, um pato grasna
- Um botão "Imprimir": imprime PDFs, imagens ou e-mails — mesma ação, comportamentos diferentes

Por que isso importa:

- Desacopla o código cliente das implementações concretas
- Reutiliza código com abstrações genéricas (interfaces, superclasses)
- Facilita extensões por meio de subclasses
- Permite substituir objetos sem alterar o código principal

Em Java, o polimorfismo se manifesta em dois tipos:

| Tipo                    | Quando ocorre    | Mecanismo                     |
|------------------------|-----------------|-------------------------------|
| Estático (compilação)  | Na compilação   | Sobrecarga (overloading)      |
| Dinâmico (execução)    | Na execução     | Sobrescrita (overriding)      |

### Resumo rápido

> Polimorfismo = "muitas formas". Mesmo método, comportamentos diferentes. Dois tipos em Java: sobrecarga (estático, compilação) e sobrescrita (dinâmico, execução).

<!-- \newpage -->

## 3.2 Polimorfismo estático — sobrecarga

### Aprofundamento

Também chamado de sobrecarga de métodos (method overloading). Permite que uma classe tenha múltiplos métodos com o mesmo nome, mas com assinaturas diferentes (número, tipo ou ordem de parâmetros).

A decisão de qual método executar acontece em tempo de compilação.

Regras:

- Mesmo nome de método
- Assinaturas diferentes (número, tipo ou ordem dos parâmetros)
- O tipo de retorno **não** serve para diferenciar métodos sobrecarregados
- Os métodos coexistem na mesma classe

```java
public class Impressora {
    public void imprimir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void imprimir(int numero) {
        System.out.println("Número: " + numero);
    }

    public void imprimir(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Repetição " + (i + 1) + ": " + texto);
        }
    }
}
```

Aqui, `imprimir` aparece três vezes com assinaturas diferentes. O compilador escolhe qual chamar com base nos argumentos passados.

### Resumo rápido

> Sobrecarga = mesmo nome, assinaturas diferentes. Resolvida em compilação. O tipo de retorno não diferencia métodos sobrecarregados.

<!-- \newpage -->

## 3.3 Polimorfismo dinâmico — sobrescrita

### Aprofundamento

Também chamado de sobrescrita de métodos (method overriding). Ocorre quando uma subclasse redefine um método da superclasse com a mesma assinatura. A decisão de qual método executar acontece em tempo de execução, com base no tipo real do objeto.

Regras da sobrescrita:

- A subclasse mantém a mesma assinatura (nome, tipo e ordem dos parâmetros)
- O tipo de retorno deve ser o mesmo ou um subtipo
- O método original não pode ser `private` nem `final`
- O nível de acesso na subclasse pode ser igual ou mais permissivo
- Use `@Override` (recomendado)

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som do animal:");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
```

`Cachorro` redefine `emitirSom()`. Mesmo que a referência seja do tipo `Animal`, o comportamento do `Cachorro` é executado se o objeto real for um `Cachorro`.

### Resumo rápido

> Sobrescrita = subclasse redefine método da superclasse com mesma assinatura. Resolvida em execução (tipo real do objeto). Use `@Override`. O método original não pode ser `private` ou `final`.

<!-- \newpage -->

## 3.4 A anotação @Override e a palavra-chave super

### Aprofundamento

#### @Override

`@Override` informa ao compilador que estamos sobrescrevendo um método herdado. Se a assinatura não corresponder exatamente ao método original, o compilador gera um erro. Isso evita bugs silenciosos (como errar o nome do método e acabar criando um novo sem querer).

#### super em métodos

`super` permite acessar métodos e atributos da superclasse. É usado quando queremos executar a lógica original da superclasse antes, depois ou no meio de um novo comportamento.

Motivos para usar `super`:

- Reutilizar código da superclasse
- Evitar duplicação de lógica
- Adicionar funcionalidades sem descartar as anteriores

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som do animal:");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        super.emitirSom(); // executa o método da superclasse
        System.out.println("Miau!");
    }
}
```

Saída:
```
Som do animal:
Miau!
```

`super.emitirSom()` permite que o `Gato` mantenha o comportamento do `Animal` e acrescente sua própria identidade.

### Resumo rápido

> `@Override` = segurança na sobrescrita (erro de compilação se a assinatura não bater). `super.metodo()` = chamar a versão da superclasse de dentro da subclasse.

<!-- \newpage -->

## 3.5 Referência de superclasse e vinculação dinâmica

### Aprofundamento

Em Java, é possível usar uma variável de referência da superclasse para apontar para um objeto de uma subclasse. Essa é uma das formas principais de aplicar polimorfismo em tempo de execução.

```java
Animal a = new Cachorro();
a.emitirSom(); // imprime: "Au au!"
```

Mesmo sendo `a` do tipo `Animal`, o método sobrescrito em `Cachorro` é executado. Isso acontece graças à **vinculação dinâmica** (dynamic binding): a JVM decide em tempo de execução qual versão do método chamar, com base no tipo real do objeto (não no tipo da variável).

Isso permite escrever código genérico, reutilizável e flexível. Você pode trabalhar com referências da superclasse sem se preocupar com qual subclasse concreta está sendo usada — o polimorfismo cuida disso.

### Resumo rápido

> Variável da superclasse pode apontar para objeto da subclasse. A vinculação dinâmica resolve qual método chamar em tempo de execução, com base no tipo real do objeto.

<!-- \newpage -->

## 3.6 Classes e métodos abstratos

### Aprofundamento

Uma **classe abstrata** não pode ser instanciada diretamente. Ela serve como base para outras classes. Pode conter métodos com implementação (comportamento padrão) e métodos abstratos (sem corpo), que as subclasses concretas são obrigadas a implementar.

Um **método abstrato** é declarado sem corpo. Só classes abstratas podem ter métodos abstratos.

```java
public abstract class Forma {
    public abstract double calcularArea(); // sem corpo
}

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
```

```java
Forma f = new Circulo(3.0);
System.out.println("Área: " + f.calcularArea());
```

Para que servem:

- Evitar instanciamento de classes genéricas ou incompletas
- Forçar subclasses a implementar certos métodos
- Promover polimorfismo na hierarquia
- Aumentar consistência na arquitetura

#### Representação em UML

Classes abstratas aparecem com o nome em *itálico* ou com o estereótipo `<<abstract>>`. Métodos abstratos também ficam em itálico. Outros estereótipos comuns: `<<interface>>`, `<<enumeration>>`, `<<singleton>>`.

### Resumo rápido

> Classe abstrata = não instanciável, serve de base. Método abstrato = sem corpo, subclasse é obrigada a implementar. Use `abstract` na declaração.

<!-- \newpage -->

## 3.7 Polimorfismo em arrays e parâmetros

### Aprofundamento

Com polimorfismo, é possível criar arrays de referências da superclasse contendo objetos de subclasses diferentes. O método chamado será o da classe real do objeto.

#### Arrays polimórficos

```java
public abstract class Empregado {
    public String getDescricao() {
        return "Empregado comum";
    }
}

public class Gerente extends Empregado {
    @Override
    public String getDescricao() {
        return "Gerente da empresa";
    }
}

public class Estagiario extends Empregado {
    @Override
    public String getDescricao() {
        return "Estagiário temporário";
    }
}
```

```java
Empregado[] equipe = new Empregado[3];
equipe[0] = new Gerente();
equipe[1] = new Estagiario();
equipe[2] = new Estagiario();

for (Empregado e : equipe) {
    System.out.println(e.getDescricao());
}
```

Cada posição do array produz uma saída diferente, mesmo que todas as variáveis sejam do tipo `Empregado`.

#### Parâmetros polimórficos

Métodos podem receber parâmetros do tipo da superclasse e aceitar qualquer subclasse como argumento:

```java
public class Relatorio {
    public void imprimirDescricao(Empregado e) {
        System.out.println("Descrição: " + e.getDescricao());
    }
}

// Uso:
Relatorio rel = new Relatorio();
rel.imprimirDescricao(new Gerente());
rel.imprimirDescricao(new Estagiario());
```

O método `imprimirDescricao` trata objetos diferentes de forma genérica, mas executa o comportamento específico de cada subclasse.

### Resumo rápido

> Arrays da superclasse podem conter objetos de subclasses diferentes. Parâmetros da superclasse aceitam qualquer subclasse. O comportamento polimórfico funciona em ambos os casos.

<!-- \newpage -->

## 3.8 Boas práticas e princípios de projeto

### Aprofundamento

#### Evite acoplamento com tipos concretos

Prefira receber parâmetros do tipo da superclasse (ou interface) em vez de tipos concretos:

```java
// Evite:
public void processarFuncionario(Gerente g) { ... }

// Prefira:
public void processarFuncionario(Empregado e) { ... }
```

#### Princípio aberto/fechado (Open/Closed Principle)

"Entidades de software devem ser abertas para extensão, mas fechadas para modificação."

Na prática: novas funcionalidades são adicionadas via subclasses, sem modificar código já testado. Isso reduz bugs em sistemas que evoluem.

#### Evite hierarquias confusas

- Use herança quando "X é um Y"
- Para "X tem um Y", prefira composição ou agregação

#### Princípio de substituição de Liskov (LSP)

"Objetos da superclasse devem poder ser substituídos por objetos das subclasses sem alterar o comportamento correto do programa."

Em palavras mais diretas: se você trocar um `Animal` por um `Cachorro` e o programa quebra, algo está errado na hierarquia. Subclasses devem respeitar o contrato da superclasse.

### Resumo rápido

> Use tipos genéricos (superclasse/interface) em parâmetros. Princípio aberto/fechado: estenda sem modificar. LSP: subclasses devem ser substituíveis sem quebrar nada.

<!-- \newpage -->

## 3.9 Resumo do capítulo

| Conceito                | Descrição                                                      |
|------------------------|----------------------------------------------------------------|
| Polimorfismo           | Mesmo método, comportamentos diferentes conforme o objeto      |
| Sobrecarga (overload)  | Mesmo nome, assinaturas diferentes — resolvido em compilação   |
| Sobrescrita (override) | Subclasse redefine método da superclasse — resolvido em execução|
| `@Override`            | Anotação que garante segurança na sobrescrita                  |
| `super`                | Acessa métodos/construtores da superclasse                     |
| Vinculação dinâmica    | JVM escolhe o método com base no tipo real do objeto           |
| Classe abstrata        | Não instanciável, serve de base, pode ter métodos abstratos    |
| Método abstrato        | Sem corpo, subclasse obrigada a implementar                    |
| Arrays polimórficos    | Array da superclasse com objetos de subclasses variadas        |
| Open/Closed            | Aberto para extensão, fechado para modificação                 |
| Liskov (LSP)           | Subclasses substituíveis sem quebrar o programa                |

<!-- \newpage -->

---
---

# Capítulo 4 — Interfaces

<!-- \newpage -->

## 4.1 Conceito e motivação

### Aprofundamento

Interfaces são estruturas que definem contratos de comportamento em Java. Elas dizem "o que" uma classe precisa fazer, sem dizer "como". Todos os métodos em uma interface são, por padrão, `public` e `abstract`.

Interfaces permitem que classes sem relação de herança compartilhem funcionalidades comuns. Uma classe `DocumentoPDF` e uma classe `ImagemPNG` não têm nada em comum na hierarquia, mas ambas podem implementar a interface `Imprimivel`.

Motivos para usar interfaces:

- **Separação de responsabilidades**: define o "o que" sem impor o "como"
- **Reutilização de código**: sem herança direta entre as classes
- **Polimorfismo por contrato**: diferentes implementações, mesma interface
- **Baixo acoplamento**: facilita manutenção e evolução do código

### Resumo rápido

> Interfaces definem contratos — "o que" fazer, não "como". Permitem polimorfismo entre classes não relacionadas por herança. Métodos são `public abstract` por padrão.

<!-- \newpage -->

## 4.2 Interfaces vs. classes abstratas

### Aprofundamento

Essa comparação aparece com frequência em provas, então vale fixar:

| Aspecto       | Interface                                   | Classe abstrata                                |
|--------------|---------------------------------------------|-----------------------------------------------|
| Herança      | Uma classe pode implementar várias          | Só pode estender uma única                    |
| Métodos      | Apenas assinaturas (exceto `default`/`static`) | Pode ter métodos com ou sem implementação    |
| Variáveis    | Apenas constantes (`public static final`)   | Pode ter atributos de instância normais       |
| Construtores | Não possui                                   | Pode ter                                       |
| Propósito    | Definir contratos de comportamento          | Definir comportamento base comum              |

A regra geral: se você quer definir um contrato que classes variadas vão cumprir, use interface. Se você quer compartilhar código concreto com subclasses de uma hierarquia, use classe abstrata.

### Resumo rápido

> Interface = contrato puro, múltipla implementação, sem estado. Classe abstrata = base compartilhada, herança simples, pode ter estado e construtores.

<!-- \newpage -->

## 4.3 Declaração e implementação

### Aprofundamento

Uma interface é declarada com a palavra-chave `interface`. Por convenção, o nome costuma ser um adjetivo que descreve um comportamento: `Imprimivel`, `Conectavel`, `Atualizavel`.

```java
public interface Imprimivel {
    void imprimir();
}
```

Uma classe implementa a interface com `implements` e é obrigada a fornecer uma implementação concreta de todos os métodos da interface:

```java
public class DocumentoPDF implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento PDF...");
    }
}
```

Regras de implementação:

- Todos os métodos da interface devem ser implementados na classe concreta
- Métodos de interface são automaticamente `public` e `abstract`
- Interfaces não possuem atributos de instância, apenas constantes (`public static final`)
- Uma classe pode implementar várias interfaces, separadas por vírgula

```java
public class MinhaClasse implements InterfaceA, InterfaceB {
    // implementação obrigatória de todos os métodos
}
```

A anotação `@Override` é opcional, mas é recomendada.

### Resumo rápido

> Declare com `interface`, implemente com `implements`. Todos os métodos devem ser implementados. Uma classe pode implementar várias interfaces.

<!-- \newpage -->

## 4.4 Interface como tipo de referência

### Aprofundamento

Interfaces podem ser usadas como tipo de referência. Isso permite que o mesmo código funcione com implementações diferentes — polimorfismo por contrato.

```java
Imprimivel arquivo = new DocumentoPDF();
arquivo.imprimir(); // Saída: Imprimindo documento PDF...
```

A chamada a `imprimir()` se comporta de forma diferente dependendo do objeto real. Se trocarmos `DocumentoPDF` por `ImagemPNG`, o código que usa `Imprimivel` nem precisa mudar.

Isso funciona inclusive com coleções:

```java
List<Imprimivel> filaDeImpressao = new ArrayList<>();
filaDeImpressao.add(new DocumentoPDF());
filaDeImpressao.add(new ImagemPNG());
filaDeImpressao.add(new Relatorio());

for (Imprimivel item : filaDeImpressao) {
    item.imprimir(); // comportamento polimórfico
}
```

Qualquer classe que implemente `Imprimivel` pode ser adicionada à fila sem modificar o sistema.

### Resumo rápido

> Use a interface como tipo de variável para alcançar polimorfismo. Qualquer implementação pode ser usada onde a interface é esperada. Funciona com coleções e parâmetros de métodos.

<!-- \newpage -->

## 4.5 Múltiplas interfaces

### Aprofundamento

Em Java, uma classe pode implementar várias interfaces, combinando comportamentos distintos de forma modular.

```java
public interface Imprimivel {
    void imprimir();
}

public interface Conectavel {
    void conectar();
}

public class SmartImpressora implements Imprimivel, Conectavel {
    private String modelo;

    public SmartImpressora(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a impressora " + modelo + " à rede Wi-Fi...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento na impressora " + modelo + "...");
    }
}
```

`SmartImpressora` cumpre dois contratos ao mesmo tempo: pode ser usada como `Imprimivel` e como `Conectavel`. Isso é algo que herança simples sozinha não resolve (lembre-se: Java não tem herança múltipla de classes).

### Resumo rápido

> Uma classe pode implementar várias interfaces, combinando contratos diferentes. Isso compensa a falta de herança múltipla em Java.

<!-- \newpage -->

## 4.6 Interfaces da API padrão do Java

### Aprofundamento

Java traz várias interfaces prontas na sua biblioteca padrão. Ao implementá-las, sua classe ganha integração direta com estruturas e utilitários da linguagem.

As mais comuns:

| Interface          | O que faz                                       |
|-------------------|-------------------------------------------------|
| `Comparable<T>`   | Permite ordenar objetos via `compareTo()`       |
| `Runnable`        | Define código a ser executado por uma `Thread`  |
| `Serializable`    | Marca objetos que podem ser convertidos em bytes|
| `Iterable<T>`     | Permite iteração com `for-each`                 |

#### Exemplo com Comparable

```java
public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
```

O método `Double.compare` retorna:

- `0` se os valores são iguais
- Valor negativo se o primeiro é menor
- Valor positivo se o primeiro é maior

Com isso, `Collections.sort()` funciona diretamente:

```java
List<Produto> produtos = new ArrayList<>();
produtos.add(new Produto("Teclado", 120.0));
produtos.add(new Produto("Monitor", 899.0));
produtos.add(new Produto("Mouse", 59.9));

Collections.sort(produtos); // ordena pelo preço

for (Produto p : produtos) {
    System.out.println(p);
}
```

### Resumo rápido

> Interfaces da API Java: `Comparable` (ordenação), `Runnable` (threads), `Serializable` (serialização), `Iterable` (for-each). Implemente-as para ganhar integração com a linguagem.

<!-- \newpage -->

## 4.7 Métodos default e static (Java 8+)

### Aprofundamento

A partir do Java 8, interfaces ganharam dois recursos novos:

#### Métodos default

Permitem implementação dentro da interface. Útil para evoluir interfaces sem quebrar código existente — classes que já implementam a interface não precisam redefinir o método default.

```java
public interface Atualizavel {
    default void verificarAtualizacoes() {
        System.out.println("Verificando atualizações padrão...");
    }
}

public class Aplicativo implements Atualizavel {
    // usa o comportamento padrão, não precisa implementar nada
}

public class SistemaOperacional implements Atualizavel {
    @Override
    public void verificarAtualizacoes() {
        System.out.println("Buscando atualizações do sistema operacional...");
    }
}
```

#### Métodos static

Funcionam como métodos utilitários, parecidos com os de classes helper. Não podem ser sobrescritos. São chamados pelo nome da interface:

```java
public interface ConversorUnidades {
    static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }
}

// Uso:
double f = ConversorUnidades.celsiusParaFahrenheit(25);
```

#### Comparação atualizada: interfaces vs. classes abstratas

| Critério                 | Interface (com `default`/`static`)       | Classe abstrata                        |
|-------------------------|------------------------------------------|----------------------------------------|
| Herança múltipla        | Sim (várias interfaces)                  | Não (uma superclasse só)               |
| Métodos com corpo       | `default` e `static` (sem estado)        | Métodos concretos com acesso ao estado |
| Atributos de instância  | Não (apenas constantes)                  | Sim                                     |
| Construtores            | Não                                       | Sim                                     |
| Encapsulamento          | Métodos implicitamente `public`          | Pode usar `private`, `protected`       |

### Resumo rápido

> `default` = método com corpo na interface, pode ser sobrescrito. `static` = utilitário chamado pela interface, não pode ser sobrescrito. Ambos introduzidos no Java 8.

<!-- \newpage -->

## 4.8 Resumo do capítulo

| Conceito                  | Descrição                                                         |
|--------------------------|-------------------------------------------------------------------|
| Interface                | Contrato de comportamento (`public abstract` por padrão)         |
| `implements`             | Palavra-chave para implementar interfaces                        |
| Múltiplas interfaces     | Uma classe pode implementar várias                                |
| Tipo de referência       | Interface usada como tipo de variável (polimorfismo)             |
| `Comparable<T>`          | Interface da API para ordenação via `compareTo()`                |
| Método `default`         | Método com implementação dentro da interface (Java 8+)           |
| Método `static`          | Método utilitário na interface, não pode ser sobrescrito         |
| Interface vs. abstrata   | Interface = contrato. Abstrata = base com estado e construtores  |

<!-- \newpage -->

---
---

<!-- APÊNDICE: Guia de conversão LaTeX -->

# Apêndice — Guia de conversão para LaTeX

Este documento foi preparado para facilitar a conversão para LaTeX. Aqui estão as correspondências entre as marcações usadas e os comandos LaTeX equivalentes.

## Estrutura do documento

```latex
\documentclass[12pt, a4paper]{book}
\usepackage[utf8]{inputenc}
\usepackage[brazil]{babel}
\usepackage{listings}
\usepackage{booktabs}
\usepackage{hyperref}
\usepackage{geometry}
\usepackage{tcolorbox}

\geometry{margin=2.5cm}

\title{Programação Orientada a Objetos em Java}
\author{Guia de Estudo para Prova}
\date{}

\begin{document}
\maketitle
\tableofcontents
% ... capítulos ...
\end{document}
```

## Mapeamento de elementos

| Markdown                     | LaTeX                                              |
|-----------------------------|----------------------------------------------------|
| `# Capítulo`                | `\chapter{Capítulo}`                               |
| `## Seção`                  | `\section{Seção}`                                  |
| `### Subseção`              | `\subsection{Subseção}`                            |
| `#### Sub-subseção`         | `\subsubsection{Sub-subseção}`                     |
| `> bloco citação`           | `\begin{quote}...\end{quote}`                      |
| `` `código inline` ``       | `\texttt{código inline}`                           |
| `**negrito**`               | `\textbf{negrito}`                                 |
| `*itálico*`                 | `\textit{itálico}`                                 |
| ` ```java ``` `             | `\begin{lstlisting}[language=Java]...\end{lstlisting}` |
| `<!-- \newpage -->`         | `\newpage`                                         |
| Tabelas markdown            | Ambiente `tabular` com `booktabs`                  |
| `---` (separador)           | `\begin{center}\rule{0.5\linewidth}{0.4pt}\end{center}` |

## Blocos de resumo rápido

Os blocos `> Resumo...` podem ser convertidos em um ambiente personalizado:

```latex
\newenvironment{resumo}{
  \begin{tcolorbox}[colback=gray!10, colframe=gray!50, title=Resumo rápido]
}{
  \end{tcolorbox}
}
```

(Requer o pacote `tcolorbox`.)

## Notas sobre paginação

- Cada `<!-- \newpage -->` marca onde inserir `\newpage`
- Cada seção (`##`) inicia em página nova
- O sumário é gerado automaticamente com `\tableofcontents`
- Os blocos "Aprofundamento" e "Resumo rápido" dentro de cada seção ficam na mesma página (ou páginas consecutivas) da seção

<!-- FIM DO DOCUMENTO -->
