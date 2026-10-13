# Gerência de Configuração — Entregas 1 a 4

Trabalho acadêmico organizado de acordo com as quatro atividades propostas.

## Entregas

| Atividade | Prazo | Onde consultar |
|---|---|---|
| **Entrega 1 — Git** | 17/09 | [Conceitos e comandos de controle de versão](entrega-1/README.md) |
| **Entrega 2 — GitHub Actions** | 01/10 | [Sistema de construção Java/Maven](entrega-2/README.md) e [workflow](.github/workflows/build.yml) |
| **Entrega 3 — GitHub Issues** | 08/10 | [Organização das issues e releases](entrega-3/ISSUES_E_RELEASES.md), [issues cadastradas](../../issues) e GitHub Project |
| **Entrega 4 — Seminário** | 08/10 e 15/10 | [Papéis, integração das tarefas e diagrama de atividades](entrega-4/PROCESSO.md) |

## Entrega 1 — Git
O arquivo `entrega-1/README.md` apresenta os termos dos slides 10 e 11 e explica como usar comandos de controle de versão para cada um.

## Entrega 2 — Sistema de construção
O projeto Java em `entrega-2/` contém código-fonte, testes, `pom.xml` e scripts de construção para Windows e Linux. O GitHub Actions compila, executa testes, gera um JAR, publica relatórios e documentação.

**Executar na raiz do repositório (Java e Maven instalados):**
```bash
mvn -f entrega-2/pom.xml clean verify javadoc:javadoc
java -jar entrega-2/target/sistema-construcao-1.0.0.jar
```

[Consultar execução aprovada do GitHub Actions](../../actions/runs/38477334046).

## Entrega 3 — Issues
As cinco issues do trabalho estão cadastradas no GitHub e organizadas em dois grupos de release no Project:
- **Release 1:** issues #1, #2 e #3.
- **Release 2:** issues #4 e #5.

O campo de release do Project serve para organizar o planejamento; não deve ser confundido com uma release publicada na aba Releases do repositório.

## Entrega 4 — Seminário
O processo, os papéis responsáveis por cada tarefa e o diagrama de atividades com raias estão em `entrega-4/PROCESSO.md`. A apresentação em PDF pode ser usada no seminário e enviada separadamente pelo Moodle.

## Arquivos de apoio
A pasta `sistema-web/` contém o exemplo relacionado à issue #1. Ela foi mantida para preservar a evidência da tarefa, embora o sistema de construção automatizado utilize o projeto Java da Entrega 2.
