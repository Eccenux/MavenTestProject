cd C:\_tmp\mlnet\molnet-extapp; "JAVA_HOME=C:\\Program Files\\Java\\jdk-17" M2_HOME=C:\\Programy\\Programowanie\\Maven\\apache-maven-3.9.6 cmd /c "\"C:\\Programy\\Programowanie\\Maven\\apache-maven-3.9.6\\bin\\mvn.cmd\" -Dtest=pl.mol.molnet.opac.search.SlugTest \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-21\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" -Pfull process-test-classes surefire:test"
Scanning for projects...

------------------------< pl.mol:molnet-extapp >------------------------
Building mol.net extapp 2.0-SNAPSHOT
  from pom.xml
--------------------------------[ war ]---------------------------------

--- buildnumber:3.2.0:create (default) @ molnet-extapp ---
Get info from versioned directory: C:\_tmpC\mlnet-dev\molnet-extapp
Storing buildNumber: 22503 at timestamp: 1725103788605
Get info from versioned directory: C:\_tmpC\mlnet-dev\molnet-extapp
Storing scmBranch: branches/dev

--- dependency:3.6.1:unpack (first-execution) @ molnet-extapp ---
Configured Artifact: org.springframework.security:spring-security-openid:5.8.12:jar
spring-security-openid-5.8.12.jar already unpacked.

--- resources:3.3.1:resources (default-resources) @ molnet-extapp ---
Copying 5 resources from src\main\resources to target\classes
Copying 1 resource from src\main\resources\properties to target\classes\properties
The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html

--- compiler:3.13.0:compile (default-compile) @ molnet-extapp ---
Nothing to compile - all classes are up to date.

--- resources:3.3.1:testResources (default-testResources) @ molnet-extapp ---
Copying 57 resources from src\main\webapp to target\test-classes
Copying 11 resources from src\test\resources to target\test-classes
Copying 1 resource from src\test\resources to target\test-classes

--- compiler:3.13.0:testCompile (default-testCompile) @ molnet-extapp ---
Nothing to compile - all classes are up to date.

--- surefire:3.2.5:test (default-cli) @ molnet-extapp ---
Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running pl.mol.molnet.opac.search.SlugTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.063 s -- in pl.mol.molnet.opac.search.SlugTest

Results:

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  4.224 s
Finished at: 2024-08-31T13:29:51+02:00
------------------------------------------------------------------------
