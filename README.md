# Sobre a Aplicação de Plantão Atualizado

A aplicação **Plantão Atualizado** é uma ferramenta projetada para verificar se um usuário estará trabalhando ou de folga em uma data específica. Ela fornece um histórico de dias trabalhados e de folgas com base na data consultada. A aplicação é composta por várias classes e métodos, conforme descrito abaixo:

## Componentes da Aplicação

### Classes

- **DadosEntrada:** Gerencia a entrada de dados fornecidos pelo usuário, como datas e informações sobre o estado de trabalho ou folga.
- **CalculoScala:** Realiza os cálculos necessários para determinar os dias de trabalho e folga com base na data fornecida e nas regras de escala.
- **PlantaoConsulta:** Responsável por consultar e exibir o histórico de dias de trabalho e folga, utilizando os dados processados e calculados.

### Método

- **`public LocalDate dataInicio()`**
  - **Descrição:** Este método realiza uma simples pergunta ao usuário para verificar se ele está trabalhando no dia atual. Se a resposta for afirmativa, o método marca o estado como `true`, indicando que o usuário está trabalhando; caso contrário, marca como `false`. A partir dessa informação, o algoritmo inicia o cálculo e realiza consultas até o dia solicitado, aplicando `true` e `false` conforme o estado do usuário em cada dia.

## Funcionamento

- **Entrada de Dados:** O usuário insere a data para consulta.
- **Processamento:** A aplicação verifica o estado do usuário (trabalhando ou de folga) e realiza cálculos conforme a escala de trabalho.
- **Saída:** O usuário recebe um histórico detalhado dos dias trabalhados e de folgas até a data solicitada.

Esta aplicação é útil para gerenciar e visualizar a escala de trabalho e folgas de forma eficiente e organizada.
