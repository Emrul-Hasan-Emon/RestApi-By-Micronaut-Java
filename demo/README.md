## Micronaut 4.3.8 Documentation

- [User Guide](https://docs.micronaut.io/4.3.8/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.3.8/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.3.8/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)
## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)


## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)

## Database Integration in Micronaut
### The dependencies we need micronaut-data, micronaut-data-jpa, micronaut-hibernate-jpa, mysql-connector-java, micronaut-jdbc-hikari
- For using database in micronaut we need to add <micronaut.data.version> version <micronaut.data.version> in properties in pom.xml
- Then add path processor in pom.xml under annotationProcessorPath
- Micronaut Data is Database Access ToolKit which helps as to work with database.
- We will work with mysql database.
- docker-compose.yml contains the necessary information to run mysql in docker.
