cd C:\_tmp\MavenTestProject; "JAVA_HOME=C:\\Program Files\\Java\\jdk-17" M2_HOME=C:\\Programy\\Programowanie\\Maven\\apache-maven-3.9.6 cmd /c "\"C:\\Programy\\Programowanie\\Maven\\apache-maven-3.9.6\\bin\\mvn.cmd\" -Dtest=pl.enux.maventestproject.JupiterNbTest \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-21\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" process-test-classes surefire:test"
Scanning for projects...

----------------------< pl.enux:MavenTestProject >----------------------
Building MavenTestProject-1.0-SNAPSHOT 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ war ]---------------------------------

--- dependency:3.7.1:copy (default) @ MavenTestProject ---

--- resources:3.3.1:resources (default-resources) @ MavenTestProject ---
Copying 1 resource from src\main\resources to target\classes

--- compiler:3.13.0:compile (default-compile) @ MavenTestProject ---
 Parameter 'compilerArguments' is deprecated: use compilerArgs instead.
Nothing to compile - all classes are up to date.

--- resources:3.3.1:testResources (default-testResources) @ MavenTestProject ---
skip non existing resourceDirectory D:\_Zadania\Projekty\MOL.NET\MavenTestProject\src\test\resources

--- compiler:3.13.0:testCompile (default-testCompile) @ MavenTestProject ---
 Parameter 'compilerArguments' is deprecated: use compilerArgs instead.
Recompiling the module because of changed source code.
Compiling 1 source file with javac [debug target 17] to target\test-classes

--- surefire:3.2.2:test (default-cli) @ MavenTestProject ---
Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running pl.enux.maventestproject.JupiterNbTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.052 s -- in pl.enux.maventestproject.JupiterNbTest

Results:

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  2.508 s
Finished at: 2024-08-31T13:25:38+02:00
------------------------------------------------------------------------
