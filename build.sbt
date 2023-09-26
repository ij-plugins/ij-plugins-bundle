import Dependencies.*

// Use FIJI Scala version
//ThisBuild / scalaVersion := "2.13.8"
ThisBuild / scalaVersion := "3.3.1"

ThisBuild / version := "1.3.0.1-SNAPSHOT"
ThisBuild / organization := "net.sf.ij-plugins"
ThisBuild / organizationName := "IJ-Plugins"

lazy val root = (project in file("."))
  .settings(
    name := "IJ-Plugins Bundle",
    libraryDependencies ++=
      Seq(
        ijpColor,
        ijpColorUI,
        //        ijpDebayer2sx,
        ijpDebayer2sxPlugins,
        ijpToolkit,
        //        ijpScalaConsolePlugins,
        ijpImageIO,
        imagej,
        scalaTest % Test
      ),
    //    // Add JavaFX dependencies used by IJP-Color
    //    libraryDependencies ++= javaFXModules.map(m =>
    //      "org.openjfx" % s"javafx-$m" % javaFXVersion classifier osName
    //    ),
    //
    resolvers += Resolver.mavenLocal,
    //
    fork := true,
    ijRuntimeSubDir := "sandbox",
    ijPluginsSubDir := "ij-plugins",
    ijCleanBeforePrepareRun := true,
    cleanFiles += ijPluginsDir.value
  )

//name := "IJ-Plugins Bundle"
//libraryDependencies ++=
//  Seq(
//    ijpColor,
//    ijpColorUI,
//    imagej,
//    scalaTest % Test)
//fork := true
//ijRuntimeSubDir := "sandbox"
//ijPluginsSubDir := "ij-plugins"
//ijCleanBeforePrepareRun := true
//cleanFiles += ijPluginsDir.value

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
