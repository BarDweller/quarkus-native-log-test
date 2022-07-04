# Quarkus Native FINEST log test project.

A simple small test case to allow testing if quarkus native can successfully log FINEST level trace.

Build with `mvn package -Pnative` 

With quarkus 2.10.1.Final the project won't even create a native executable.
With quarkus 2.6.3.Final it will, but the resulting executable fails to launch.

If you alter `quarkus.log.min-level` to `TRACE` then it will build, but you will not have access to `FINEST` level trace.

When not building native, `quarkus.log.min-level` can be set to `FINEST` or `ALL` and `FINEST` trace works as expected.

