
@REM Génération de la documentation

@REM @By Jerome Dh

@REM @See https://github.com/jerome-Dh

cls

@echo off

REM Config
title Generation de la documentation
color 5f

echo.
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo  +	   Bienvenue Jerome Dh              +
echo  +                                          +
echo  +	https://github.com/jerome-Dh        +
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo.
echo.
echo Generation de la documentation
echo.
echo.

:debut



:creation
echo.
echo En cours de generation..
echo.

if exist site rmdir /S /Q site

javadoc -encoding utf8 -d site src\main\java\projets\jeromedh\cm\complexe\*.java

echo.


:fin
echo.
echo Terminee
echo.

pause

@echo on