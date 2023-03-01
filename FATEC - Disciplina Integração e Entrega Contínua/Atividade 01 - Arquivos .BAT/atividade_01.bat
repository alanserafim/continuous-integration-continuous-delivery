echo off

echo ==============CI/CD=============
echo ======PROGRAMACAO EM LOTES======
echo ================================

echo ==============================================
echo *        Criando o  diretorio ALP_Labs       *
echo ==============================================
md C:\Users\DTI\Documents\ALP_Labs

echo ==============================================
echo *        Copiando os arquivos                *
echo ==============================================
copy *.exe C:\Users\DTI\Documents\ALP_Labs

cd C:\Users\DTI\Documents\ALP_Labs

echo ==============CI/CD=============
echo ======PROGRAMACAO EM LOTES======
echo ================================
pause

:menu
cls
echo QUAL LAB DESEJA EXECUTAR
echo ESCOLHA UMA OPCAO
echo -------------------------------
Echo 1. Pesquisa Vestibular
Echo 2. Urna Eleitoral
Echo 3. Teste de divisibilidade
Echo 4. Risco de infarto
Echo 5. SAIR
echo -------------------------------
set /p opc= ESCOLHA UMA OPCAO: 
echo -------------------------------

if %opc% equ 1 goto opcao1
if %opc% equ 2 goto opcao2
if %opc% equ 3 goto opcao3
if %opc% equ 4 goto opcao4
if %opc% equ 5 goto opcao5
if %opc% geq 6 goto opcao6

:opcao1
echo ==============================================
echo * Lab: Pesquisa Vestibular *
echo ==============================================
start lab1.exe
pause
goto menu

:opcao2
echo ==============================================
echo * Lab: Urna Eleitoral *
echo ==============================================
start lab2.exe
pause
goto menu

:opcao3
echo ==============================================
echo * Teste de divisibilidade *
echo ==============================================
start lab3.exe
pause
goto menu

:opcao4
echo ==============================================
echo * Risco de infarto *
echo ==============================================
start lab4.exe
pause
goto menu

:opcao5
echo ==============================================
echo * SAIR *
echo ==============================================
pause
exit

:opcao6
echo ==============================================
echo * Opcao Invalida! Escolha outra opcao do menu *
echo ==============================================
pause
goto menu