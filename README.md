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
Bootcamp *-- Conteudo : Composition
Conteudo o-- Dev : Aggregation
Conteudo o-- Dev : Aggregation

```
