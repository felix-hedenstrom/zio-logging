val zioSbtVersion = "0.4.0-alpha.27"

addSbtPlugin("dev.zio"      % "zio-sbt-ecosystem" % zioSbtVersion)
addSbtPlugin("dev.zio"      % "zio-sbt-website"   % zioSbtVersion)
addSbtPlugin("dev.zio"      % "zio-sbt-ci"        % zioSbtVersion)
addSbtPlugin("com.typesafe" % "sbt-mima-plugin"   % "1.1.4")
addSbtPlugin("org.scala-js" % "sbt-scalajs"       % "1.16.0")

resolvers ++= Resolver.sonatypeOssRepos("public")
