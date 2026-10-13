# Gerência de Configuração — Entregas 1 a 4

**Integrantes:** Luis Fernando, Luiz Henrique M Rodrigues e Regyane Tavares.

Projeto acadêmico centralizado neste repositório. As quatro entregas estão documentadas aqui, sem necessidade de consultar outro repositório.

## Navegação

| Entrega | Evidências neste repositório |
|---|---|
| [1 — Git](entrega-1/README.md) | 12 conceitos, exemplos e comandos Git |
| [2 — GitHub Actions](entrega-2/README.md) | Projeto Java Maven, testes, JAR, relatórios e Javadoc |
| [3 — Issues](entrega-3/ISSUES_E_RELEASES.md) | [Issues #1 a #5](../../issues) e duas releases no GitHub Project |
| [4 — Processo](entrega-4/PROCESSO.md) | Papéis e diagrama de atividades com raias |

## Sistema web de exemplo
O diretório [sistema-web](sistema-web) contém HTML e CSS, associados à issue #1.

## Entrega 2 — Execução
O workflow [Sistema de Construção](.github/workflows/build.yml) é acionado por push ou pull request na main. Ele utiliza Maven para compilar apenas o que precisa em builds incrementais locais, executar testes, gerar JAR executável, relatórios Surefire e documentação Javadoc. No CI, a opção `clean` garante uma construção reproduzível a partir de zero.

Para executar localmente, com Java e Maven instalados:

```bash
mvn -f entrega-2/pom.xml clean verify javadoc:javadoc
java -jar entrega-2/target/sistema-construcao-1.0.0.jar
```

**Evidência de execução bem-sucedida:** [GitHub Actions — execução #1](../../actions/runs/38477334046).

## Organização do trabalho
**Release 1:** #1 estrutura do sistema, #2 controle de versão, #3 script de construção.
**Release 2:** #4 GitHub Actions, #5 documentação e validação.

Os responsáveis estão registrados no campo **Papel responsável** do GitHub Project. O processo completo e o diagrama estão na [Entrega 4](entrega-4/PROCESSO.md).

## Apresentação
- **Luis Fernando:** introdução breve e demonstração deste repositório no GitHub.
- **Luiz Henrique:** Entregas 1 e 2 usando o PDF.
- **Regyane Tavares:** Entregas 3 e 4 usando o PDF.

O [roteiro](docs/ROTEIRO.md) detalha a divisão. 
