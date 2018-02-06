package vscode
import scala.scalajs.js

@js.native
trait Extension[T] extends js.Object {
  def id: String = js.native
  def extensionPath: String = js.native
  def isActive: Boolean = js.native
  def packageJSON: js.Any = js.native
  def exports: T = js.native
  def activate(): Thenable[T] = js.native
}