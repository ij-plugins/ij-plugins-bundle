import sbt._

// @formatter:off
object Dependencies {
  lazy val ijpColor             = "net.sf.ij-plugins" %% "ijp-color"              % "0.10.1"
  lazy val ijpColorUI           = "net.sf.ij-plugins" %% "ijp-color-ui"           % "0.10.1"
  lazy val ijpDebayer2sx        = "net.sf.ij-plugins" %% "ijp-debayer2sx-core"    % "1.2.0"
  lazy val ijpDebayer2sxPlugins = "net.sf.ij-plugins" %% "ijp-debayer2sx-plugins" % "1.2.0"
  lazy val ijpImageIO           = "net.sf.ij-plugins"  % "ijp_imageio"            % "2.2.0"
  lazy val ijpToolkit           = "net.sf.ij-plugins" %% "ijp-toolkit"            % "2.3.0"
  lazy val ijpJavaCVCore        = "net.sf.ij-plugins" %% "ijp-javacv-core"        % "0.3.1"
  lazy val imagej               = "net.imagej"         % "ij"                     % "1.53g"
  lazy val scalaTest            = "org.scalatest"     %% "scalatest"              % "3.2.4"
}
