
@REM @By Jerome Dh

@echo off

cls

color 5f

title Installation de Sqlite JDBC

mvn install:install-file -Dfile=sqlite-jdbc-3.27.2.1.jar -DgroupId=org.xerial -DartifactId=sqlite-jdbc -Dversion=3.27.2.1 -Dpackaging=jar

@echo on