import akka.http.cors.scaladsl.CorsDirectives._
import akka.http.cors.scaladsl.model.HttpOriginMatcher
import akka.http.cors.scaladsl.settings.CorsSettings
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import com.typesafe.config.ConfigFactory
import org.apache.pekko.http.cors.scaladsl.model.{HttpOriginMatcher => PekkoOriginMatcher}
import org.apache.pekko.http.cors.scaladsl.settings.{CorsSettings => PekkoCorsSettings}

object AkkaPekkoCorsWildcardCredentials {

  def akkaWildcardWithCredentials(): Route = {
    // ruleid: scala-akka-http-cors-wildcard-with-credentials
    val settings = CorsSettings.defaultSettings
      .withAllowedOrigins(HttpOriginMatcher.*)
      .withAllowCredentials(true)
    cors(settings) {
      complete("ok")
    }
  }

  def pekkoWildcardWithCredentials(): Route = {
    // ruleid: scala-akka-http-cors-wildcard-with-credentials
    val settings = PekkoCorsSettings.defaultSettings
      .withAllowCredentials(true)
      .withAllowedOrigins(PekkoOriginMatcher.*)
    complete("ok")
  }

  def akkaAllowAnyOrigin(): Route = {
    val builtIn = akka.http.scaladsl.settings.CorsSettings(system)
    // ruleid: scala-akka-http-cors-wildcard-with-credentials
    val settings = builtIn.withAllowAnyOrigin().withAllowCredentials(true)
    complete("ok")
  }

  def akkaHoconWildcard(): Unit = {
    ConfigFactory.parseString(
      """
      akka.http.cors {
        allow-credentials = on
        # ruleid: scala-akka-http-cors-wildcard-with-credentials
        allowed-origins = ["*"]
      }
      """
    )
  }

  def pekkoHoconWildcard(): Unit = {
    ConfigFactory.parseString(
      """
      pekko.http.cors {
        allow-credentials = true
        # ruleid: scala-akka-http-cors-wildcard-with-credentials
        allowed-origins = ["*"]
      }
      """
    )
  }
}
