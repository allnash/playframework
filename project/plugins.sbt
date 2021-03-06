// Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>

enablePlugins(BuildInfoPlugin)

val Versions = new {
  // when updating sbtNativePackager version, be sure to also update the documentation links in
  // documentation/manual/working/commonGuide/production/Deploying.md
  val sbtNativePackager  = "1.4.1"
  val mima               = "0.5.0"
  val sbtJavaAgent       = "0.1.5"
  val sbtJavaFormatter   = "0.4.4"
  val sbtJmh             = "0.3.4"
  val webjarsLocatorCore = "0.37"
  val sbtHeader          = "5.2.0"
  val scalafmt           = "2.0.1"
  val sbtTwirl: String   = sys.props.getOrElse("twirl.version", "1.5.0-M4")
  val interplay: String  = sys.props.getOrElse("interplay.version", "2.0.8")
}

buildInfoKeys := Seq[BuildInfoKey](
  "sbtNativePackagerVersion" -> Versions.sbtNativePackager,
  "sbtTwirlVersion"          -> Versions.sbtTwirl,
  "sbtJavaAgentVersion"      -> Versions.sbtJavaAgent
)

logLevel := Level.Warn

scalacOptions ++= Seq("-deprecation", "-language:_")

addSbtPlugin("com.typesafe.play"  % "interplay"          % Versions.interplay)
addSbtPlugin("com.typesafe.sbt"   % "sbt-twirl"          % Versions.sbtTwirl)
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin"    % Versions.mima)
addSbtPlugin("com.lightbend.sbt"  % "sbt-javaagent"      % Versions.sbtJavaAgent)
addSbtPlugin("com.lightbend.sbt"  % "sbt-java-formatter" % Versions.sbtJavaFormatter)
addSbtPlugin("pl.project13.scala" % "sbt-jmh"            % Versions.sbtJmh)
addSbtPlugin("de.heikoseeberger"  % "sbt-header"         % Versions.sbtHeader)
addSbtPlugin("org.scalameta"      % "sbt-scalafmt"       % Versions.scalafmt)

libraryDependencies ++= Seq(
  "org.webjars" % "webjars-locator-core" % Versions.webjarsLocatorCore
)

resolvers += Resolver.typesafeRepo("releases")
