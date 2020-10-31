load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_jar")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")


RULES_JVM_EXTERNAL_TAG = "2.0.1"
RULES_JVM_EXTERNAL_SHA = "55e8d3951647ae3dffde22b4f7f8dee11b3f70f3f89424713debd7076197eaca"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.apache.commons:commons-lang3:3.9"
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ]
)

http_jar (
    name = "apache-commons-lang",
    url = "https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar"
)

maven_jar(
    name = "error_prone",
    artifact = "com.google.errorprone:error_prone_ant:2.4.1-SNAPSHOT",
    repository = "https://oss.sonatype.org/content/repositories/snapshots",
)

maven_jar(
    name = "auto_service",
    artifact = "com.google.auto.service:auto-service:1.0-rc2",
)

maven_jar(
    name = "auto_common",
    artifact = "com.google.auto:auto-common:0.9",
)

maven_jar(
    name = "guava",
    artifact = "com.google.guava:guava:19.0",
)
