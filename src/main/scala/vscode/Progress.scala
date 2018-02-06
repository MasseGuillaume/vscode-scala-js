package vscode
import scala.scalajs.js

@js.native
trait Progress[T] extends js.Object {
  def report(value: T): Unit = js.native
}