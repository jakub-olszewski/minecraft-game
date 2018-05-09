@echo off
title Run

set dev_local=%userprofile%\desktop\dev\
echo Current path: %dev_local%
set desktop_path=%userprofile%\desktop\
set dev_local=%userprofile%\desktop\dev\

set PATH=%PATH%;%dev_local%apps\apache-maven-3.5.2\bin
set PATH=%PATH%;%dev_local%apps\git\bin
set PATH=%PATH%;%dev_local%java\jdk1.8.0_152

set JAVA_HOME=%dev_local%java\jdk1.8.0_152

cd /d %~dp0
REM start "" mvn clean assembly:assembly -DdescriptorId=jar-with-dependencies -source 8
REM call mvn clean package install
call mvn exec:java -Dexec.mainClass="eu.b24u.Main"

timeout /t 3
REM echo Kopiowanie na pulpit...
REM copy /y target/Aplikacja.jar %userprofile%\desktop\
REM taskkill /F /IM cmd.exe
exit