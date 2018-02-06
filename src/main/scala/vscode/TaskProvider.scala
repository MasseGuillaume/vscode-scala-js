package vscode
import scala.scalajs.js

@js.native
trait TaskProvider extends js.Object {
  def provideTasks(token: CancellationToken ): ProviderResult[js.Array[Task]] = js.native
  def resolveTask(task: Task, token: CancellationToken ): ProviderResult[Task] = js.native
}