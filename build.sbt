name := "ascii-graphs"

organization := "org.jetbrains"

version := "0.0.6"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.7", "2.11.8", "2.12.8")

scalacOptions ++= Seq("-deprecation")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % "test"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"

publishMavenStyle := false

bintrayRepository := "sbt-plugins"

bintrayOrganization := Some("jetbrains")
