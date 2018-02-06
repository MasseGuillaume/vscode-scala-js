package vscode
import scala.scalajs.js
import js.|

@js.native
trait SourceControl extends js.Object {
  def id: String = js.native
  def label: String = js.native
  def rootUri: Uri | Unit = js.native
  def inputBox: SourceControlInputBox = js.native
  var count: Double = js.native
  var quickDiffProvider: QuickDiffProvider = js.native
  var commitTemplate: String = js.native
  var acceptInputCommand: Command = js.native
  var statusBarCommands: js.Array[Command] = js.native
  def createResourceGroup(id: String, label: String): SourceControlResourceGroup = js.native
  def dispose(): Unit = js.native
}