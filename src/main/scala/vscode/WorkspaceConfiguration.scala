package vscode
import scala.scalajs.js
import js.|

@js.native
trait WorkspaceConfiguration extends js.Object {
  def get[T](section: String): T | Unit = js.native
  def get[T](section: String, defaultValue: T): T = js.native
  def has(section: String): Boolean = js.native
  def inspect[T](section: String): js.Any | Unit = js.native
  def update(section: String, value: js.Any, configurationTarget: ConfigurationTarget | Boolean ): Thenable[Unit] = js.native
}