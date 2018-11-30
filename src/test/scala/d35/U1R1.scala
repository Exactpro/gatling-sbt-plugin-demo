package d35

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class U1R1 extends Simulation {

  val srv1 = http
    .baseUrl("https://z.d35.ru")
    .inferHtmlResources()
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Gatling3").silentResources

  val scn = scenario("B1").repeat(1) {
    exec(http("home")  .get("/"))                                     .pause(4, 7)
   .exec(http("gbook") .get("/guestbook.php"))                        .pause(2, 3)
   .exec(http("gbook2").get("/guestbook.php?group=1&from=30"))        .pause(1, 2)
   .exec(http("gb3306").get("/guestbook.php?message=3306"))           .pause(2, 5)
 //.exec(http("4.2M")  .get("/PDF/978-5-4212-0101-4_Bytie.pdf"))      .pause(12,15)
   .exec(http("search").get("/find.php?search=%D6%E5%F0%EA%EE%E2%FC")).pause(1, 5)
 //.exec(http("12M").get("/PDF/978-5-4212-0184-7_Svodn7.pdf"))        .pause(12,15)
   .exec(http("pentat").get("/PentateuchOfMoses.php"))                .pause(4,5)
   .exec(http("pent18").get("/PentateuchOfMoses.php?page=18"))        .pause(2,7)
  }

  setUp(scn.inject(rampUsers(1) during(1 second)).protocols(srv1))
}
