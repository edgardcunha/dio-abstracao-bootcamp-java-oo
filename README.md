# dio-modelagem-uml
Repositório com o código do desafio "Abstraindo um Bootcamp Usando Orientação a Objetos em Java".

### Diagrama UML
```mermaid
classDiagram
class Conteudo
<<Abstract>> Conteudo
Conteudo : #double XP_PADRAO$
Conteudo : -String titulo
Conteudo : -String descricao
Conteudo : +calcularXp() double*

class Curso
Curso : -int cargaHoraria
Curso : +calcularXp() double

class Mentoria
Mentoria : -LocalDate data
Mentoria : +calcularXp() double

class Bootcamp
Bootcamp : -int NUMBER_OF_DAYS$
Bootcamp : -String nome
Bootcamp : -String descricao
Bootcamp : -LocalDate dataInicial
Bootcamp : -LocalDate dataFinal
Bootcamp : -Set~Dev~ devsInscritos
Bootcamp : -Set~Conteudo~ conteudos
Bootcamp : +addConteudo() Bootcamp
Bootcamp : +addConteudos() Bootcamp

class Dev
Dev : -String nome
Dev : -Set~Conteudo~ conteudosInscritos
Dev : -Set~Conteudo~ conteudosConcluidos
Dev : +inscreverBootcamp(Bootcamp bootcamp) void
Dev : +progredir() void
Dev : +calcularTotalXp() double

Conteudo <|-- Curso : Inheritance
Conteudo <|-- Mentoria : Inheritance
Bootcamp "1..*" *-- "1" Dev : Composition
Bootcamp "1..*" *-- "1" Conteudo : Composition
Conteudo "0..*" o-- "1" Dev : Aggregation
Conteudo "0..*" o-- "1" Dev : Aggregation

```
