# Basic Spring Boot Application

## Some Important Maven Commands

- `mvn clean` --for cleaning all files in target folder of project
- `mvn package` --for building jar files
- `mvn clean package/mvn clean install` --for cleaning and building jars at a time
- `mvn clean package -DskipTests` --for skipping test cases for the project/spring-boot application
- `mvn spring-boot:run` --for running spring-boot appliaction through maven plugin provided by spring.
- `java -jar target/{project-name}-0.0.1-SNAPSHOT.jar` --for running jar of spring-boot project so that it can start and launch spring-boot application
- `mvn spring-boot:run -Dspring-boot.run.arguments="--spring-boot.main.banner-mode=off, --server.port=8011"` --this is the optional argument pass using commandline
- `mvn spring-boot:run -Dspring-boot.run.arguments=" --server.port=8011"`

                      {optional argument1} {optional-arg2}  {non-optional argument}

- `mvn spring-boot:run --student.name=Revanth --student.age=23  male`

### Commandline runner cannot able to differentiate optional and non-optional for this we need to write code manually for differentiate,arguments are directly pass to main method

### Application runner can able to differentiate whether it is optional or non optional

### because it is advanced version of commandline runner and it contain some inbuilt methods to differentiate

### by using this runner we can access these arguments seperately
