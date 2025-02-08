# Service Layer, Component Registration

A arquitetura básica do programa segue uma estrutura que divide a aplicação em 4 partes

- Resource Layer (rest controllers)
- Service Layer
- Data Access Layer (data repositories)
- Entities


### Resource Layer
Meio entre as interações do usuário e as regras de negócio.

### Service Layer
Regras de negócio pertencem a essa camada. É responsável por:
- Implementar a lógica de negócio da aplicação
- Orquestrar chamadas entre diferentes componentes
- Garantir a integridade dos dados e regras
- Fazer a intermediação entre Resource Layer e Data Access Layer

### Data Access Layer
Camada responsável pelo acesso e persistência dos dados. Suas principais funções são
- Realizar operações CRUD no bando de dados
- Implementar queries específicas quando necessário
- Abstrair a complexidade doa cesso a dados das camadas superiores
- Utilizar repositories do Spring Data JPA para manipulação dos dados

### Entities
Representam as entidades do domínio da aplicação:
- São classes POJO (Plain Old Java Objects) que mapeiam tabelas do banco de dados
- Utilizam anotações JPA para definir o mapeamento objeto-relacional
- Encapsulam os dados e comportamentos básicos das entidades de negócio
- Servem como moledo de dados para toda aplicação

### Benefícios desta arquitetura
- **Separação de Responsabilidades**: Cada camada tem um papel bem definido
- **Manutenibilidade**: Mudanças em uma camada tem impacto mínimo nas outras
- **Testabilidade**: Facilita a escrita de teste unitários e de integração
- **Escalabilidade**: Permite crescimento e modificações de forma organizada
- **Reutilizacão**: Componentes podem ser reutilizados em diferentes contextos