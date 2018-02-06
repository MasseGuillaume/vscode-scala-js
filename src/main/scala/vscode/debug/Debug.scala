package vscode.debug
import scala.scalajs.js
import js.annotation._
import js.|
import vscode._

@js.native
@JSGlobal("vscode.debug")
object Debug extends js.Object {
  def startDebugging(folder: WorkspaceFolder | Unit, nameOrConfiguration: String | DebugConfiguration): Thenable[Boolean] = js.native
  def activeDebugSession: DebugSession | Unit = js.native
  def activeDebugConsole: DebugConsole = js.native
  val onDidChangeActiveDebugSession: Event[DebugSession | Unit] = js.native
  val onDidStartDebugSession: Event[DebugSession] = js.native
  val onDidReceiveDebugSessionCustomEvent: Event[DebugSessionCustomEvent] = js.native
  val onDidTerminateDebugSession: Event[DebugSession] = js.native
  def registerDebugConfigurationProvider(debugType: String, provider: DebugConfigurationProvider): Disposable = js.native
}