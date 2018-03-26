scalaVersion := "2.12.4"
scalacOptions ++= Seq("-feature", "-language:postfixOps")

addSbtPlugin("org.scala-sbt"     % "sbt-houserules" % "0.3.5")
addSbtPlugin("org.scala-sbt"     % "sbt-contraband" % "0.4.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"     % "3.0.2")
addSbtPlugin("com.eed3si9n"      % "sbt-buildinfo"  % "0.8.0")
addSbtPlugin("com.eed3si9n"      % "sbt-unidoc"     % "0.4.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-ghpages"    % "0.6.2")
