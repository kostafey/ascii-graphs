name := "ascii-graphs"
version := "0.0.6"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.13.1"
crossScalaVersions := Seq("2.12.8", "2.13.1")
scalacOptions ++= Seq("-deprecation")
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.1" % "test"

publishMavenStyle := true
