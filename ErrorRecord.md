1. Error: No bin/java and no environment variable JAVA_HOME

Solution: Add "--no-fallback" in build argument
```shell
--build-env BP_NATIVE_IMAGE_BUILD_ARGUMENTS="--no-fallback"
```

2. ERROR org.springframework.boot.SpringApplication -- Application run failed
   java.lang.IllegalArgumentException: Could not find class [nativeimagetest.example.nativeimagetest.NativeImageTestApplication__ApplicationContextInitializer]

https://github.com/oracle/graal/issues/5683

Solution: add `process-aot` execution in `spring-boot-maven-plugin`
```shell
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <executions>
        <execution>
            <id>process-aot</id>
            <goals>
                <goal>process-aot</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```