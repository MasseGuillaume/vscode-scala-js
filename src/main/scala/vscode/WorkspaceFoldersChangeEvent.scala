package vscode
import scala.scalajs.js

@js.native
trait WorkspaceFoldersChangeEvent extends js.Object {
  def added: js.Array[WorkspaceFolder] = js.native
  def removed: js.Array[WorkspaceFolder] = js.native
}