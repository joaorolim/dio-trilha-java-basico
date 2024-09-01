# Javadoc

Javadoc é um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

###### Fonte: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/documentacao

### Criando nossa documentação no formato html para disponibilizar via web.

No terminal ("/dio-trilha-java-basico/java-terminal") execute o comando abaixo

```shell
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

```
