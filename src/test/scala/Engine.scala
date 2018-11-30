import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine extends App {

	val props = new GatlingPropertiesBuilder()
		.dataDirectory(IDEPathHelper.simDataDirectory.toString)
		.resultsDirectory(IDEPathHelper.simResultsDirectory.toString)
		.bodiesDirectory(IDEPathHelper.simBodiesDirectory.toString)
		.binariesDirectory(IDEPathHelper.buildBinariesDirectory.toString)
	.runDescription("from IDE").simulationClass("d35.BasicSim")

	Gatling.fromMap(props.build)
}
