
- ASA-E az command:
```shell
az spring app deploy -n test1 --source-path . --build-cpu 4 --build-memory 8Gi --builder native --build-env BP_NATIVE_IMAGE=true BP_JVM_VERSION=17 BP_NATIVE_IMAGE_BUILD_ARGUMENTS="--no-fallback --trace-object-instantiation=ch.qos.logback.classic.Logger --initialize-at-run-time=io.netty -H:+AddAllCharsets -H:ReflectionConfigurationFiles=/workspace/META-INF/native-image/reflect-config.json -H:IncludeResources=.*/.*properties$"
```