import sbt.*

// @formatter:off
object Dependencies {
  lazy val ijpColor               = "net.sf.ij-plugins" %% "ijp-color"              % "0.12.2"
  lazy val ijpColorUI             = "net.sf.ij-plugins" %% "ijp-color-ui"           % "0.12.2"
  lazy val ijpDebayer2sx          = "net.sf.ij-plugins" %% "ijp-debayer2sx-core"    % "1.3.4"
  lazy val ijpDebayer2sxPlugins   = "net.sf.ij-plugins" %% "ijp-debayer2sx-plugins" % "1.3.4"
  lazy val ijpImageIO             = "net.sf.ij-plugins"  % "ijp_imageio"            % "2.3.0"
  lazy val ijpToolkit             = "net.sf.ij-plugins" %% "ijp-toolkit"            % "2.3.1"
  lazy val ijpScalaConsole        = "net.sf.ij-plugins" %% "scala-console"          % "1.8.0"
  lazy val ijpScalaConsolePlugins = "net.sf.ij-plugins" %% "scala-console-plugins"  % "1.8.0"
  lazy val imagej                 = "net.imagej"         % "ij"                     % "1.54f"
  lazy val scalaTest              = "org.scalatest"     %% "scalatest"              % "3.2.17"
}
