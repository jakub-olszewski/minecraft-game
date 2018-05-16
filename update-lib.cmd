@echo off
title Run Install

set project=minecraft-game
set dev_path=%~dp0
set desktop_path=%userprofile%\desktop\
set dev_local=%userprofile%\desktop\dev\
set git_app=%dev_local%apps\git\bin\git.exe
set mvn_app=%dev_local%apps\apache-maven-3.5.2\bin\mvn
set JAVA_HOME=%dev_local%java\jdk1.8.0_152
set chrome_app=%dev_local%apps\GoogleChromePortable\GoogleChromePortable.exe
set zip_app=%dev_path%apps\7-ZipPortable\App\7-Zip64\7z.exe


echo Current path: %dev_path%
echo git path: %git_app%
echo mvn path: %mvn_app%
echo dev_local path: %dev_local%
echo desktop_path path: %desktop_path%

title Download from github ...
mkdir %dev_local%tmp
cd /d %dev_local%tmp
rmdir /Q /S %project%
%git_app% clone https://github.com/jakub-olszewski/%project%.git
REM cd %project%
REM cd /d %dev_local%git\github\%project%
set user_project=%dev_local%git\github\%project%
set git_project=%dev_local%tmp\%project%
copy /Y %git_project%\src\main\java\eu\b24u\javafx\minecraft\cube\* %user_project%\src\main\java\eu\b24u\javafx\minecraft\cube
copy /Y %git_project%\src\main\java\eu\b24u\javafx\minecraft\util\* %user_project%\src\main\java\eu\b24u\javafx\minecraft\util

timeout /T 3
exit
