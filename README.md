# Sistema de Gestão de Produtos

## Descrição
O **Sistema de Gestão de Produtos** é uma aplicação em Java que permite o cadastro e gerenciamento de diferentes tipos de produtos. Utilizando conceitos de abstração, interfaces e classes abstratas, o sistema é projetado para ser extensível e fácil de manter.

## Funcionalidades
- Cadastrar produtos de diferentes categorias:
    - Produtos Eletrônicos
    - Produtos Alimentícios
    - Produtos de Vestuário
- Exibir detalhes dos produtos cadastrados.

## Estrutura do Projeto

### Classes Principais

- **Product**: Classe abstrata que define a estrutura básica de um produto.
- **ProductInterface**: Interface que especifica as operações para cadastro de produtos.
- **ElectronicProduct**: Classe que representa um produto eletrônico.
- **FoodProduct**: Classe que representa um produto alimentício.
- **ClothingProduct**: Classe que representa um produto de vestuário.
- **ProductRegistration**: Classe responsável pelo gerenciamento do cadastro de produtos.
- **Program**: Classe principal que executa a aplicação.

## Como Usar

### Requisitos
- JDK 17 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, etc.)

### Passos para Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ellisroberta/formacao_java2.git
   cd formacao_java2
   ```
2. Abra o projeto na sua IDE.
3. Execute a classe `Program`.

### Exemplo de Uso

Ao executar a aplicação, o sistema irá cadastrar os produtos e exibir os detalhes de cada um, como mostrado abaixo:

Product registered successfully: Electronic Product: Smartphone, Brand: Samsung, Price: 1200.00
Product registered successfully: Food Product: Rice, Expiration Date: 2023-12-31, Price: 20.00
Product registered successfully: Clothing Product: T-Shirt, Size: M, Price: 40.00

Registered Products:
Electronic Product: Smartphone, Brand: Samsung, Price: 1200.00
Food Product: Rice, Expiration Date: 2023-12-31, Price: 20.00
Clothing Product: T-Shirt, Size: M, Price: 40.00