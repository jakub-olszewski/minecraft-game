@echo off
title Git update

set project=minecraft-game
set dev_path=%~dp0
set dev_local=%userprofile%\desktop\dev\
set git_app=%dev_local%apps\git\bin\git.exe
set mvn_app=%dev_local%apps\apache-maven-3.5.2\bin\mvn
set JAVA_HOME=%dev_local%java\jdk1.8.0_152
set chrome_app=%dev_local%apps\GoogleChromePortable\GoogleChromePortable.exe
echo Current path: %dev_local%
echo git path: %git_app%
echo mvn path: %mvn_app%

copy /Y %dev_path%* %dev_local%git\github\%project%


timeout /T 3
exit