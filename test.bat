
@REM Nouveau projet avec Maven

@REM @By Jerome Dh

@REM @See https://github.com/jerome-Dh

cls

@echo off

REM Config
title Test du projet
color 5f

echo.
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo  +	   Bienvenue Jerome Dh              +
echo  +                                          +
echo  +	https://github.com/jerome-Dh        +
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo.
echo.
echo Test du projet
echo.
echo.

:debut



:creation
echo.
echo En cours de test..
echo.

mvn test

echo.


:fin
echo.
echo Terminee
echo.

pause

@echo on