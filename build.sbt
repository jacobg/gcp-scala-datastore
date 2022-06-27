name := "datastore-scala-wrapper"

organization := "io.applicative"

version := "1.0"

scalaVersion := "2.13.8"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

crossScalaVersions := Seq(scalaVersion.value)

libraryDependencies ++= {
  val gcdJavaSDKVersion = "2.9.1"
  val specsVersion = "4.16.0"

  Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "com.google.cloud" % "google-cloud-datastore" % gcdJavaSDKVersion,
    "org.specs2" %% "specs2-core" % specsVersion % "test",
    "org.specs2" %% "specs2-mock" % specsVersion % "test"
  )
}
