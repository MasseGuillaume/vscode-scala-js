package vscode
import scala.scalajs.js

@js.native
trait DebugConsole extends js.Object {
  def append(value: String): Unit = js.native
  def appendLine(value: String): Unit = js.native
}