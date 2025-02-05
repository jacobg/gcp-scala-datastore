name := "datastore-scala-wrapper"

organization := "io.applicative"

version := "1.1-rc0"

scalaVersion := "2.13.16"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

crossScalaVersions := Seq(scalaVersion.value)

libraryDependencies ++= {
  val gcdJavaSDKVersion = "2.26.0"
  val specsVersion = "4.20.9"

  Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "com.google.cloud" % "google-cloud-datastore" % gcdJavaSDKVersion,
    "org.specs2" %% "specs2-core" % specsVersion % "test",
    "org.specs2" %% "specs2-mock" % specsVersion % "test"
  )
}

publishTo := Some("gcp-scala-datastore" at "https://maven.pkg.github.com/jacobg/gcp-scala-datastore")

// Configure where credentials are stored to access private GitHub Packages repository.
credentials += Credentials(Path.userHome / ".sbt" / ".credentials")