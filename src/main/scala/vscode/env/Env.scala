package vscode.env
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.env")
object Env extends js.Object {
  def appName: String = js.native
  def appRoot: String = js.native
  def language: String = js.native
  def machineId: String = js.native
  def sessionId: String = js.native
}