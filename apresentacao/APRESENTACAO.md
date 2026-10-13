# Apresentação — Gerência de Configuração

**Equipe:** Luis Fernando · Luiz Henrique M Rodrigues · Regyane Tavares

## Slide 1 — Capa
Gerência de Configuração: Entregas 1, 2, 3 e 4. Projeto integral no repositório LuizHenriqueMR/gerencia-configuracao.

## Slide 2 — Objetivo
Organizar código, versões, construção automatizada, planejamento de issues e responsabilidades no mesmo repositório.

## Slide 3 — Entrega 1: Git (Luiz Henrique)
Os 12 conceitos dos slides 10 e 11 estão explicados em [entrega-1/README.md](../entrega-1/README.md). Exemplos: branching com `git switch -c`, merging com `git merge`, baseline e release com tags, repository com `git clone`.

## Slide 4 — Entrega 2: Construção (Luiz Henrique)
O Maven fornece compilação, build incremental local, testes JUnit, JAR executável, relatórios Surefire e Javadoc. O GitHub Actions automatiza tudo em push e pull request.

## Slide 5 — Evidências da Entrega 2 (Luiz Henrique)
[Execução bem-sucedida do workflow](../../actions/runs/38477334046). Artefatos: JAR, relatórios de teste e documentação.

## Slide 6 — Entrega 3: Issues (Regyane)
Cinco issues criadas, organizadas em Release 1 (#1, #2, #3) e Release 2 (#4, #5), usando o projeto Feature release.

## Slide 7 — Entrega 4: Papéis (Regyane)
Desenvolvedor: #1, #3 e #4. Gerente de Configuração: #2. Responsável pela Qualidade: #5. Os papéis são diferentes dos nomes de usuário atribuídos às issues.

## Slide 8 — Entrega 4: Processo (Regyane)
Planejamento e controle de versão → sistema web → script de build → automação → validação. Se a validação falhar, retorna ao desenvolvimento. [Diagrama com raias](../entrega-4/PROCESSO.md).

## Slide 9 — Integração
Git registra mudanças; Actions verifica o build; Issues organizam trabalho; releases agrupam entregas; papéis definem responsabilidades.

## Slide 10 — Conclusão
O projeto reúne as quatro entregas no mesmo repositório e oferece evidências de funcionamento. Perguntas.
