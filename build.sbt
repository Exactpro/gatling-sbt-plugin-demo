enablePlugins(GatlingPlugin)

scalaVersion := "2.12.7"
val gatlingVer = "3.0.2-SNAPSHOT"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVer % "test,it"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVer % "test,it"
