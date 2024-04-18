lazy val coolApp = project.in(file("."))
  .settings(
    // the name/path of a jar file will more or less be:
    // organization/name_scalaBin-version.jar
    // where “scalaBin” is the scala binary version (which is just 3 for all 3.x version)
    // the organization is only included in the path when publishing the jar locally

    name         := "coolapp",
    version      := "0.1.0",
    organization := "de.rmgk",
    scalaVersion := "3.4.1",

    // this is not necessary if you have a single main class, but if you have multiple it may be useful.
    // It defines the default for `sbt run` but also writes this in the jar
    Compile / mainClass := Some("de.rmgk.CoolApp"),

    // external dependency just for demo purposes
    libraryDependencies += "org.jsoup" % "jsoup" % "1.17.2",
  )
