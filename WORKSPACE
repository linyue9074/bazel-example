load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_jar")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "3.3"
RULES_JVM_EXTERNAL_SHA = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.apache.commons:commons-lang3:3.11",
        "com.google.errorprone:error_prone_annotations:2.3.3",
        "com.google.errorprone:error_prone_core:2.3.3",
        "com.google.auto.service:auto-service:1.0-rc6",
        "com.google.auto:auto-common:0.11",
        "com.google.guava:guava:19.0"
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://maven.google.com",
    ]
)

http_jar (
    name = "apache-commons-lang",
    url = "https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar"
)


