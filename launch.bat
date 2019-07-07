
@REM Nouveau projet avec Maven

@REM @By Jerome Dh

@REM @See https://github.com/jerome-Dh

cls

@echo off

REM Config
title Creer un nouveau projet
color 5f

echo.
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo  +	   Bienvenue Jerome Dh              +
echo  +                                          +
echo  +	https://github.com/jerome-Dh        +
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo.

set nomProjet=complexe

echo.
echo Execution du projet %nomProjet%
echo.
echo.

:debut



:creation
echo.
echo En cours d'execution..
echo.

java -cp .;features/sqlite-jdbc-3.27.2.1.jar;target/%nomProjet%-1.0-SNAPSHOT.jar projets.jeromedh.cm.%nomProjet%.App

echo.


:fin
echo.
echo Terminee
echo.

pause

@echo on


@echo on