java_plugin(
    name = "MyCustomCheckPlugin",
    srcs = ["MyCustomCheck.java"],
    deps = [
        "@error_prone//jar",
        "@guava//jar",
        "//third_party/java/auto_service",
    ],
)

java_library (
    name = "greeter",
    srcs = glob(["src/main/java/com/baeldung/*.java"]),
    visibility = ["//bazelapp:__pkg__"]
)