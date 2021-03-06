import Dependencies._

// Use FIJI Scala version
ThisBuild / scalaVersion := "2.12.13"

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "net.sf.ij-plugins"
ThisBuild / organizationName := "IJ-Plugins"

// Determine OS version of JavaFX binaries
lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux") => "linux"
  case n if n.startsWith("Mac") => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}
lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
lazy val javaFXVersion = "15.0.1"

lazy val root = (project in file("."))
  .settings(
    name := "IJ-Plugins Bundle",
    libraryDependencies ++=
      Seq(
        ijpColor,
        ijpColorUI,
        ijpDebayer2sx,
        ijpDebayer2sxPlugins,
        ijpToolkit,
        ijpImageIO,
        imagej,
        scalaTest % Test),
    // Add JavaFX dependencies used by IJP-Color
    libraryDependencies ++= javaFXModules.map(m =>
      "org.openjfx" % s"javafx-$m" % javaFXVersion classifier osName
    ),
    fork := true,
    ijRuntimeSubDir := "sandbox",
    ijPluginsSubDir := "ij-plugins",
    ijCleanBeforePrepareRun := true,
    cleanFiles += ijPluginsDir.value,
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
