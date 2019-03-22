# Java EE 8  Maven archetype with JSF and JAX-RS samples

This archetype is made for bootstrapping Java EE 8 applications primarily for Wildfly application server. 
It has a sample JSF Managed Bean and a JAX-RS class with an injected Stateless Session Bean, a demo JUnit 5 test case and deployment related configuration files.

## Install & Usage

 - Clone the git repo
 - `mvn install`
 - `mvn archetype:generate -DarchetypeGroupId=com.martinfejes.archetypes -DarchetypeArtifactId=javaee8-jsf -DarchetypeVersion=1.0.0 -DgroupId=<YOUR-GROUP-ID-HERE> -DartifactId=<YOUR-ARTIFACT-ID-HERE> -Dversion=<YOUR-VERSION-HERE> -DinteractiveMode=false`

After this:
  - In the created project's directory `mvn install`
  - Deploy the `target/{your-project}.war` file

## Included libraries, dependencies
 - PrimeFaces 6.2
 - OmniFaces 3.2
 - JUnit 5
 - Mockito 2.22.1