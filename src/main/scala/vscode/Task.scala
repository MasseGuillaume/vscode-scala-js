package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.Task")
class Task protected () extends js.Object {
  def this(taskDefinition: TaskDefinition, name: String, source: String, execution: ProcessExecution | ShellExecution , problemMatchers: String | js.Array[String] ) = this()
  def this(taskDefinition: TaskDefinition, target: WorkspaceFolder | TaskScope | TaskScope, name: String, source: String, execution: ProcessExecution | ShellExecution , problemMatchers: String | js.Array[String] ) = this()
  var definition: TaskDefinition = js.native
  var scope: TaskScope | TaskScope | WorkspaceFolder = js.native
  var name: String = js.native
  var execution: ProcessExecution | ShellExecution = js.native
  var isBackground: Boolean = js.native
  var source: String = js.native
  var group: TaskGroup = js.native
  var presentationOptions: TaskPresentationOptions = js.native
  var problemMatchers: js.Array[String] = js.native
}