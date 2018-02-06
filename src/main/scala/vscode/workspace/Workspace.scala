package vscode.workspace
import scala.scalajs.js
import js.annotation._
import js.|
import vscode._

@js.native
@JSGlobal("vscode.workspace")
object Workspace extends js.Object {
  def rootPath: String | Unit = js.native
  def workspaceFolders: js.Array[WorkspaceFolder] | Unit = js.native
  def name: String | Unit = js.native
  val onDidChangeWorkspaceFolders: Event[WorkspaceFoldersChangeEvent] = js.native
  def getWorkspaceFolder(uri: Uri): WorkspaceFolder | Unit = js.native
  def asRelativePath(pathOrUri: String | Uri, includeWorkspaceFolder: Boolean ): String = js.native
  def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean , ignoreChangeEvents: Boolean , ignoreDeleteEvents: Boolean ): FileSystemWatcher = js.native
  def findFiles(include: GlobPattern, exclude: GlobPattern | Null , maxResults: Double , token: CancellationToken ): Thenable[js.Array[Uri]] = js.native
  def saveAll(includeUntitled: Boolean ): Thenable[Boolean] = js.native
  def applyEdit(edit: WorkspaceEdit): Thenable[Boolean] = js.native
  def textDocuments: js.Array[TextDocument] = js.native
  def openTextDocument(uri: Uri): Thenable[TextDocument] = js.native
  def openTextDocument(fileName: String): Thenable[TextDocument] = js.native
  def openTextDocument(options: js.Any ): Thenable[TextDocument] = js.native
  def registerTextDocumentContentProvider(scheme: String, provider: TextDocumentContentProvider): Disposable = js.native
  val onDidOpenTextDocument: Event[TextDocument] = js.native
  val onDidCloseTextDocument: Event[TextDocument] = js.native
  val onDidChangeTextDocument: Event[TextDocumentChangeEvent] = js.native
  val onWillSaveTextDocument: Event[TextDocumentWillSaveEvent] = js.native
  val onDidSaveTextDocument: Event[TextDocument] = js.native
  def getConfiguration(section: String , resource: Uri | Null ): WorkspaceConfiguration = js.native
  val onDidChangeConfiguration: Event[ConfigurationChangeEvent] = js.native
  def registerTaskProvider(`type`: String, provider: TaskProvider): Disposable = js.native
}