## **Polimorfismo** 

173 

## **O que é Polimorfismo?** 

- **Polimorfismo** é um dos **da Orientada a pilares Programação** 

- **Objetos (POO)** , junto com: 

   - **Encapsulamento** 

   - **Herança** 

   - **Abstração** 

- A palavra vem do grego: **"poli" = muitos, "morfos" = formas** →Significa que objetos de diferentes classes podem **responder de maneira diferente** ao **mesmo método** . 

**174** 

## **Conceito Geral e Exemplos do Mundo Real** 

- O polimorfismo permite que **um mesmo método tenha comportamentos diferentes** , dependendo do objeto que o chama. 

- Exemplos: 

   - `fazerSom()` 

      - Um **cachorro** late 

      - Um **gato** mia 

      - ■ Um **pato** grasna 

   - Botão " **Imprimir** ": 

      - Imprime documentos PDF, imagens ou e-mails → **mesma ação, diferentes comportamentos** 

**175** 

## **Por que Polimorfismo é importante?** 

- **Desacopla** código cliente das implementações concretas 

- **Reutiliza** com código abstrações genéricas (interfaces, 

- superclasses) 

- ● **Facilita extensões** por meio de subclasses ● **Permite substituição** de objetos sem alterar o código principal +4 Com o polimorfismo, é possível escrever a **código mais genérico,** 

- **reutilizável e fácil de manter** . 

**176** 

## **Tipos de Polimorfismo em Java** 

- Em Java, o polimorfismo se manifesta em dois tipos principais: 

   - **Polimorfismo de tempo de compilação/estático** ou **sobrecarga de métodos** ( _**method overloading**_ ) 

   - **Polimorfismo de tempo de execução/dinâmico** ou **sobrescrita de métodos** ( _**method overriding**_ ) 

**Tipo de Polimorfismo Quando ocorre Mecanismo** Compilação (Estático) Durante a compilação Sobrecarga ( _overload_ ) de métodos Execução (Dinâmico) Durante a execução Sobrescrita ( _override_ ) de métodos 

**177** 

## **Polimorfismo de Tempo de Compilação (Estático)** 

- Também chamado de **sobrecarga de métodos** ( _**method**_ . 

- _**overloading**_ ) 

- Permite que uma classe tenha **múltiplos métodos com o mesmo nome** , mas com **diferentes assinaturas** (número ou tipo de parâmetros). 

- A decisão de qual método será executado ocorre **em tempo de** . 

- **compilação** 

- Exemplo em Java: 

`somar(int a, int b) somar(double a, double b)` 

Ambos têm o mesmo nome, mas tipos de parâmetro diferentes. 

**178** 

## **Regras da Sobrecarga em Java** 

- **Mesmo nome** de método 

- **Assinaturas diferentes** : 

   - **Número** de parâmetros 

   - **Tipos** de parâmetros 

   - **Ordem** dos parâmetros 

- O **tipo de retorno** não conta para diferenciar métodos sobrecarregados 

- Os métodos podem **coexistir** na mesma classe 

**179** 

## **Exemplo de Sobrecarga** 

**`public class Impressora { public void imprimir(String texto) { System.out.println("Texto: " + texto); }`** 

**`public void imprimir(int numero) { System.out.println("Número: " + numero); }`** 

**`public void imprimir(String texto, int vezes) { for (int i = 0; i < vezes; i++) { System.out.println("Repetição " + (i + 1) + ": " + texto); }`** 

**`}`** 

**`}`** 

**180** 

## **Polimorfismo de Tempo de Execução (Dinâmico)** 

- Também chamado de **sobrescrita de métodos** ( _**method**_ . 

- _**overriding**_ ) 

- Ocorre quando uma **subclasse redefine** um método da superclasse com a **mesma assinatura** . 

- Permite **alterar** ou **especializar** o comportamento herdado. 

- A decisão sobre qual método será executado é feita **em tempo de execução** , com base no **tipo real do objeto** . 

**181** 

## **Regras da Sobrescrita em Java** 

- A subclasse deve manter a **mesma assinatura** do método (nome, tipo e ordem dos parâmetros). 

- O **tipo de retorno** deve ser o mesmo ou um subtipo do método da superclasse. 

- O método original **não pode ser** `private` nem `final` 

- O **nível de acesso** na subclasse pode ser igual ou mais permissivo. 

- ● Recomenda-se o uso da anotação `@Override` 

**182** 

## **A Anotação** `@Override` 

- `@Override` informa ao compilador que estamos sobrescrevendo um método herdado. 

- Caso a assinatura não corresponda exatamente ao método original, **erro** . 

- o compilador gerará um 

- Garante maior **segurança** , **clareza** e **legibilidade** no código. 

**183** 

## **Exemplo de Sobrescrita** 

**`public class Animal {`** 

**`public void emitirSom() { System.out.println("Som do animal:"); }`** 

**`}`** 

**`public class Cachorro extends Animal { @Override public void emitirSom() { System.out.println("Au au!"); }`** 

**`}`** 

- `Cachorro` redefine o comportamento de `emitirSom()` , herdado de `Animal` . 

- Mesmo que a referência seja da superclasse, o comportamento da subclasse será executado. 

   - Permite que cada subclasse forneça **sua própria versão especializada** de um comportamento comum. 

**184** 

## **O que é** `super` **em Java?** 

- A acessar **métodos e atributos da** palavra-chave `super` permite . 

- **superclasse** 

- É usada em subclasses para: 

   - Chamar **métodos sobrescritos** da superclasse; 

   - Acessar **construtores** da superclasse; 

   - **Complementar** comportamentos herdados, sem substituí-los por completo. 

**185** 

## **Quando usar em métodos?** `super` 

- Quando queremos **executar a lógica original** da superclasse **antes, depois ou no meio** de um novo comportamento: 

   - **Reutilizar código** já existente na superclasse; 

   - ○ **Evitar duplicações** de lógica; 

   - **Adicionar funcionalidades** sem descartar as anteriores; 

- Permite criar versões **mais** sem a **especializadas** perder 

- funcionalidade herdada. 

**186** 

## **Exemplo de Sobrescrita com** `super` 

**`public class Animal { public void emitirSom() { System.out.println("Som do animal:"); }`** 

**`}`** 

**`public class Gato extends Animal {`** fT **`@Override`** + **`public void emitirSom() { super.emitirSom(); // Chama o método da superclasse System.out.println("Miau!"); }`** 

**`}`** 

- `super.emitirSom()` → permite que o `Gato` **mantenha o comportamento** do `Animal` , mas **acrescente sua própria identidade** sonora. 

**187** 

## **Referência de Superclasse em Java (1/2)** 

- Em Java, é possível usar **uma variável de referência da superclasse** para apontar para um **objeto de uma subclasse** . 

- Essa é uma das **formas de o em principais aplicar polimorfismo** . 

- **tempo de execução** 

- Com isso, podemos escrever código **mais genérico, reutilizável e flexível** . 

**188** 

## **Referência de Superclasse em Java (2/2)** 

- Uma variável do tipo da superclasse pode armazenar um objeto de qualquer **subclasse** . 

- Quando chamamos um **método sobrescrito** , a versão da **subclasse** é executada — não a da superclasse. 

- Isso é possível graças à **vinculação dinâmica (** _**dynamic binding**_ **)** , tratada mais adiante. 

**189** 

## **Exemplo de Referência de Superclasse em Java** 

**`public class Animal {`** 

**`public void emitirSom() { System.out.println("Som do animal:"); }`** 

**`}`** 

**`public class Cachorro extends Animal { @Override`** 

**`public void emitirSom() { System.out.println("Au au!"); }`** 

**`}`** 

**`public class Teste {`** 

**`public static void main(String[] args) { Animal a = new Cachorro(); // referência de superclasse a.emitirSom(); // imprime: "Au au!" — método da subclasse`** 

**`}`** 

**`}`** 

Mesmo sendo `a` do tipo `Animal` , o método sobrescrito em `Cachorro` é o que será executado. 

**190** 

## **O que são Classes Abstratas?** 

- **Classe abstrata** : não pode ser instanciada diretamente. 

- Serve como **base para outras classes** . 

- Pode conter: 

   - **Métodos com implementação** (comportamento padrão); 

   - **Métodos abstratos** (sem corpo), que exigem implementação nas subclasses. 

- Utiliza-se o modificador `abstract` 

**191** 

## **O que são Métodos Abstratos?** 

- **Método abstrato** : 

   - Declarado **sem corpo** . 

   - ○ Deve ser obrigatoriamente implementado pelas subclasses concretas. 

- **Somente classes abstratas podem ter métodos abstratos** . 

- Exemplo de sintaxe: 

**`public abstract class Animal { public abstract void emitirSom(); // sem corpo }`** 

**192** 

## **Para que Servem os Métodos e Classes Abstratos?** 

- Evitar instanciamento de classes genéricas ou incompletas. 

- **Forçar subclasses** a implementar certos métodos. 

- **Promover polimorfismo** em níveis superiores da hierarquia de classes. 

- Aumentar **consistência e previsibilidade** na arquitetura do sistema. 

**193** 

## **Representação em UML** 

- **Classes abstratas nome** em **itálico** . aparecem com o 

- **Métodos abstratos** também aparecem em **itálico** . 

- Também é comum o uso do estereótipo `«abstract»` 

- Isso indica que a classe **não pode ser instanciada diretamente** . 

**==> picture [16 x 9] intentionally omitted <==**

**----- Start of picture text -----**<br>
ou<br>**----- End of picture text -----**<br>


**194** 

## **Estereótipos em UML** 

- Estereótipos adicionam **significado semântico** aos elementos do diagrama. 

- São palavras entre `« »` que **classificam o elemento** . 

- Exemplos: 

   - `«abstract»` →classe abstrata 

   - `«interface»` →interface 

   - `«enumeration»` →enumeração 

   - `«singleton»` →padrão de projeto 

- **Tornam o diagrama mais expressivo e compreensível** . 

**195** 

## **Exemplo de Classes e Métodos Abstratos** 

**`public abstract class Forma { public abstract double calcularArea();`** 

**`}`** 

**`public class Circulo extends Forma { private double raio; public Circulo(double raio) { this.raio = raio;`** 

**`}`** 

**`public class TesteForma {`** 

**`}`** 

**`@Override`** 

**`public double calcularArea() { return Math.PI * raio * raio; }`** 

**`}`** 

**`public static void main(String[] args) { Forma f = new Circulo(3.0); System.out.println("Área: " + f.calcularArea()); }`** 

**196** 

## **Polimorfismo em** _**Arrays**_ 

- Com polimorfismo, podemos: 

   - Tratar objetos de **subclasses diferentes** por meio de referências da **superclasse** . 

   - Criar _**arrays**_ **de objetos** heterogêneos (desde que todos sejam instâncias da mesma hierarquia). 

- : 

- _**Arrays**_ **polimórficos** 

   - Um de referências da conter de _array_ superclasse pode objetos 

   - diversas subclasses. 

   - O método chamado em tempo de execução será o da **classe real do objeto** , não da variável de referência. 

**197** 

## **Exemplo de** _**Array**_ **Polimórfico** 

**`public abstract class Empregado { public String getDescricao() { return "Empregado comum"; }`** 

**`}`** 

**`public class Gerente extends Empregado { @Override public String getDescricao() { return "Gerente da empresa"; }`** 

**`}`** 

**`public class TesteArray {`** 

**`public static void main(String[] args) { Empregado[] equipe = new Empregado[3]; equipe[0] = new Gerente(); equipe[1] = new Estagiario(); equipe[2] = new Estagiario();`** 

**`public class Estagiario extends Empregado { @Override public String getDescricao() { return "Estagiário temporário"; }`** 

**`}`** 

**`}`** 

**`for (Empregado e : equipe) { System.out.println(e.getDescricao()); } }`** 

A saída do programa será diferente para cada posição do _array_ , mesmo que todas as variáveis sejam do tipo `Empregado` . 

**198** 

## **Polimorfismo em Parâmetros de Método** 

- . 

- Métodos podem receber **parâmetros do tipo da superclasse** 

- ● **instância de subclasse** É possível passar **qualquer** como argumento. 

- ● . Isso simplifica o código e aumenta a **reutilização** 

**`public class Relatorio { public void imprimirDescricao(Empregado e) { System.out.println("Descrição: " + e.getDescricao()); }`** 

**`public static void main(String[] args) { Relatorio rel = new Relatorio(); rel.imprimirDescricao(new Gerente()); rel.imprimirDescricao(new Estagiario());`** 

**`}`** 

O método `imprimirDescricao()` trata diferentes objetos de forma genérica, mas executa comportamentos específicos de cada subclasse. 

**`}`** 

**199** 

## **Polimorfismo e Projeto Orientado a Boas Práticas** 

- O polimorfismo melhora: 

   - **Modularidade** 

   - **Flexibilidade** 

   - **Manutenibilidade** 

- Mas deve ser usado com **boas práticas de projeto** para garantir código limpo e sustentável. 

**200** 

## **Polimorfismo e Projeto Orientado a Boas Práticas** 

● Evite **acoplamento** com **tipos concretos** : 

**`// Menos recomendado: public void processarFuncionario(Gerente g) { System.out.println(g.getDescricao()); }`** 

**`// Recomendado: public void processarFuncionario(Empregado e) { System.out.println(e.getDescricao());`** 

**`}`** 

**201** 

## **Polimorfismo e Projeto Orientado a Boas Práticas** 

- Extensibilidade e o **Princípio Aberto/Fechado** ( _**Open/Closed Principle**_ ): 

_“Entidades de software devem ser_ _**abertas para extensão** , mas_ _**fechadas para modificação** .”_ 

- Isso significa: 

   - Novas funcionalidades podem ser adicionadas via **subclasses** ; 

   - ■ Sem necessidade de **modificar código já testado** ; ■ **Redução de bugs** em sistemas evolutivos. 

**202** 

## **Polimorfismo e Projeto Orientado a Boas Práticas** 

- : 

- **Evite hierarquias confusas** 

   - Use **herança** apenas quando “ **X é um Y** ”. 

   - Para “ **X tem um Y** ”, prefira **composição** ou **agregação** . 

- : 

- **Princípio de Substituição de Liskov (LSP)** 

_“Objetos da_ _**superclasse** devem poder ser substituídos por objetos das_ _**subclasses** sem alterar o_ _**comportamento** correto do programa.”_ 

- **Subclasses** devem o **respeitar** 

- **contrato da superclasse** ! 

**Barbara Liskov** 

**203** 

## **Exemplo Completo de Polimorfismo em Java** 

- **Classe abstrata** `Empregado` com o **método abstrato** `calcularPagamento()` 

- **Subclasses** : 

   - `EmpregadoAssalariado` (pagamento fixo) 

   - `EmpregadoComissionado` (pagamento por comissão) 

## ● **Pontos abordados** : 

- Sobrescrita de métodos ( `@Override` ) 

- Uso de _arrays_ com referência à superclasse 

- Vinculação dinâmica 

**204** 

## **Exemplo Completo de Polimorfismo em Java** 

**`public abstract class Empregado {`** 

**`private String nome;`** 

**`public Empregado(String nome) { this.nome = nome; } public String getNome() { return nome; } public abstract double calcularPagamento();`** 

**`}`** 

**`public class EmpregadoAssalariado extends Empregado { private double salarioFixo;`** 

**`public EmpregadoAssalariado(String nome, double salarioFixo) { super(nome);`** 

**`this.salarioFixo = salarioFixo;`** 

**`}`** 

**`@Override`** 

**`public double calcularPagamento() {`** 

**`return salarioFixo;`** 

**`}`** 

**`}`** 

**205** 

## **Exemplo Completo de Polimorfismo em Java** 

**`Empregado[] lista = new Empregado[3]; lista[0] = new EmpregadoAssalariado("João", 3000); lista[1] = new EmpregadoComissionado("Maria", 50000, 0.1); lista[2] = new EmpregadoAssalariado("Carlos", 4500);`** 

**`for (Empregado emp : lista) { System.out.println(emp.getNome() + " - Pagamento: R$ " + emp.calcularPagamento()); }`** 

• O método `calcularPagamento()` é chamado conforme o **tipo real do objeto** 

**206** 

## **Recapitulando Polimorfismo em Java (1/2)** 

- **Polimorfismo** é um dos da Orientada a pilares Programação 

- Objetos. 

- Esse conceito permite que objetos de diferentes classes sejam tratados de forma uniforme, promovendo: 

   - **Extensibilidade** do sistema: novos comportamentos podem ser adicionados sem modificar os existentes. 

   - **Reutilização de código** : métodos genéricos podem trabalhar com diferentes tipos de objetos. 

   - ○ **Facilidade de manutenção** : alterações em subclasses não afetam o código da superclasse. 

**207** 

## **Recapitulando Polimorfismo em Java (1/2)** 

- **Dois tipos principais** : 

   - Polimorfismo de **tempo de compilação** ( **sobrecarga** de métodos). 

   - Polimorfismo de **tempo de execução** ( **sobrescrita** de métodos). 

- Uso da anotação `@Override` para indicar sobrescrita. 

- Utilização da palavra-chave `super` para acessar métodos da superclasse. 

- Declaração de variáveis com o tipo da superclasse para armazenar objetos de subclasses. 

- Compreensão da **vinculação dinâmica** ( _dynamic binding_ ). 

- Aplicação de polimorfismo em **arrays** e **parâmetros de métodos** . 

- Importância das **classes abstratas** como base para hierarquias polimórficas. 

**208** 

## **Exercícios propostos** 

Verificar atividade no Moodle 

**209** 

