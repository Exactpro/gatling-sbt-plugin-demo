import java.nio.file.Path

import io.gatling.commons.util.PathHelper._

object IDEPathHelper {
	val gatlingConfUrl: Path = getClass.getClassLoader.getResource("gatling.conf")
	val projectRootDir = gatlingConfUrl.ancestor(3)

	val simSourcesDirectory 	= projectRootDir / "src" / "test" / "scala"
	val simResourcesDirectory = projectRootDir / "src" / "test" / "resources"
//val simDataDirectory 				= simResourcesDirectory / "data"
//val simBodiesDirectory 			= simResourcesDirectory / "bodies"
	val buildTargetDirectory 	= projectRootDir / "target"
	val buildBinariesDirectory 	= buildTargetDirectory / "test-classes"
	val simResultsDirectory 		= buildTargetDirectory / "gatling"
}
