FROM greyfoxit/alpine-openjdk8:latest

RUN mkdir /app/
WORKDIR /app/

COPY . /app/

RUN javac helper/*.java \
  interfaces/*.java \
  persistencia/*.java \
  regras_de_negocio/*.java \
  service/*.java

EXPOSE 2020

CMD ["java", "service.MeuServidor"]
