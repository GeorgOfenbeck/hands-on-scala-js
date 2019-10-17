
val library = crossProject.settings(
  libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.1",
  testFrameworks += new TestFramework("utest.runner.Framework")
).jsSettings(
  // JS-specific settings here
).jvmSettings(
  // JVM-specific settings here
)

lazy val js = library.js

lazy val jvm = library.jvm
