# Entrega 1 — Termos e comandos Git

Este material apresenta **todos os 12 termos dos slides 10 e 11**, com explicações práticas e exemplos usando **este próprio repositório**. Alguns termos, como baseline e codeline, são conceitos de gestão representados por práticas Git, não comandos únicos.

| Termo | Como aplicar com Git |
|---|---|
| **Baseline** | Marcar uma versão aprovada: `git tag -a v1.0.0 -m "Baseline 1"`. Tags anotadas apontam para commits específicos. |
| **Branching** | Criar uma linha de trabalho: `git switch -c feature/documentacao`. |
| **Codeline** | Consultar a sequência de versões de uma branch: `git log --oneline main`. |
| **Configuration (version) control** | Registrar versões: `git add .` e `git commit -m "Atualiza projeto"`. |
| **Configuration item / SCI** | Identificar e versionar arquivos de código, testes, scripts e documentação; usar `git ls-files` para listar os itens rastreados. |
| **Mainline** | Manter a linha principal na branch `main`, verificando-a com `git branch`. |
| **Merging** | Integrar mudanças: `git switch main` e `git merge feature/documentacao`. |
| **Release** | Identificar versão distribuível com tag, como `git tag -a v1.0.0 -m "Primeira release"`; também é possível publicar em **Releases** na interface GitHub. |
| **Repository** | Repositório centralizado aqui no GitHub; clonar com `git clone https://github.com/LuizHenriqueMR/gerencia-configuracao.git`. |
| **System building** | Executar `mvn -f entrega-2/pom.xml clean package` para construir o JAR. |
| **Version** | Identificar revisões com `git log --oneline`, `git show HEAD` e `git tag`. |
| **Workspace** | Pasta de trabalho local após clonar; conferir modificações com `git status`. |

## Exemplo completo de controle de versões

```bash
git clone https://github.com/LuizHenriqueMR/gerencia-configuracao.git
cd gerencia-configuracao
git switch -c feature/documentacao
# editar algum arquivo
git add .
git commit -m "docs: atualiza documentação"
git switch main
git merge feature/documentacao
git tag -a v1.0.0 -m "Versão aprovada"
git log --oneline --decorate
```

**Observação:** o exemplo acima é didático e não afirma que todas essas operações já foram realizadas. Não execute os comandos de commit, merge ou tag sem alterações e sem verificar o estado atual do repositório.

## Evidências para o professor
Abrir as abas **Code**, **Commits**, **Branches**, **Actions** e **Issues** deste mesmo repositório. As tags/releases só devem ser apresentadas como publicadas quando realmente existirem.
