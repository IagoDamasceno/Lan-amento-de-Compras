# 💳 Sistema de Gerenciamento de Cartões

Este projeto é uma aplicação Java simples que simula o funcionamento de um cartão de crédito, permitindo ao usuário realizar compras, visualizar o histórico e controlar o saldo disponível.

---

## 📁 Estrutura do Projeto

br/ └── projetos/ ├── principal/ │   └── App.java └── modelos/ ├── Cartao.java └── Compra.java


---

## 🚀 Funcionalidades

### ✅ Cadastro de Cartão
- O usuário informa o limite inicial do cartão.
- O saldo começa igual ao limite.

### ✅ Realização de Compras
- O usuário insere uma descrição e valor da compra.
- Se houver saldo suficiente, a compra é registrada e o saldo é atualizado.
- Caso contrário, uma mensagem de erro é exibida.

### ✅ Exibição de Compras
- Lista todas as compras realizadas.
- Ordena as compras pelo valor (do menor para o maior).
- Exibe o saldo restante.

---

## 📦 Classes

### `App.java`
Classe principal que contém o menu interativo via terminal. Utiliza `Scanner` para entrada de dados e interage com a classe `Cartao`.

### `Cartao.java`
Gerencia o limite, saldo e lista de compras. Contém métodos para:
- `realizarCompra(Compra compra)`
- `exibirCompras()`

### `Compra.java`
Representa uma compra com:
- `descricao` (texto)
- `valor` (double)

---

## 🧠 Lógica de Negócio

- O saldo é decrementado a cada compra bem-sucedida.
- As compras são armazenadas em uma `ArrayList`.
- O método `exibirCompras()` utiliza `Collections.sort()` com `Comparator` para ordenar as compras por valor.

---

## 📌 Exemplo de Uso

```plaintext
Bem-vindo ao sistema de gerenciamento de cartões!
Digite o limite do cartão: 1000

Menu:
1. Realizar compra
2. Exibir compras
3. Sair
Escolha uma opção: 1
Digite a descrição da compra: Livro
Digite o valor da compra: 120
Compra realizada com sucesso

Menu:
1. Realizar compra
2. Exibir compras
3. Sair
Escolha uma opção: 2
Compra [descricao=Livro, valor=120.0]
Saldo atual: 880.0
````

## 🛠️ Melhorias Futuras

Este projeto pode ser expandido com diversas funcionalidades para torná-lo mais robusto e amigável ao usuário. Algumas sugestões incluem:

- **Persistência de dados**  
  Armazenar as informações de compras e saldo em arquivos locais (como `.txt` ou `.json`) ou em um banco de dados (como SQLite ou MySQL), permitindo que os dados sejam mantidos entre sessões.

- **Interface gráfica com JavaFX ou Swing**  
  Substituir o menu de texto por uma interface visual, tornando a interação mais intuitiva e acessível para usuários não técnicos.

- **Validação de entrada**  
  Implementar verificações para evitar valores inválidos, como números negativos ou campos vazios, garantindo maior integridade dos dados.

- **Relatórios de gastos por categoria**  
  Permitir que o usuário classifique as compras (ex: alimentação, lazer, transporte) e gere relatórios ou gráficos que ajudem no controle financeiro.

## 🧑‍💻 Autor

Projeto desenvolvido por **Iago Damasceno** como exercício de lógica e orientação a objetos em **Java**.  
Este projeto tem como objetivo aplicar conceitos fundamentais da programação orientada a objetos, como encapsulamento, composição e manipulação de listas, além de promover boas práticas de estruturação de código em Java.

