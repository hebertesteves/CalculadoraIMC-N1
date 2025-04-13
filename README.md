# 📱 Calculadora de IMC

Projeto desenvolvido para a disciplina de **Programação Mobile** do curso de **Análise e Desenvolvimento de Sistemas** - 3º Semestre.

## 👤 Informações do Aluno

- **Nome:** Hebert dos Reis Esteves  
- **RA:** 24026079  
- **Professor:** Vinicius Heltai  
- **Semestre:** 3º  
- **Disciplina:** Programação Mobile  
- **Instituição:** FECAP

## 🧾 Descrição Geral

Este aplicativo Android, desenvolvido em **Java**, tem como objetivo calcular o **Índice de Massa Corporal (IMC)** do usuário a partir dos dados inseridos (peso e altura) e fornecer um **feedback positivo** e personalizado de acordo com a classificação obtida. O app conta com múltiplas telas, interface intuitiva e design baseado em uma paleta de cores definida no enunciado do projeto.

## 🚀 Funcionalidades

- Tela inicial com logo da FECAP e botão de acesso à calculadora;
- Tela de cálculo com campos para entrada de peso e altura, botões de calcular, limpar e voltar;
- Telas de feedback distintas para cada faixa de IMC, com:
  - Exibição do peso, altura, IMC e classificação;
  - Imagem representativa da classificação;
  - Mensagem positiva e motivacional;
  - Botão para voltar à tela inicial;
- Troca de informações entre telas via **Intent** e **Bundle**;
- Utilização de componentes visuais como `PlainText`, `TextView`, `Button` e `ImageView`;
- Design consistente com paleta de cores:
  - Verde Escuro: `#006341`
  - Verde Claro: `#00A859`
  - Cinza Escuro: `#4D4D4D`
  - Cinza Claro: `#B3B3B3`
  - Branco: `#FFFFFF`

## 💡 Processo de Desenvolvimento

Durante o desenvolvimento do projeto, enfrentei alguns desafios relacionados à navegação entre múltiplas **Activities** e à troca de dados entre elas, o que me levou a aprofundar o entendimento de **Intents** e **Bundles**. Também dediquei atenção especial à organização do layout via arquivos XML, separando todos os valores fixos no `appValues.xml` e mantendo uma estrutura limpa e reutilizável.

A personalização das mensagens motivacionais e o uso de imagens específicas para cada categoria de IMC foram pensadas para promover uma experiência positiva ao usuário, independentemente da sua classificação.

## 📦 Como Executar o App

Você pode utilizar **qualquer uma das opções abaixo** para abrir e testar o projeto:

### ✅ Opção 1: Usando o repositório GitHub

1. Clone este repositório:  
   `git clone https://github.com/hebertesteves/CalculadoraIMC-N1.git`

2. Abra o projeto no Android Studio;

3. Conecte um dispositivo ou inicie um emulador;

4. Compile e execute o projeto.

### ✅ Opção 2: Usando o projeto compactado

1. Baixe e extraia o arquivo `.zip` disponível no repositório:  
   [`250331-ProjetoN1.zip`](https://github.com/hebertesteves/CalculadoraIMC-N1/blob/main/250331-ProjetoN1.zip)

2. Abra a pasta extraída no Android Studio;

3. Execute o projeto normalmente.

---

📲 **Instalação direta do app:**  
Tanto na pasta do projeto quanto no `.zip` extraído, você encontrará o arquivo **`app-calculadora-imc.apk`**, que pode ser instalado diretamente em um dispositivo Android.

