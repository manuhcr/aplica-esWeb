# 🖼️ Projeto — Sistema de Galeria de Imagens

## 📌 Sobre o Projeto

Este projeto consiste no desenvolvimento de uma **aplicação web para gerenciamento e visualização de imagens**. O sistema permitirá que visitantes criem suas próprias contas e, após a autenticação, possam publicar, pesquisar e visualizar imagens.

A aplicação terá um sistema de autenticação utilizando **e-mail, senha e token JWT**, garantindo que determinadas funcionalidades estejam disponíveis apenas para usuários autenticados.

Além disso, o sistema contará com uma galeria de imagens, permitindo realizar pesquisas por diferentes critérios e visualizar informações sobre os arquivos publicados.

## 🎯 Objetivo

O principal objetivo do projeto é desenvolver uma aplicação web que permita o **cadastro de usuários e o gerenciamento de imagens**, proporcionando uma experiência simples e organizada para publicação, pesquisa e visualização dos arquivos.

O sistema deverá seguir os requisitos funcionais definidos abaixo.

---

## 📋 Requisitos Funcionais

| ID       | Descrição                                                                                                         |
| -------- | ----------------------------------------------------------------------------------------------------------------- |
| **RF01** | O sistema deve permitir que um visitante crie uma conta informando nome, e-mail e senha.                          |
| **RF02** | O sistema deve impedir o cadastro de um e-mail já existente.                                                      |
| **RF03** | O sistema deve permitir que um usuário cadastrado se autentique com e-mail e senha.                               |
| **RF04** | O sistema deve emitir um token de acesso (JWT) após autenticação bem-sucedida.                                    |
| **RF05** | O sistema deve permitir que o usuário autenticado encerre sua sessão.                                             |
| **RF06** | O sistema deve permitir que o usuário autenticado publique uma nova imagem, informando nome, tags e arquivo.      |
| **RF07** | O sistema deve validar o formato (PNG, JPEG, GIF) e o tamanho do arquivo antes do envio.                          |
| **RF08** | O sistema deve permitir que o usuário pesquise imagens por nome, por tag e/ou por extensão.                       |
| **RF09** | O sistema deve exibir as imagens encontradas em formato de galeria, com nome, extensão, tamanho e data de upload. |
| **RF10** | O sistema deve permitir a visualização da imagem em tamanho real a partir da miniatura.                           |
| **RF11** | O sistema deve notificar o usuário sobre sucesso ou falha de cada operação realizada.                             |

---

## 🔎 Resumo dos Requisitos

De forma geral, o sistema será dividido em três funcionalidades principais:

### 👤 1. Cadastro e Autenticação

O visitante poderá criar uma conta utilizando **nome, e-mail e senha**. O sistema deverá verificar se o e-mail já está cadastrado antes de concluir o cadastro.

Após criar a conta, o usuário poderá realizar o login utilizando suas credenciais. Em caso de autenticação bem-sucedida, será gerado um **token JWT**, utilizado para identificar e autorizar o usuário durante sua sessão.

### 🖼️ 2. Publicação e Gerenciamento de Imagens

Usuários autenticados poderão publicar imagens informando:

* Nome;
* Tags;
* Arquivo da imagem.

Antes de realizar o upload, o sistema deverá verificar se o arquivo possui um formato permitido (**PNG, JPEG ou GIF**) e se atende às regras de tamanho estabelecidas para o projeto.

### 🔍 3. Pesquisa e Visualização

O sistema permitirá pesquisar imagens utilizando diferentes critérios, como:

* Nome;
* Tag;
* Extensão.

Os resultados serão apresentados em formato de **galeria**, mostrando informações como nome, extensão, tamanho e data de upload.

Também será possível clicar na miniatura de uma imagem para visualizá-la em **tamanho real**.

---

## 🔐 Autenticação

As funcionalidades que exigem identificação do usuário serão protegidas por autenticação.

O fluxo básico será:

```text
Cadastro
   ↓
Login
   ↓
Validação do e-mail e senha
   ↓
Geração do JWT
   ↓
Usuário autenticado
   ↓
Publicação / Pesquisa / Visualização
```

O **JWT (JSON Web Token)** será utilizado para controlar o acesso às funcionalidades que necessitam de autenticação.

---

## 📊 Resumo Geral

| Funcionalidade               | Requisitos |
| ---------------------------- | ---------- |
| Cadastro de usuário          | RF01, RF02 |
| Login e autenticação         | RF03, RF04 |
| Encerramento da sessão       | RF05       |
| Publicação de imagens        | RF06, RF07 |
| Pesquisa de imagens          | RF08       |
| Galeria de resultados        | RF09       |
| Visualização em tamanho real | RF10       |
| Notificações do sistema      | RF11       |

## 🚀 Conclusão

O projeto tem como foco a criação de uma **galeria de imagens com autenticação de usuários**, permitindo que pessoas cadastradas publiquem e pesquisem imagens de maneira organizada.

Os requisitos funcionais definidos servem como base para o desenvolvimento do sistema, orientando a implementação das principais funcionalidades e garantindo que o projeto atenda às necessidades propostas.
