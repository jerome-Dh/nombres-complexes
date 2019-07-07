
@REM Compiler le projet

@REM @By Jerome Dh

@REM @See https://github.com/jerome-Dh

cls

@echo off

REM Config
title Compilation du projet
color 5f

echo.
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo  +	   Bienvenue Jerome Dh              +
echo  +                                          +
echo  +	https://github.com/jerome-Dh        +
echo. ++++++++++++++++++++++++++++++++++++++++++++
echo.
echo.
echo Compilation du projet
echo.
echo.

:debut



:creation
echo.
echo En cours de compilation..
echo.

mvn package

echo.


:fin
echo.
echo Terminee
echo.

pause

@echo on