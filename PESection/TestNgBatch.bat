cd C:/Users/vijay.m/workspace/PESection
set ProjectPath=C:/Users/vijay.m/workspace/PESection
echo %ProjectPath%
set classpath=%ProjectPath%/bin;%ProjectPath%/Lib/*;C:/Users/vijay.m/workspace/PESection/appConfigPE
echo %classpath%
java org.testng.TestNG %ProjectPath%/testng.xml
pause