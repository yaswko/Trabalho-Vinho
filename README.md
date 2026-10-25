# Clube de Assinaturas de Vinhos

**Estudo de Caso 13** — Clube de Assinaturas de Vinhos

Este projeto simula o núcleo de um sistema de clube de assinaturas de vinhos, desenvolvido em Kotlin. Ele armazena informações sobre vinhos e assinantes, calcula o subtotal de uma caixa mensal, aplica descontos para assinantes do plano anual, trata brindes opcionais e determina a quantidade de garrafas de acordo com a categoria da assinatura.

## Estrutura do código

Todo o código está em um único arquivo, `principal.kt`:

- **`Vinho`**: guarda os dados de cada vinho (`nome`, `safra`, `pais` e `preco`).
- **`Assinante`**: armazena o nome do assinante (`nome`) e informa se possui plano anual (`planoAnual`).
- **`CaixaMensal`**: reúne a lista de vinhos (`vinhos`) e um brinde opcional (`brindeEspecial`). Calcula o subtotal dos vinhos (`calcularSubtotal`), o preço final com desconto (`calcularPrecoFinal`), retorna o brinde (`obterBrinde`) e determina a quantidade de garrafas (`quantidadeGarrafas`).
- **`main`**: cria três vinhos, um assinante e uma caixa mensal, executa os cálculos e apresenta os resultados no console.

## Regras de negócio

- **Cadastro de vinhos:** cada vinho possui nome, safra, país de origem e preço, representados pelos tipos `String`, `Int`, `String` e `Double`, respectivamente.
- **Desconto anual:** assinantes com plano anual recebem um desconto de 20% sobre o subtotal dos vinhos, pagando 80% do valor original.
- **Brinde opcional:** o campo `brindeEspecial` é do tipo `String?` e pode receber `null`. Quando não há brinde informado, o sistema retorna a mensagem `"Nenhum acessório extra"`.
- **Quantidade de garrafas:** a função `quantidadeGarrafas` utiliza a estrutura `when`: `1` corresponde a 2 garrafas, `2` corresponde a 4 e `3` corresponde a 6. Esses códigos representam as categorias Silver, Gold e Platinum no programa.
- **Cálculo do subtotal:** o programa percorre a lista de vinhos com um laço `for`, somando os preços para obter o subtotal da caixa mensal.

## Decisões de implementação

1. **Desconto de 20%:** o desconto é aplicado multiplicando o subtotal por `0.80`. Caso o assinante não possua plano anual, o preço final permanece igual ao subtotal.
2. **Brinde nulo:** o operador Elvis (`?:`) verifica se `brindeEspecial` possui um valor. Caso seja `null`, retorna `"Nenhum acessório extra"` como alternativa.
3. **Soma dos preços:** foi utilizado um laço `for` para percorrer a lista de vinhos e acumular seus preços em uma variável `subtotal`, inicializada com `0.0`.
4. **Categorias de assinatura:** a estrutura `when` associa os códigos numéricos às quantidades de garrafas. Caso seja informado um código diferente de `1`, `2` ou `3`, a função retorna `0`.
5. **Separação por classes:** as classes `Vinho`, `Assinante` e `CaixaMensal` organizam os dados e as funcionalidades, aplicando conceitos de programação orientada a objetos.

## Como rodar

1. Clone este repositório.
2. Abra o projeto em uma IDE como **IntelliJ IDEA** ou **Visual Studio Code**, com o Kotlin e o JDK configurados.
3. Execute a função `main` do arquivo `principal.kt`.

Saída esperada:

```text
Assinante: Yas
Subtotal dos vinhos: R$ 270.0
Preço final: R$ 216.0
Brinde: Nenhum acessório extra
Silver: 2 garrafas
Gold: 4 garrafas
Platinum: 6 garrafas
```

## Processo de estudo e desenvolvimento

O projeto foi desenvolvido como exercício prático de Kotlin, com foco na aplicação de conceitos de programação orientada a objetos. Durante a implementação, foram utilizadas classes para representar os vinhos, os assinantes e as caixas mensais, além de funções para organizar os cálculos e as regras de negócio.

O desenvolvimento também envolveu o uso de listas, laços de repetição, estruturas condicionais e tratamento de valores nulos. O operador Elvis (`?:`) foi utilizado para fornecer um valor alternativo quando não há brinde especial, enquanto a estrutura `when` permite determinar a quantidade de garrafas de cada categoria.

O código foi organizado em um único arquivo, `principal.kt`, para facilitar a execução e o estudo dos conceitos utilizados.
