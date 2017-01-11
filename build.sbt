name := "ScalaShoppingCart"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "org.scalatest" % "scalatest_2.12" % "3.0.1"

)

// fork a new JVM for 'run' and 'test:run'
fork := true

// fork a new JVM for 'test:run', but not 'run'
fork in Test := true

// add a JVM option to use when forking a JVM for 'run'
javaOptions += "-Xmx512M"