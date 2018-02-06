package vscode.window
import scala.scalajs.js
import js.annotation._
import js.|
import vscode._

@js.native
@JSGlobal("vscode.window")
object Window extends js.Object {
  def activeTextEditor: TextEditor | Unit = js.native
  def visibleTextEditors: js.Array[TextEditor] = js.native
  val onDidChangeActiveTextEditor: Event[TextEditor | Unit] = js.native
  val onDidChangeVisibleTextEditors: Event[js.Array[TextEditor]] = js.native
  val onDidChangeTextEditorSelection: Event[TextEditorSelectionChangeEvent] = js.native
  val onDidChangeTextEditorOptions: Event[TextEditorOptionsChangeEvent] = js.native
  val onDidChangeTextEditorViewColumn: Event[TextEditorViewColumnChangeEvent] = js.native
  val onDidCloseTerminal: Event[Terminal] = js.native
  def state: WindowState = js.native
  val onDidChangeWindowState: Event[WindowState] = js.native
  def showTextDocument(document: TextDocument, column: ViewColumn , preserveFocus: Boolean ): Thenable[TextEditor] = js.native
  def showTextDocument(document: TextDocument, options: TextDocumentShowOptions ): Thenable[TextEditor] = js.native
  def showTextDocument(uri: Uri, options: TextDocumentShowOptions ): Thenable[TextEditor] = js.native
  def createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType = js.native
  def showInformationMessage(message: String, items: String*): Thenable[String | Unit] = js.native
  def showInformationMessage(message: String, options: MessageOptions, items: String*): Thenable[String | Unit] = js.native
  // def showInformationMessage[T <: MessageItem](message: String, items: T*): Thenable[T | Unit] = js.native
  // def showInformationMessage[T <: MessageItem](message: String, options: MessageOptions, items: T*): Thenable[T | Unit] = js.native
  def showWarningMessage(message: String, items: String*): Thenable[String | Unit] = js.native
  def showWarningMessage(message: String, options: MessageOptions, items: String*): Thenable[String | Unit] = js.native
  // def showWarningMessage[T <: MessageItem](message: String, items: T*): Thenable[T | Unit] = js.native
  // def showWarningMessage[T <: MessageItem](message: String, options: MessageOptions, items: T*): Thenable[T | Unit] = js.native
  def showErrorMessage(message: String, items: String*): Thenable[String | Unit] = js.native
  // def showErrorMessage(message: String, options: MessageOptions, items: String*): Thenable[String | Unit] = js.native
  // def showErrorMessage[T <: MessageItem](message: String, items: T*): Thenable[T | Unit] = js.native
  // def showErrorMessage[T <: MessageItem](message: String, options: MessageOptions, items: T*): Thenable[T | Unit] = js.native
  def showQuickPick(items: js.Array[String] | Thenable[js.Array[String]], options: QuickPickOptions , token: CancellationToken ): Thenable[String | Unit] = js.native
  // def showQuickPick[T <: QuickPickItem](items: js.Array[T] | Thenable[js.Array[T]], options: QuickPickOptions , token: CancellationToken ): Thenable[T | Unit] = js.native
  def showWorkspaceFolderPick(options: WorkspaceFolderPickOptions ): Thenable[WorkspaceFolder | Unit] = js.native
  def showOpenDialog(options: OpenDialogOptions): Thenable[js.Array[Uri] | Unit] = js.native
  def showSaveDialog(options: SaveDialogOptions): Thenable[Uri | Unit] = js.native
  def showInputBox(options: InputBoxOptions , token: CancellationToken ): Thenable[String | Unit] = js.native
  def createOutputChannel(name: String): OutputChannel = js.native
  def setStatusBarMessage(text: String, hideAfterTimeout: Double): Disposable = js.native
  def setStatusBarMessage(text: String, hideWhenDone: Thenable[js.Any]): Disposable = js.native
  def setStatusBarMessage(text: String): Disposable = js.native
  def withScmProgress[R](task: js.Function1[Progress[Double], Thenable[R]]): Thenable[R] = js.native
  def withProgress[R](options: ProgressOptions, task: js.Function1[Progress[js.Any], Thenable[R]]): Thenable[R] = js.native
  def createStatusBarItem(alignment: StatusBarAlignment , priority: Double ): StatusBarItem = js.native
  def createTerminal(name: String , shellPath: String , shellArgs: js.Array[String] ): Terminal = js.native
  def createTerminal(options: TerminalOptions): Terminal = js.native
  def registerTreeDataProvider[T](viewId: String, treeDataProvider: TreeDataProvider[T]): Disposable = js.native
}