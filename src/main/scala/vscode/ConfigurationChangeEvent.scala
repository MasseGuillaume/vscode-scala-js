package vscode
import scala.scalajs.js

@js.native
trait ConfigurationChangeEvent extends js.Object {
  def affectsConfiguration(section: String, resource: Uri ): Boolean = js.native
}