java_plugin(
    name = "MyCustomCheck",
    srcs = glob(["src/main/java/com/yuelin/MyCustomCheck.java"]),
    deps = [
        "@maven//:com_google_errorprone_error_prone_core",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_auto_auto_common",
        "@maven//:com_google_errorprone_error_prone_annotation",
        "@maven//:com_google_auto_service_auto_service_annotations",
        "@maven//:com_google_errorprone_error_prone_check_api"
    ],
)

java_library (
    name = "greeter",
    srcs = glob(["src/main/java/com/yuelin/Greetings.java"]),
    visibility = ["//bazelapp:__pkg__"]
)
