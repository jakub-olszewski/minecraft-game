@echo off
title Run

set dev_local=%userprofile%\desktop\dev\
set PATH=%PATH%;%dev_local%apps\apache-maven-3.5.2\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_151

cd /d %~dp0
mvn clean install package exec:java -Dexec.mainClass="eu.b24u.Main"

timeout /T 3
exit