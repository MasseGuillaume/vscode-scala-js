package vscode
import scala.scalajs.js
import js.|

@js.native
trait DebugConfigurationProvider extends js.Object {
  def provideDebugConfigurations(folder: WorkspaceFolder | Unit, token: CancellationToken ): ProviderResult[js.Array[DebugConfiguration]] = js.native
  def resolveDebugConfiguration(folder: WorkspaceFolder | Unit, debugConfiguration: DebugConfiguration, token: CancellationToken ): ProviderResult[DebugConfiguration] = js.native
}