# Padrões de Projeto de Software - PPS

Este repositório contém exemplos de alguns dos principais padrões de projeto, segundo o que pude entender e exemplificar. Serve de resumo para a 2º Prova de PPS.

###### Obs.: alguns diagramas estão faltando na parte de diagrams, talvez no futuro eu reorganize todo esse repositório.

## Padrões de Projeto Implementados

### 1. Strategy

**Problema:** Quando você tem múltiplas variações de um algoritmo, o código cliente se torna sobrecarregado com diferentes versões de um mesmo procedimento, dificultando a manutenção.

**Solução:** O padrão **Strategy** permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. A estratégia permite que o algoritmo varie independentemente dos clientes que o utilizam.

#### Componentes:

- **Strategy (Estratégia):** Interface comum para todas as variantes do algoritmo.
- **ConcreteStrategy (Estratégia Concreta):** Implementa o algoritmo usando a interface Strategy.
- **Context (Contexto):** Contém uma referência a um objeto Strategy e chama o algoritmo através da interface Strategy.

#### Exemplo:

Neste exemplo, temos diferentes formas de calcular preços, e o cliente pode alternar entre as estratégias conforme necessário.

---

### 2. Iterator

**Problema:** Você quer percorrer uma coleção de objetos sem expor sua implementação interna, mas deseja acessar seus elementos de maneira estruturada.

**Solução:** O padrão **Iterator** permite acessar os elementos de uma coleção de maneira sequencial sem expor sua representação subjacente.

#### Componentes:

- **Iterator (Iterador):** Interface que define os métodos necessários para percorrer uma coleção (e.g., `hasNext()`, `next()`).
- **ConcreteIterator (Iterador Concreto):** Implementa a interface do iterador e armazena o estado de iteração.
- **Collection (Coleção):** Interface que define um método `createIterator()` para obter um iterador.
- **ConcreteCollection (Coleção Concreta):** Implementa o método para retornar um iterador específico.

#### Exemplo:

Um sistema que percorre uma lista de elementos sem expor os detalhes internos da coleção.

---

### 3. Adapter

**Problema:** Quando você quer utilizar uma classe existente, mas sua interface é incompatível com a que o cliente precisa.

**Solução:** O padrão **Adapter** permite que interfaces incompatíveis trabalhem juntas. Funciona como um tradutor entre diferentes classes que não podem se comunicar diretamente.

#### Componentes:

- **Target (Alvo):** Interface esperada pelo cliente.
- **Client (Cliente):** Interage com os objetos usando a interface Target.
- **Adaptee (Adaptado):** Classe que tem uma interface incompatível com a do cliente.
- **Adapter (Adaptador):** Converte a interface do Adaptee para a interface do Target.

#### Exemplo:

Permite integrar sistemas legados com novos sistemas, traduzindo chamadas entre interfaces incompatíveis.

---

### 4. State

**Problema:** Objetos podem mudar seu comportamento dependendo do estado interno em que se encontram, levando a grandes estruturas condicionais (e.g., `if-else` ou `switch`).

**Solução:** O padrão **State** permite que um objeto altere seu comportamento quando seu estado interno muda. Ele parece mudar de classe para o cliente.

#### Componentes:

- **State (Estado):** Interface para encapsular o comportamento associado a um estado específico.
- **ConcreteState (Estado Concreto):** Implementa o comportamento de um estado específico.
- **Context (Contexto):** Mantém uma referência para um objeto State e delega as ações para o estado atual.

#### Exemplo:

Representa um sistema que muda de comportamento com base no estado atual, como uma máquina de venda automática que altera o comportamento dependendo se tem estoque ou não.

---

### 5. Bridge

**Problema:** Quando há uma necessidade de combinar diferentes implementações com várias abstrações em uma hierarquia de classes, o código pode crescer exponencialmente, dificultando a manutenção.

**Solução:** O padrão **Bridge** desacopla uma abstração de sua implementação para que as duas possam variar independentemente.

#### Componentes:

- **Abstraction (Abstração):** Define a interface de controle e mantém uma referência para o Implementador.
- **RefinedAbstraction (Abstração Refinada):** Estende a interface da Abstraction.
- **Implementor (Implementador):** Interface para as implementações concretas.
- **ConcreteImplementor (Implementador Concreto):** Implementa a interface Implementor.

#### Exemplo:

Facilita a extensão tanto de abstrações quanto de implementações de maneira independente, como uma hierarquia de classes para formas (Abstraction) e suas formas de desenhar (Implementor).

---

### 6. Proxy

**Problema:** Às vezes, você não quer ou não pode acessar um objeto diretamente, seja por questões de desempenho, controle de acesso ou para fazer caching.

**Solução:** O padrão **Proxy** fornece um substituto para outro objeto para controlar o acesso a ele. Pode ser usado para fornecer um controle adicional, como inicialização preguiçosa, controle de acesso, entre outros.

#### Componentes:

- **ServiceInterface (Interface do Serviço):** Interface comum para o Serviço Real e o Proxy.
- **Service (Serviço Real):** Implementa a lógica real de negócios.
- **Proxy:** Contém uma referência ao Serviço e adiciona lógica adicional (e.g., controle de acesso, cache, etc.).
- **Client (Cliente):** Interage tanto com o Proxy quanto com o Serviço diretamente, através da mesma interface.

#### Exemplo:

Um proxy pode ser utilizado para controlar o acesso a um objeto caro de ser instanciado ou para adicionar autenticação antes de chamar o serviço real.

---

### 7. Observer
####### Obs.: falta colocar esse padrão, mas esse resumo já serve de algo
**Problema:** Quando um objeto precisa notificar múltiplos outros objetos sobre uma mudança de estado, você pode acabar com um acoplamento muito forte entre eles.

**Solução:** O padrão **Observer** define uma dependência um-para-muitos entre objetos, de maneira que, quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

#### Componentes:

- **Subject (Sujeito):** Mantém uma lista de observadores e envia notificações.
- **Observer (Observador):** Interface que define o método para receber notificações.
- **ConcreteObserver (Observador Concreto):** Implementa a interface Observer e atualiza-se quando o Subject envia notificações.
- **ConcreteSubject (Sujeito Concreto):** Mantém o estado que interessa aos Observadores e notifica-os quando o estado muda.

#### Exemplo:

Um sistema de notificações onde vários objetos precisam ser atualizados sempre que há uma mudança no estado de um objeto principal.

---
