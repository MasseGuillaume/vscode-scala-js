package vscode
import scala.scalajs.js

@js.native
trait OutputChannel extends js.Object {
  def name: String = js.native
  def append(value: String): Unit = js.native
  def appendLine(value: String): Unit = js.native
  def clear(): Unit = js.native
  def show(preserveFocus: Boolean ): Unit = js.native
  def show(column: ViewColumn , preserveFocus: Boolean ): Unit = js.native
  def hide(): Unit = js.native
  def dispose(): Unit = js.native
}