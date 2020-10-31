java_plugin(
    name = "MyCustomCheck",
    srcs = glob(["src/main/java/com/yuelin/MyCustomCheck.java"]),
    deps = [
        "@maven//:com_google_errorprone_error_prone_core",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_auto_auto_common"
    ],
)

java_library (
    name = "greeter",
    srcs = glob(["src/main/java/com/yuelin/*.java"]),
    visibility = ["//bazelapp:__pkg__"]
)
