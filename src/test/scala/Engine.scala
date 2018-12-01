// github.com/gatling/gatling-maven-plugin-demo/tree/c6d371/src/test/scala/Engine.scala
import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine extends App {

	val props = new GatlingPropertiesBuilder()
		.resourcesDirectory(IDEPathHelper.simResourcesDirectory.toString)
		.resultsDirectory(IDEPathHelper.simResultsDirectory.toString)
		.binariesDirectory(IDEPathHelper.buildBinariesDirectory.toString)
	.runDescription("from IDE").simulationClass("computerdatabase.BasicSimulation")

	Gatling.fromMap(props.build)
}
