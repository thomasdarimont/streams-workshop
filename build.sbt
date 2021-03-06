name := """stream-workshop"""

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-experimental" % "0.10" withSources(),
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6",
  "com.typesafe.akka" %% "akka-cluster" % "2.3.6",
  "org.boofcv" % "xuggler" % "0.17",
  "junit" % "junit" % "4.11",
  "org.scalatest" %% "scalatest" % "2.2.0",
  "com.github.sarxos" % "webcam-capture" % "0.3.9"
)

resolvers += "xuggler-repo" at "http://xuggle.googlecode.com/svn/trunk/repo/share/java"


// Add src/library and src/exercises into the source directories we use when compiling.
unmanagedSourceDirectories in Compile ++= {
  val base = sourceDirectory.value
  Seq(base / "exercises", base / "library", base / "examples")
}
