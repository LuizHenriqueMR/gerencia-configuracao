# Entrega 2 — Sistema de Construção com GitHub Actions

Este projeto Java 8 com Maven atende às **sete funcionalidades do slide 36**:

| Requisito | Implementação |
|---|---|
| Geração de script de construção | `pom.xml`, `build.sh` e `build.bat` |
| Integração com SCV | Workflow em `.github/workflows/build.yml`, acionado por push/PR |
| Recompilação mínima | Maven compiler verifica mudanças em builds locais sem `clean`; o CI executa `clean` para reproduzibilidade |
| Criação de sistema executável | `maven-jar-plugin` produz `target/sistema-construcao-1.0.0.jar` com Main-Class |
| Automação de testes | JUnit 5 e Maven Surefire |
| Relatórios | `target/surefire-reports` publicado como artefato |
| Geração de documentação | Maven Javadoc, publicado como artefato |

## Execução local

```bash
mvn -f entrega-2/pom.xml clean verify javadoc:javadoc
java -jar entrega-2/target/sistema-construcao-1.0.0.jar
```

Para builds incrementais locais, omita `clean`: `mvn -f entrega-2/pom.xml verify`.

## Evidência no próprio GitHub
[Primeira execução do GitHub Actions: sucesso](../../actions/runs/38477334046). Abra a execução para consultar etapas e artefatos. 
