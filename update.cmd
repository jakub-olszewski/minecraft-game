@echo off
title Git update

set project=minecraft-game
set dev_local=%userprofile%\desktop\dev\
set git_app=%dev_local%apps\git\bin\git.exe
set mvn_app=%dev_local%apps\apache-maven-3.5.2\bin\mvn
set JAVA_HOME=%dev_local%java\jdk1.8.0_152
set chrome_app=%dev_local%apps\GoogleChromePortable\GoogleChromePortable.exe
echo Current path: %dev_local%
echo git path: %git_app%
echo mvn path: %mvn_app%

mkdir %dev_local%tmp
cd /d %dev_local%tmp
rm /Y *
rmdir /Y *
copy /Y 
set user_project=%dev_local%git\github\%project%
set git_project=%dev_local%tmp\%project%

copy /Y %user_project%\src\main\java\eu\b24u\javafx\minecraft\plansza\* %git_project%\src\main\java\eu\b24u\javafx\minecraft\plansza

cd /d %dev_local%git\github\%project%

%git_app% reset --hard HEAD
%git_app% fetch --all
%git_app% reset --hard origin/master

copy /Y %git_project%\src\main\java\eu\b24u\javafx\minecraft\plansza\* %user_project%\src\main\java\eu\b24u\javafx\minecraft\plansza

timeout /T 3
exit