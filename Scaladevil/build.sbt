
name := "Scaladevil"

version := "0.1"

scalaVersion := "2.13.5"

maintainer := "Sachin Narang <sachin.narang@knoldus.com>"

containerBuildImage := Some("springci/graalvm-ce:master-java11")

lazy val scalaTest="org.scalatest" %% "scalatest" % "3.2.5" % "test"

//enablePlugins(DebianPlugin)


lazy val root = project.in(file(".")).settings(
  libraryDependencies += scalaTest,
  maintainer := "Sachin Narang <sachin.narang@knoldus.com>"
).aggregate(flags,cliParser)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)


lazy val cliParser = project.in(file("cliParser"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Sachin Narang <sachin.narang@knoldus.com>"
  ).dependsOn(flags)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)

lazy val flags = project.in(file("flags"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Sachin Narang <sachin.narang@knoldus.com>"
  )
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)
