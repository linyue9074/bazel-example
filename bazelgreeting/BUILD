java_library(
    name = "auto_service",
    exported_plugins = [":auto_service_plugin"],
    visibility = ["//visibility:public"],
    exports = ["@maven//:com_google_auto_service_auto_service"],
    runtime_deps = ["@maven//:com_google_guava_guava"],
)

java_plugin(
    name = "auto_service_plugin",
    processor_class = "com.google.auto.service.processor.AutoServiceProcessor",
    deps = [
        "@maven//:com_google_auto_auto_common",
        "@maven//:com_google_auto_service_auto_service",
        "@maven//:com_google_guava_guava",
    ],
)

java_plugin(
    name = "MyCustomCheck",
    srcs = glob(["src/main/java/com/yuelin/MyCustomCheck.java"]),
    visibility = ["//visibility:public"],
    deps = [
        ":auto_service",
        #        "@maven//:com_google_auto_auto_common",
        "@maven//:com_google_auto_service_auto_service_annotations",
        "@maven//:com_google_errorprone_error_prone_annotation",
        "@maven//:com_google_errorprone_error_prone_check_api",
        "@maven//:com_google_errorprone_error_prone_core",
        "@maven//:com_google_guava_guava",
    ],
)

java_plugin(
    name = "AnnotationCheck",
    srcs = glob(["src/main/java/com/yuelin/AnnotationCheck.java"]),
    visibility = ["//visibility:public"],
    deps = [
        ":auto_service",
        #        "@maven//:com_google_auto_auto_common",
        "@maven//:com_google_auto_service_auto_service_annotations",
        "@maven//:com_google_errorprone_error_prone_annotation",
        "@maven//:com_google_errorprone_error_prone_check_api",
        "@maven//:com_google_errorprone_error_prone_core",
        "@maven//:com_google_guava_guava",
    ],
)

java_library(
    name = "greeter",
    srcs = glob(["src/main/java/com/yuelin/Greetings.java"]),
    #    plugins = [":MyCustomCheck"],
    plugins = [":AnnotationCheck"],
    visibility = ["//bazelapp:__pkg__"],
)
