package vscode

import scala.scalajs.js
import js.annotation._
import js.|
import js.RegExp

import vscode._
import env._
import commands._
import window._
import workspace._
import languages._
import scm._
import debug._
import extensions._

@js.native
trait Command extends js.Object {
  var title: String = js.native
  var command: String = js.native
  var tooltip: String = js.native
  var arguments: js.Array[js.Any] = js.native
}

@js.native
trait TextLine extends js.Object {
  def lineNumber: Double = js.native
  def text: String = js.native
  def range: Range = js.native
  def rangeIncludingLineBreak: Range = js.native
  def firstNonWhitespaceCharacterIndex: Double = js.native
  def isEmptyOrWhitespace: Boolean = js.native
}

@js.native
trait TextDocument extends js.Object {
  def uri: Uri = js.native
  def fileName: String = js.native
  def isUntitled: Boolean = js.native
  def languageId: String = js.native
  def version: Double = js.native
  def isDirty: Boolean = js.native
  def isClosed: Boolean = js.native
  def save(): Thenable[Boolean] = js.native
  def eol: EndOfLine = js.native
  def lineCount: Double = js.native
  def lineAt(line: Double): TextLine = js.native
  def lineAt(position: Position): TextLine = js.native
  def offsetAt(position: Position): Double = js.native
  def positionAt(offset: Double): Position = js.native
  def getText(range: Range ): String = js.native
  def getWordRangeAtPosition(position: Position, regex: RegExp ): Range | Unit = js.native
  def validateRange(range: Range): Range = js.native
  def validatePosition(position: Position): Position = js.native
}

@js.native
@JSGlobal("vscode.Position")
class Position protected () extends js.Object {
  def this(line: Double, character: Double) = this()
  def line: Double = js.native
  def character: Double = js.native
  def isBefore(other: Position): Boolean = js.native
  def isBeforeOrEqual(other: Position): Boolean = js.native
  def isAfter(other: Position): Boolean = js.native
  def isAfterOrEqual(other: Position): Boolean = js.native
  def isEqual(other: Position): Boolean = js.native
  def compareTo(other: Position): Double = js.native
  def translate(lineDelta: Double , characterDelta: Double ): Position = js.native
  def translate(change: js.Any): Position = js.native
  def `with`(line: Double , character: Double ): Position = js.native
  def `with`(change: js.Any): Position = js.native
}

@js.native
@JSGlobal("vscode.Range")
class Range protected () extends js.Object {
  def this(start: Position, end: Position) = this()
  def this(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double) = this()
  def start: Position = js.native
  def end: Position = js.native
  var isEmpty: Boolean = js.native
  var isSingleLine: Boolean = js.native
  def contains(positionOrRange: Position | Range): Boolean = js.native
  def isEqual(other: Range): Boolean = js.native
  def intersection(range: Range): Range | Unit = js.native
  def union(other: Range): Range = js.native
  def `with`(start: Position , end: Position ): Range = js.native
  def `with`(change: js.Any): Range = js.native
}

@js.native
@JSGlobal("vscode.Selection")
class Selection protected () extends Range {
  def this(anchor: Position, active: Position) = this()
  def this(anchorLine: Double, anchorCharacter: Double, activeLine: Double, activeCharacter: Double) = this()
  var anchor: Position = js.native
  var active: Position = js.native
  var isReversed: Boolean = js.native
}

@js.native
sealed trait TextEditorSelectionChangeKind extends js.Object {
}

@js.native
@JSGlobal("vscode.TextEditorSelectionChangeKind")
object TextEditorSelectionChangeKind extends js.Object {
  var Keyboard: TextEditorSelectionChangeKind = js.native
  var Mouse: TextEditorSelectionChangeKind = js.native
  var Command: TextEditorSelectionChangeKind = js.native
  @JSBracketAccess
  def apply(value: TextEditorSelectionChangeKind): String = js.native
}

@js.native
trait TextEditorSelectionChangeEvent extends js.Object {
  var textEditor: TextEditor = js.native
  var selections: js.Array[Selection] = js.native
  var kind: TextEditorSelectionChangeKind = js.native
}

@js.native
trait TextEditorOptionsChangeEvent extends js.Object {
  var textEditor: TextEditor = js.native
  var options: TextEditorOptions = js.native
}

@js.native
trait TextEditorViewColumnChangeEvent extends js.Object {
  var textEditor: TextEditor = js.native
  var viewColumn: ViewColumn = js.native
}

@js.native
sealed trait TextEditorCursorStyle extends js.Object {
}

@js.native
@JSGlobal("vscode.TextEditorCursorStyle")
object TextEditorCursorStyle extends js.Object {
  var Line: TextEditorCursorStyle = js.native
  var Block: TextEditorCursorStyle = js.native
  var Underline: TextEditorCursorStyle = js.native
  var LineThin: TextEditorCursorStyle = js.native
  var BlockOutline: TextEditorCursorStyle = js.native
  var UnderlineThin: TextEditorCursorStyle = js.native
  @JSBracketAccess
  def apply(value: TextEditorCursorStyle): String = js.native
}

@js.native
sealed trait TextEditorLineNumbersStyle extends js.Object {
}

@js.native
@JSGlobal("vscode.TextEditorLineNumbersStyle")
object TextEditorLineNumbersStyle extends js.Object {
  var Off: TextEditorLineNumbersStyle = js.native
  var On: TextEditorLineNumbersStyle = js.native
  var Relative: TextEditorLineNumbersStyle = js.native
  @JSBracketAccess
  def apply(value: TextEditorLineNumbersStyle): String = js.native
}

@js.native
trait TextEditorOptions extends js.Object {
  var tabSize: Double | String = js.native
  var insertSpaces: Boolean | String = js.native
  var cursorStyle: TextEditorCursorStyle = js.native
  var lineNumbers: TextEditorLineNumbersStyle = js.native
}

@js.native
trait TextEditorDecorationType extends js.Object {
  def key: String = js.native
  def dispose(): Unit = js.native
}

@js.native
sealed trait TextEditorRevealType extends js.Object {
}

@js.native
@JSGlobal("vscode.TextEditorRevealType")
object TextEditorRevealType extends js.Object {
  var Default: TextEditorRevealType = js.native
  var InCenter: TextEditorRevealType = js.native
  var InCenterIfOutsideViewport: TextEditorRevealType = js.native
  var AtTop: TextEditorRevealType = js.native
  @JSBracketAccess
  def apply(value: TextEditorRevealType): String = js.native
}

@js.native
sealed trait OverviewRulerLane extends js.Object {
}

@js.native
@JSGlobal("vscode.OverviewRulerLane")
object OverviewRulerLane extends js.Object {
  var Left: OverviewRulerLane = js.native
  var Center: OverviewRulerLane = js.native
  var Right: OverviewRulerLane = js.native
  var Full: OverviewRulerLane = js.native
  @JSBracketAccess
  def apply(value: OverviewRulerLane): String = js.native
}

@js.native
sealed trait DecorationRangeBehavior extends js.Object {
}

@js.native
@JSGlobal("vscode.DecorationRangeBehavior")
object DecorationRangeBehavior extends js.Object {
  var OpenOpen: DecorationRangeBehavior = js.native
  var ClosedClosed: DecorationRangeBehavior = js.native
  var OpenClosed: DecorationRangeBehavior = js.native
  var ClosedOpen: DecorationRangeBehavior = js.native
  @JSBracketAccess
  def apply(value: DecorationRangeBehavior): String = js.native
}

@js.native
trait TextDocumentShowOptions extends js.Object {
  var viewColumn: ViewColumn = js.native
  var preserveFocus: Boolean = js.native
  var preview: Boolean = js.native
  var selection: Range = js.native
}

@js.native
@JSGlobal("vscode.ThemeColor")
class ThemeColor protected () extends js.Object {
  def this(id: String) = this()
}

@js.native
trait ThemableDecorationRenderOptions extends js.Object {
  var backgroundColor: String | ThemeColor = js.native
  var outline: String = js.native
  var outlineColor: String | ThemeColor = js.native
  var outlineStyle: String = js.native
  var outlineWidth: String = js.native
  var border: String = js.native
  var borderColor: String | ThemeColor = js.native
  var borderRadius: String = js.native
  var borderSpacing: String = js.native
  var borderStyle: String = js.native
  var borderWidth: String = js.native
  var fontStyle: String = js.native
  var fontWeight: String = js.native
  var textDecoration: String = js.native
  var cursor: String = js.native
  var color: String | ThemeColor = js.native
  var letterSpacing: String = js.native
  var gutterIconPath: String | Uri = js.native
  var gutterIconSize: String = js.native
  var overviewRulerColor: String | ThemeColor = js.native
  var before: ThemableDecorationAttachmentRenderOptions = js.native
  var after: ThemableDecorationAttachmentRenderOptions = js.native
}

@js.native
trait ThemableDecorationAttachmentRenderOptions extends js.Object {
  var contentText: String = js.native
  var contentIconPath: String | Uri = js.native
  var border: String = js.native
  var borderColor: String | ThemeColor = js.native
  var fontStyle: String = js.native
  var fontWeight: String = js.native
  var textDecoration: String = js.native
  var color: String | ThemeColor = js.native
  var backgroundColor: String | ThemeColor = js.native
  var margin: String = js.native
  var width: String = js.native
  var height: String = js.native
}

@js.native
trait DecorationRenderOptions extends ThemableDecorationRenderOptions {
  var isWholeLine: Boolean = js.native
  var rangeBehavior: DecorationRangeBehavior = js.native
  var overviewRulerLane: OverviewRulerLane = js.native
  var light: ThemableDecorationRenderOptions = js.native
  var dark: ThemableDecorationRenderOptions = js.native
}

@js.native
trait DecorationOptions extends js.Object {
  var range: Range = js.native
  var hoverMessage: MarkedString | js.Array[MarkedString] = js.native
  var renderOptions: DecorationInstanceRenderOptions = js.native
}

@js.native
trait ThemableDecorationInstanceRenderOptions extends js.Object {
  var before: ThemableDecorationAttachmentRenderOptions = js.native
  var after: ThemableDecorationAttachmentRenderOptions = js.native
}

@js.native
trait DecorationInstanceRenderOptions extends ThemableDecorationInstanceRenderOptions {
  var light: ThemableDecorationInstanceRenderOptions = js.native
  var dark: ThemableDecorationInstanceRenderOptions = js.native
}

@js.native
trait TextEditor extends js.Object {
  var document: TextDocument = js.native
  var selection: Selection = js.native
  var selections: js.Array[Selection] = js.native
  var options: TextEditorOptions = js.native
  var viewColumn: ViewColumn = js.native
  def edit(callback: js.Function1[TextEditorEdit, Unit], options: js.Any ): Thenable[Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: Position | Range | js.Array[Position] | js.Array[Range] , options: js.Any ): Thenable[Boolean] = js.native
  def setDecorations(decorationType: TextEditorDecorationType, rangesOrOptions: js.Array[Range] | js.Array[DecorationOptions]): Unit = js.native
  def revealRange(range: Range, revealType: TextEditorRevealType ): Unit = js.native
  def show(column: ViewColumn ): Unit = js.native
  def hide(): Unit = js.native
}

@js.native
sealed trait EndOfLine extends js.Object {
}

@js.native
@JSGlobal("vscode.EndOfLine")
object EndOfLine extends js.Object {
  var LF: EndOfLine = js.native
  var CRLF: EndOfLine = js.native
  @JSBracketAccess
  def apply(value: EndOfLine): String = js.native
}

@js.native
trait TextEditorEdit extends js.Object {
  def replace(location: Position | Range | Selection, value: String): Unit = js.native
  def insert(location: Position, value: String): Unit = js.native
  def delete(location: Range | Selection): Unit = js.native
  def setEndOfLine(endOfLine: EndOfLine): Unit = js.native
}

@js.native
@JSGlobal("vscode.Uri")
class Uri extends js.Object {
  def scheme: String = js.native
  def authority: String = js.native
  def path: String = js.native
  def query: String = js.native
  def fragment: String = js.native
  def fsPath: String = js.native
  def `with`(change: js.Any): Uri = js.native
  def toString(skipEncoding: Boolean ): String = js.native
  def toJSON(): js.Dynamic = js.native
}

@js.native
@JSGlobal("vscode.Uri")
object Uri extends js.Object {
  def file(path: String): Uri = js.native
  def parse(value: String): Uri = js.native
}

@js.native
trait CancellationToken extends js.Object {
  var isCancellationRequested: Boolean = js.native
  var onCancellationRequested: Event[js.Any] = js.native
}

@js.native
@JSGlobal("vscode.CancellationTokenSource")
class CancellationTokenSource extends js.Object {
  var token: CancellationToken = js.native
  def cancel(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("vscode.Disposable")
class Disposable protected () extends js.Object {
  def this(callOnDispose: js.Function) = this()
  def dispose(): js.Dynamic = js.native
}

@js.native
@JSGlobal("vscode.Disposable")
object Disposable extends js.Object {
  def from(disposableLikes: js.Any*): Disposable = js.native
}

@js.native
trait Event[T] extends js.Object {
  def apply(listener: js.Function1[T, Any], thisArgs: js.Any , disposables: js.Array[Disposable] ): Disposable = js.native
}

@js.native
@JSGlobal("vscode.EventEmitter")
class EventEmitter[T] extends js.Object {
  var event: Event[T] = js.native
  def fire(data: T ): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
trait FileSystemWatcher extends Disposable {
  var ignoreCreateEvents: Boolean = js.native
  var ignoreChangeEvents: Boolean = js.native
  var ignoreDeleteEvents: Boolean = js.native
  var onDidCreate: Event[Uri] = js.native
  var onDidChange: Event[Uri] = js.native
  var onDidDelete: Event[Uri] = js.native
}

@js.native
trait TextDocumentContentProvider extends js.Object {
  var onDidChange: Event[Uri] = js.native
  def provideTextDocumentContent(uri: Uri, token: CancellationToken): ProviderResult[String] = js.native
}

@js.native
trait QuickPickItem extends js.Object {
  var label: String = js.native
  var description: String = js.native
  var detail: String = js.native
}

@js.native
trait QuickPickOptions extends js.Object {
  var matchOnDescription: Boolean = js.native
  var matchOnDetail: Boolean = js.native
  var placeHolder: String = js.native
  var ignoreFocusOut: Boolean = js.native
  def onDidSelectItem(item: QuickPickItem | String): js.Dynamic = js.native
}

@js.native
trait WorkspaceFolderPickOptions extends js.Object {
  var placeHolder: String = js.native
  var ignoreFocusOut: Boolean = js.native
}

@js.native
trait OpenDialogOptions extends js.Object {
  var defaultUri: Uri = js.native
  var openLabel: String = js.native
  var canSelectFiles: Boolean = js.native
  var canSelectFolders: Boolean = js.native
  var canSelectMany: Boolean = js.native
  var filters: OpenDialogOptions.Filters = js.native
}

object OpenDialogOptions {

@js.native
trait Filters extends js.Object {
  @JSBracketAccess
  def apply(name: String): js.Array[String] = js.native
  @JSBracketAccess
  def update(name: String, v: js.Array[String]): Unit = js.native
}
}

@js.native
trait SaveDialogOptions extends js.Object {
  var defaultUri: Uri = js.native
  var saveLabel: String = js.native
  var filters: SaveDialogOptions.Filters = js.native
}

object SaveDialogOptions {

@js.native
trait Filters extends js.Object {
  @JSBracketAccess
  def apply(name: String): js.Array[String] = js.native
  @JSBracketAccess
  def update(name: String, v: js.Array[String]): Unit = js.native
}
}

@js.native
trait MessageItem extends js.Object {
  var title: String = js.native
  var isCloseAffordance: Boolean = js.native
}

@js.native
trait MessageOptions extends js.Object {
  var modal: Boolean = js.native
}

@js.native
trait InputBoxOptions extends js.Object {
  var value: String = js.native
  var valueSelection: js.Tuple2[Double, Double] = js.native
  var prompt: String = js.native
  var placeHolder: String = js.native
  var password: Boolean = js.native
  var ignoreFocusOut: Boolean = js.native
  def validateInput(value: String): String | Unit | Null | Thenable[String | Unit | Null] = js.native
}

@js.native
@JSGlobal("vscode.RelativePattern")
class RelativePattern protected () extends js.Object {
  def this(base: WorkspaceFolder | String, pattern: String) = this()
  var base: String = js.native
  var pattern: String = js.native
}

@js.native
@JSGlobal("vscode.CodeActionKind")
class CodeActionKind extends js.Object {
  def value: String = js.native
  def append(parts: String): CodeActionKind = js.native
  def contains(other: CodeActionKind): Boolean = js.native
}

@js.native
@JSGlobal("vscode.CodeActionKind")
object CodeActionKind extends js.Object {
  def Empty: CodeActionKind = js.native
  def QuickFix: CodeActionKind = js.native
  def Refactor: CodeActionKind = js.native
  def RefactorExtract: CodeActionKind = js.native
  def RefactorInline: CodeActionKind = js.native
  def RefactorRewrite: CodeActionKind = js.native
}

@js.native
trait CodeActionContext extends js.Object {
  def diagnostics: js.Array[Diagnostic] = js.native
  def only: CodeActionKind = js.native
}

@js.native
@JSGlobal("vscode.CodeAction")
class CodeAction protected () extends js.Object {
  def this(title: String, kind: CodeActionKind ) = this()
  var title: String = js.native
  var edit: WorkspaceEdit = js.native
  var diagnostics: js.Array[Diagnostic] = js.native
  var command: Command = js.native
  var kind: CodeActionKind = js.native
}

@js.native
trait CodeActionProvider extends js.Object {
  def provideCodeActions(document: TextDocument, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command | CodeAction]] = js.native
}

@js.native
@JSGlobal("vscode.CodeLens")
class CodeLens protected () extends js.Object {
  def this(range: Range, command: Command ) = this()
  var range: Range = js.native
  var command: Command = js.native
  def isResolved: Boolean = js.native
}

@js.native
trait CodeLensProvider extends js.Object {
  var onDidChangeCodeLenses: Event[Unit] = js.native
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[CodeLens]] = js.native
  def resolveCodeLens(codeLens: CodeLens, token: CancellationToken): ProviderResult[CodeLens] = js.native
}

@js.native
trait DefinitionProvider extends js.Object {
  def provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition] = js.native
}

@js.native
trait ImplementationProvider extends js.Object {
  def provideImplementation(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition] = js.native
}

@js.native
trait TypeDefinitionProvider extends js.Object {
  def provideTypeDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition] = js.native
}

@js.native
@JSGlobal("vscode.MarkdownString")
class MarkdownString protected () extends js.Object {
  def this(value: String ) = this()
  var value: String = js.native
  var isTrusted: Boolean = js.native
  def appendText(value: String): MarkdownString = js.native
  def appendMarkdown(value: String): MarkdownString = js.native
  def appendCodeblock(value: String, language: String ): MarkdownString = js.native
}

@js.native
@JSGlobal("vscode.Hover")
class Hover protected () extends js.Object {
  def this(contents: MarkedString | js.Array[MarkedString], range: Range ) = this()
  var contents: js.Array[MarkedString] = js.native
  var range: Range = js.native
}

@js.native
trait HoverProvider extends js.Object {
  def provideHover(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Hover] = js.native
}

@js.native
sealed trait DocumentHighlightKind extends js.Object {
}

@js.native
@JSGlobal("vscode.DocumentHighlightKind")
object DocumentHighlightKind extends js.Object {
  var Text: DocumentHighlightKind = js.native
  var Read: DocumentHighlightKind = js.native
  var Write: DocumentHighlightKind = js.native
  @JSBracketAccess
  def apply(value: DocumentHighlightKind): String = js.native
}

@js.native
@JSGlobal("vscode.DocumentHighlight")
class DocumentHighlight protected () extends js.Object {
  def this(range: Range, kind: DocumentHighlightKind ) = this()
  var range: Range = js.native
  var kind: DocumentHighlightKind = js.native
}

@js.native
trait DocumentHighlightProvider extends js.Object {
  def provideDocumentHighlights(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]] = js.native
}

@js.native
sealed trait SymbolKind extends js.Object {
}

@js.native
@JSGlobal("vscode.SymbolKind")
object SymbolKind extends js.Object {
  var File: SymbolKind = js.native
  var Module: SymbolKind = js.native
  var Namespace: SymbolKind = js.native
  var Package: SymbolKind = js.native
  var Class: SymbolKind = js.native
  var Method: SymbolKind = js.native
  var Property: SymbolKind = js.native
  var Field: SymbolKind = js.native
  var Constructor: SymbolKind = js.native
  var Enum: SymbolKind = js.native
  var Interface: SymbolKind = js.native
  var Function: SymbolKind = js.native
  var Variable: SymbolKind = js.native
  var Constant: SymbolKind = js.native
  var String: SymbolKind = js.native
  var Number: SymbolKind = js.native
  var Boolean: SymbolKind = js.native
  var Array: SymbolKind = js.native
  var Object: SymbolKind = js.native
  var Key: SymbolKind = js.native
  var Null: SymbolKind = js.native
  var EnumMember: SymbolKind = js.native
  var Struct: SymbolKind = js.native
  var Event: SymbolKind = js.native
  var Operator: SymbolKind = js.native
  var TypeParameter: SymbolKind = js.native
  @JSBracketAccess
  def apply(value: SymbolKind): String = js.native
}

@js.native
@JSGlobal("vscode.SymbolInformation")
class SymbolInformation protected () extends js.Object {
  def this(name: String, kind: SymbolKind, containerName: String, location: Location) = this()
  def this(name: String, kind: SymbolKind, range: Range, uri: Uri , containerName: String ) = this()
  var name: String = js.native
  var containerName: String = js.native
  var kind: SymbolKind = js.native
  var location: Location = js.native
}

@js.native
trait DocumentSymbolProvider extends js.Object {
  def provideDocumentSymbols(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[SymbolInformation]] = js.native
}

@js.native
trait WorkspaceSymbolProvider extends js.Object {
  def provideWorkspaceSymbols(query: String, token: CancellationToken): ProviderResult[js.Array[SymbolInformation]] = js.native
  def resolveWorkspaceSymbol(symbol: SymbolInformation, token: CancellationToken): ProviderResult[SymbolInformation] = js.native
}

@js.native
trait ReferenceContext extends js.Object {
  var includeDeclaration: Boolean = js.native
}

@js.native
trait ReferenceProvider extends js.Object {
  def provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]] = js.native
}

@js.native
@JSGlobal("vscode.TextEdit")
class TextEdit protected () extends js.Object {
  def this(range: Range, newText: String) = this()
  var range: Range = js.native
  var newText: String = js.native
  var newEol: EndOfLine = js.native
}

@js.native
@JSGlobal("vscode.TextEdit")
object TextEdit extends js.Object {
  def replace(range: Range, newText: String): TextEdit = js.native
  def insert(position: Position, newText: String): TextEdit = js.native
  def delete(range: Range): TextEdit = js.native
  def setEndOfLine(eol: EndOfLine): TextEdit = js.native
}

@js.native
@JSGlobal("vscode.WorkspaceEdit")
class WorkspaceEdit extends js.Object {
  def size: Double = js.native
  def replace(uri: Uri, range: Range, newText: String): Unit = js.native
  def insert(uri: Uri, position: Position, newText: String): Unit = js.native
  def delete(uri: Uri, range: Range): Unit = js.native
  def has(uri: Uri): Boolean = js.native
  def set(uri: Uri, edits: js.Array[TextEdit]): Unit = js.native
  def get(uri: Uri): js.Array[TextEdit] = js.native
  def entries(): js.Array[js.Tuple2[Uri, js.Array[TextEdit]]] = js.native
}

@js.native
@JSGlobal("vscode.SnippetString")
class SnippetString protected () extends js.Object {
  def this(value: String ) = this()
  var value: String = js.native
  def appendText(string: String): SnippetString = js.native
  def appendTabstop(number: Double ): SnippetString = js.native
  def appendPlaceholder(value: String | js.Function1[SnippetString, Any], number: Double ): SnippetString = js.native
  def appendVariable(name: String, defaultValue: String | js.Function1[SnippetString, Any]): SnippetString = js.native
}

@js.native
trait RenameProvider extends js.Object {
  def provideRenameEdits(document: TextDocument, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit] = js.native
}

@js.native
trait FormattingOptions extends js.Object {
  var tabSize: Double = js.native
  var insertSpaces: Boolean = js.native
  @JSBracketAccess
  def apply(key: String): Boolean | Double | String = js.native
  @JSBracketAccess
  def update(key: String, v: Boolean | Double | String): Unit = js.native
}

@js.native
trait DocumentFormattingEditProvider extends js.Object {
  def provideDocumentFormattingEdits(document: TextDocument, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}

@js.native
trait DocumentRangeFormattingEditProvider extends js.Object {
  def provideDocumentRangeFormattingEdits(document: TextDocument, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}

@js.native
trait OnTypeFormattingEditProvider extends js.Object {
  def provideOnTypeFormattingEdits(document: TextDocument, position: Position, ch: String, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}

@js.native
@JSGlobal("vscode.ParameterInformation")
class ParameterInformation protected () extends js.Object {
  def this(label: String, documentation: String | MarkdownString ) = this()
  var label: String = js.native
  var documentation: String | MarkdownString = js.native
}

@js.native
@JSGlobal("vscode.SignatureInformation")
class SignatureInformation protected () extends js.Object {
  def this(label: String, documentation: String | MarkdownString ) = this()
  var label: String = js.native
  var documentation: String | MarkdownString = js.native
  var parameters: js.Array[ParameterInformation] = js.native
}

@js.native
@JSGlobal("vscode.SignatureHelp")
class SignatureHelp extends js.Object {
  var signatures: js.Array[SignatureInformation] = js.native
  var activeSignature: Double = js.native
  var activeParameter: Double = js.native
}

@js.native
trait SignatureHelpProvider extends js.Object {
  def provideSignatureHelp(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[SignatureHelp] = js.native
}

@js.native
sealed trait CompletionItemKind extends js.Object {
}

@js.native
@JSGlobal("vscode.CompletionItemKind")
object CompletionItemKind extends js.Object {
  var Text: CompletionItemKind = js.native
  var Method: CompletionItemKind = js.native
  var Function: CompletionItemKind = js.native
  var Constructor: CompletionItemKind = js.native
  var Field: CompletionItemKind = js.native
  var Variable: CompletionItemKind = js.native
  var Class: CompletionItemKind = js.native
  var Interface: CompletionItemKind = js.native
  var Module: CompletionItemKind = js.native
  var Property: CompletionItemKind = js.native
  var Unit: CompletionItemKind = js.native
  var Value: CompletionItemKind = js.native
  var Enum: CompletionItemKind = js.native
  var Keyword: CompletionItemKind = js.native
  var Snippet: CompletionItemKind = js.native
  var Color: CompletionItemKind = js.native
  var Reference: CompletionItemKind = js.native
  var File: CompletionItemKind = js.native
  var Folder: CompletionItemKind = js.native
  var EnumMember: CompletionItemKind = js.native
  var Constant: CompletionItemKind = js.native
  var Struct: CompletionItemKind = js.native
  var Event: CompletionItemKind = js.native
  var Operator: CompletionItemKind = js.native
  var TypeParameter: CompletionItemKind = js.native
  @JSBracketAccess
  def apply(value: CompletionItemKind): String = js.native
}

@js.native
@JSGlobal("vscode.CompletionItem")
class CompletionItem protected () extends js.Object {
  def this(label: String, kind: CompletionItemKind ) = this()
  var label: String = js.native
  var kind: CompletionItemKind = js.native
  var detail: String = js.native
  var documentation: String | MarkdownString = js.native
  var sortText: String = js.native
  var filterText: String = js.native
  var insertText: String | SnippetString = js.native
  var range: Range = js.native
  var commitCharacters: js.Array[String] = js.native
  var textEdit: TextEdit = js.native
  var additionalTextEdits: js.Array[TextEdit] = js.native
  var command: Command = js.native
}

@js.native
@JSGlobal("vscode.CompletionList")
class CompletionList protected () extends js.Object {
  def this(items: js.Array[CompletionItem] , isIncomplete: Boolean ) = this()
  var isIncomplete: Boolean = js.native
  var items: js.Array[CompletionItem] = js.native
}

@js.native
sealed trait CompletionTriggerKind extends js.Object {
}

@js.native
@JSGlobal("vscode.CompletionTriggerKind")
object CompletionTriggerKind extends js.Object {
  var Invoke: CompletionTriggerKind = js.native
  var TriggerCharacter: CompletionTriggerKind = js.native
  var TriggerForIncompleteCompletions: CompletionTriggerKind = js.native
  @JSBracketAccess
  def apply(value: CompletionTriggerKind): String = js.native
}

@js.native
trait CompletionContext extends js.Object {
  def triggerKind: CompletionTriggerKind = js.native
  def triggerCharacter: String = js.native
}

@js.native
trait CompletionItemProvider extends js.Object {
  def provideCompletionItems(document: TextDocument, position: Position, token: CancellationToken, context: CompletionContext): ProviderResult[js.Array[CompletionItem] | CompletionList] = js.native
  def resolveCompletionItem(item: CompletionItem, token: CancellationToken): ProviderResult[CompletionItem] = js.native
}

@js.native
@JSGlobal("vscode.DocumentLink")
class DocumentLink protected () extends js.Object {
  def this(range: Range, target: Uri ) = this()
  var range: Range = js.native
  var target: Uri = js.native
}

@js.native
trait DocumentLinkProvider extends js.Object {
  def provideDocumentLinks(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentLink]] = js.native
  def resolveDocumentLink(link: DocumentLink, token: CancellationToken): ProviderResult[DocumentLink] = js.native
}

@js.native
@JSGlobal("vscode.Color")
class Color protected () extends js.Object {
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  def red: Double = js.native
  def green: Double = js.native
  def blue: Double = js.native
  def alpha: Double = js.native
}

@js.native
@JSGlobal("vscode.ColorInformation")
class ColorInformation protected () extends js.Object {
  def this(range: Range, color: Color) = this()
  var range: Range = js.native
  var color: Color = js.native
}

@js.native
@JSGlobal("vscode.ColorPresentation")
class ColorPresentation protected () extends js.Object {
  def this(label: String) = this()
  var label: String = js.native
  var textEdit: TextEdit = js.native
  var additionalTextEdits: js.Array[TextEdit] = js.native
}

@js.native
trait DocumentColorProvider extends js.Object {
  def provideDocumentColors(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[ColorInformation]] = js.native
  def provideColorPresentations(color: Color, context: js.Any, token: CancellationToken): ProviderResult[js.Array[ColorPresentation]] = js.native
}

@js.native
trait CommentRule extends js.Object {
  var lineComment: String = js.native
  var blockComment: CharacterPair = js.native
}

@js.native
trait IndentationRule extends js.Object {
  var decreaseIndentPattern: RegExp = js.native
  var increaseIndentPattern: RegExp = js.native
  var indentNextLinePattern: RegExp = js.native
  var unIndentedLinePattern: RegExp = js.native
}

@js.native
sealed trait IndentAction extends js.Object {
}

@js.native
@JSGlobal("vscode.IndentAction")
object IndentAction extends js.Object {
  var None: IndentAction = js.native
  var Indent: IndentAction = js.native
  var IndentOutdent: IndentAction = js.native
  var Outdent: IndentAction = js.native
  @JSBracketAccess
  def apply(value: IndentAction): String = js.native
}

@js.native
trait EnterAction extends js.Object {
  var indentAction: IndentAction = js.native
  var appendText: String = js.native
  var removeText: Double = js.native
}

@js.native
trait OnEnterRule extends js.Object {
  var beforeText: RegExp = js.native
  var afterText: RegExp = js.native
  var action: EnterAction = js.native
}

@js.native
trait LanguageConfiguration extends js.Object {
  var comments: CommentRule = js.native
  var brackets: js.Array[CharacterPair] = js.native
  var wordPattern: RegExp = js.native
  var indentationRules: IndentationRule = js.native
  var onEnterRules: js.Array[OnEnterRule] = js.native
  var __electricCharacterSupport: LanguageConfiguration.__electricCharacterSupport = js.native
  var __characterPairSupport: LanguageConfiguration.__characterPairSupport = js.native
}

object LanguageConfiguration {

@js.native
trait __electricCharacterSupport extends js.Object {
  var brackets: js.Any = js.native
  var docComment: __electricCharacterSupport.DocComment = js.native
}

object __electricCharacterSupport {

@js.native
trait DocComment extends js.Object {
  var scope: String = js.native
  var open: String = js.native
  var lineStart: String = js.native
  var close: String = js.native
}
}

@js.native
trait __characterPairSupport extends js.Object {
  var autoClosingPairs: js.Array[js.Any] = js.native
}
}

@js.native
sealed trait ConfigurationTarget extends js.Object {
}

@js.native
@JSGlobal("vscode.ConfigurationTarget")
object ConfigurationTarget extends js.Object {
  var Global: ConfigurationTarget = js.native
  var Workspace: ConfigurationTarget = js.native
  var WorkspaceFolder: ConfigurationTarget = js.native
  @JSBracketAccess
  def apply(value: ConfigurationTarget): String = js.native
}

@js.native
trait WorkspaceConfiguration extends js.Object {
  def get[T](section: String): T | Unit = js.native
  def get[T](section: String, defaultValue: T): T = js.native
  def has(section: String): Boolean = js.native
  def inspect[T](section: String): js.Any | Unit = js.native
  def update(section: String, value: js.Any, configurationTarget: ConfigurationTarget | Boolean ): Thenable[Unit] = js.native
}

@js.native
@JSGlobal("vscode.Location")
class Location protected () extends js.Object {
  def this(uri: Uri, rangeOrPosition: Range | Position) = this()
  var uri: Uri = js.native
  var range: Range = js.native
}

@js.native
sealed trait DiagnosticSeverity extends js.Object {
}

@js.native
@JSGlobal("vscode.DiagnosticSeverity")
object DiagnosticSeverity extends js.Object {
  var Error: DiagnosticSeverity = js.native
  var Warning: DiagnosticSeverity = js.native
  var Information: DiagnosticSeverity = js.native
  var Hint: DiagnosticSeverity = js.native
  @JSBracketAccess
  def apply(value: DiagnosticSeverity): String = js.native
}

@js.native
@JSGlobal("vscode.Diagnostic")
class Diagnostic protected () extends js.Object {
  def this(range: Range, message: String, severity: DiagnosticSeverity ) = this()
  var range: Range = js.native
  var message: String = js.native
  var source: String = js.native
  var severity: DiagnosticSeverity = js.native
  var code: String | Double = js.native
}

@js.native
trait DiagnosticCollection extends js.Object {
  def name: String = js.native
  def set(uri: Uri, diagnostics: js.Array[Diagnostic] | Unit): Unit = js.native
  def set(entries: js.Array[js.Tuple2[Uri, js.Array[Diagnostic] | Unit]]): Unit = js.native
  def delete(uri: Uri): Unit = js.native
  def clear(): Unit = js.native
  def forEach(callback: js.Function3[Uri, js.Array[Diagnostic], DiagnosticCollection, Any], thisArg: js.Any ): Unit = js.native
  def get(uri: Uri): js.Array[Diagnostic] | Unit = js.native
  def has(uri: Uri): Boolean = js.native
  def dispose(): Unit = js.native
}

@js.native
sealed trait ViewColumn extends js.Object {
}

@js.native
@JSGlobal("vscode.ViewColumn")
object ViewColumn extends js.Object {
  var Active: ViewColumn = js.native
  var One: ViewColumn = js.native
  var Two: ViewColumn = js.native
  var Three: ViewColumn = js.native
  @JSBracketAccess
  def apply(value: ViewColumn): String = js.native
}

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

@js.native
sealed trait StatusBarAlignment extends js.Object {
}

@js.native
@JSGlobal("vscode.StatusBarAlignment")
object StatusBarAlignment extends js.Object {
  var Left: StatusBarAlignment = js.native
  var Right: StatusBarAlignment = js.native
  @JSBracketAccess
  def apply(value: StatusBarAlignment): String = js.native
}

@js.native
trait StatusBarItem extends js.Object {
  def alignment: StatusBarAlignment = js.native
  def priority: Double = js.native
  var text: String = js.native
  var tooltip: String | Unit = js.native
  var color: String | ThemeColor | Unit = js.native
  var command: String | Unit = js.native
  def show(): Unit = js.native
  def hide(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
trait Progress[T] extends js.Object {
  def report(value: T): Unit = js.native
}

@js.native
trait Terminal extends js.Object {
  def name: String = js.native
  def processId: Thenable[Double] = js.native
  def sendText(text: String, addNewLine: Boolean ): Unit = js.native
  def show(preserveFocus: Boolean ): Unit = js.native
  def hide(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
trait Extension[T] extends js.Object {
  def id: String = js.native
  def extensionPath: String = js.native
  def isActive: Boolean = js.native
  def packageJSON: js.Any = js.native
  def exports: T = js.native
  def activate(): Thenable[T] = js.native
}

@js.native
trait ExtensionContext extends js.Object {
  var subscriptions: js.Array[js.Any] = js.native
  var workspaceState: Memento = js.native
  var globalState: Memento = js.native
  var extensionPath: String = js.native
  def asAbsolutePath(relativePath: String): String = js.native
  var storagePath: String | Unit = js.native
}

@js.native
trait Memento extends js.Object {
  def get[T](key: String): T | Unit = js.native
  def get[T](key: String, defaultValue: T): T = js.native
  def update(key: String, value: js.Any): Thenable[Unit] = js.native
}

@js.native
sealed trait TaskRevealKind extends js.Object {
}

@js.native
@JSGlobal("vscode.TaskRevealKind")
object TaskRevealKind extends js.Object {
  var Always: TaskRevealKind = js.native
  var Silent: TaskRevealKind = js.native
  var Never: TaskRevealKind = js.native
  @JSBracketAccess
  def apply(value: TaskRevealKind): String = js.native
}

@js.native
sealed trait TaskPanelKind extends js.Object {
}

@js.native
@JSGlobal("vscode.TaskPanelKind")
object TaskPanelKind extends js.Object {
  var Shared: TaskPanelKind = js.native
  var Dedicated: TaskPanelKind = js.native
  var New: TaskPanelKind = js.native
  @JSBracketAccess
  def apply(value: TaskPanelKind): String = js.native
}

@js.native
trait TaskPresentationOptions extends js.Object {
  var reveal: TaskRevealKind = js.native
  var echo: Boolean = js.native
  var focus: Boolean = js.native
  var panel: TaskPanelKind = js.native
}

@js.native
@JSGlobal("vscode.TaskGroup")
class TaskGroup extends js.Object {
}

@js.native
@JSGlobal("vscode.TaskGroup")
object TaskGroup extends js.Object {
  var Clean: TaskGroup = js.native
  var Build: TaskGroup = js.native
  var Rebuild: TaskGroup = js.native
  var Test: TaskGroup = js.native
}

@js.native
trait TaskDefinition extends js.Object {
  def `type`: String = js.native
  @JSBracketAccess
  def apply(name: String): js.Any = js.native
  @JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native
}

@js.native
trait ProcessExecutionOptions extends js.Object {
  var cwd: String = js.native
  var env: ProcessExecutionOptions.Env = js.native
}

object ProcessExecutionOptions {

@js.native
trait Env extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native
  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}
}

@js.native
@JSGlobal("vscode.ProcessExecution")
class ProcessExecution protected () extends js.Object {
  def this(process: String, options: ProcessExecutionOptions ) = this()
  def this(process: String, args: js.Array[String], options: ProcessExecutionOptions ) = this()
  var process: String = js.native
  var args: js.Array[String] = js.native
  var options: ProcessExecutionOptions = js.native
}

@js.native
trait ShellExecutionOptions extends js.Object {
  var executable: String = js.native
  var shellArgs: js.Array[String] = js.native
  var cwd: String = js.native
  var env: ShellExecutionOptions.Env = js.native
}

object ShellExecutionOptions {

@js.native
trait Env extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native
  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}
}

@js.native
@JSGlobal("vscode.ShellExecution")
class ShellExecution protected () extends js.Object {
  def this(commandLine: String, options: ShellExecutionOptions ) = this()
  var commandLine: String = js.native
  var options: ShellExecutionOptions = js.native
}

@js.native
sealed trait TaskScope extends js.Object

@js.native
@JSGlobal("vscode.TaskScope")
object TaskScope extends js.Object {
  var Global: TaskScope = js.native
  var Workspace: TaskScope = js.native
  @JSBracketAccess
  def apply(value: TaskScope): String = js.native
}

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

@js.native
trait TaskProvider extends js.Object {
  def provideTasks(token: CancellationToken ): ProviderResult[js.Array[Task]] = js.native
  def resolveTask(task: Task, token: CancellationToken ): ProviderResult[Task] = js.native
}

package env {

@js.native
@JSGlobal("vscode.env")
object Env extends js.Object {
  def appName: String = js.native
  def appRoot: String = js.native
  def language: String = js.native
  def machineId: String = js.native
  def sessionId: String = js.native
}

}

package commands {

@js.native
@JSGlobal("vscode.commands")
object Commands extends js.Object {
  def registerCommand(command: String, callback: js.Function, thisArg: js.Any ): Disposable = js.native
  def registerTextEditorCommand(command: String, callback: js.Function, thisArg: js.Any ): Disposable = js.native
  def executeCommand[T](command: String, rest: js.Any*): Thenable[T | Unit] = js.native
  def getCommands(filterInternal: Boolean ): Thenable[js.Array[String]] = js.native
}

}

@js.native
trait WindowState extends js.Object {
  def focused: Boolean = js.native
}

package window {

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

}

@js.native
trait TreeDataProvider[T] extends js.Object {
  var onDidChangeTreeData: Event[T | Unit | Null] = js.native
  def getTreeItem(element: T): TreeItem | Thenable[TreeItem] = js.native
  def getChildren(element: T ): ProviderResult[js.Array[T]] = js.native
}

@js.native
@JSGlobal("vscode.TreeItem")
class TreeItem protected () extends js.Object {
  def this(label: String, collapsibleState: TreeItemCollapsibleState ) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState ) = this()
  var label: String = js.native
  var id: String = js.native
  var iconPath: String | Uri | js.Any = js.native
  var resourceUri: Uri = js.native
  var command: Command = js.native
  var collapsibleState: TreeItemCollapsibleState = js.native
  var contextValue: String = js.native
}

@js.native
sealed trait TreeItemCollapsibleState extends js.Object {
}

@js.native
@JSGlobal("vscode.TreeItemCollapsibleState")
object TreeItemCollapsibleState extends js.Object {
  var None: TreeItemCollapsibleState = js.native
  var Collapsed: TreeItemCollapsibleState = js.native
  var Expanded: TreeItemCollapsibleState = js.native
  @JSBracketAccess
  def apply(value: TreeItemCollapsibleState): String = js.native
}

@js.native
trait TerminalOptions extends js.Object {
  var name: String = js.native
  var shellPath: String = js.native
  var shellArgs: js.Array[String] = js.native
  var cwd: String = js.native
  var env: TerminalOptions.Env = js.native
}

object TerminalOptions {

@js.native
trait Env extends js.Object {
  @JSBracketAccess
  def apply(key: String): String | Null = js.native
  @JSBracketAccess
  def update(key: String, v: String | Null): Unit = js.native
}
}

@js.native
sealed trait ProgressLocation extends js.Object {
}

@js.native
@JSGlobal("vscode.ProgressLocation")
object ProgressLocation extends js.Object {
  var SourceControl: ProgressLocation = js.native
  var Window: ProgressLocation = js.native
  @JSBracketAccess
  def apply(value: ProgressLocation): String = js.native
}

@js.native
trait ProgressOptions extends js.Object {
  var location: ProgressLocation = js.native
  var title: String = js.native
}

@js.native
trait TextDocumentContentChangeEvent extends js.Object {
  var range: Range = js.native
  var rangeLength: Double = js.native
  var text: String = js.native
}

@js.native
trait TextDocumentChangeEvent extends js.Object {
  var document: TextDocument = js.native
  var contentChanges: js.Array[TextDocumentContentChangeEvent] = js.native
}

@js.native
sealed trait TextDocumentSaveReason extends js.Object {
}

@js.native
@JSGlobal("vscode.TextDocumentSaveReason")
object TextDocumentSaveReason extends js.Object {
  var Manual: TextDocumentSaveReason = js.native
  var AfterDelay: TextDocumentSaveReason = js.native
  var FocusOut: TextDocumentSaveReason = js.native
  @JSBracketAccess
  def apply(value: TextDocumentSaveReason): String = js.native
}

@js.native
trait TextDocumentWillSaveEvent extends js.Object {
  var document: TextDocument = js.native
  var reason: TextDocumentSaveReason = js.native
  def waitUntil(thenable: Thenable[js.Array[TextEdit]]): Unit = js.native
  // def waitUntil(thenable: Thenable[js.Any]): Unit = js.native
}

@js.native
trait WorkspaceFoldersChangeEvent extends js.Object {
  def added: js.Array[WorkspaceFolder] = js.native
  def removed: js.Array[WorkspaceFolder] = js.native
}

@js.native
trait WorkspaceFolder extends js.Object {
  def uri: Uri = js.native
  def name: String = js.native
  def index: Double = js.native
}

package workspace {

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

}

@js.native
trait ConfigurationChangeEvent extends js.Object {
  def affectsConfiguration(section: String, resource: Uri ): Boolean = js.native
}

package languages {

@js.native
@JSGlobal("vscode.languages")
object Languages extends js.Object {
  def getLanguages(): Thenable[js.Array[String]] = js.native
  def `match`(selector: DocumentSelector, document: TextDocument): Double = js.native
  def createDiagnosticCollection(name: String ): DiagnosticCollection = js.native
  def registerCompletionItemProvider(selector: DocumentSelector, provider: CompletionItemProvider, triggerCharacters: String*): Disposable = js.native
  def registerCodeActionsProvider(selector: DocumentSelector, provider: CodeActionProvider): Disposable = js.native
  def registerCodeLensProvider(selector: DocumentSelector, provider: CodeLensProvider): Disposable = js.native
  def registerDefinitionProvider(selector: DocumentSelector, provider: DefinitionProvider): Disposable = js.native
  def registerImplementationProvider(selector: DocumentSelector, provider: ImplementationProvider): Disposable = js.native
  def registerTypeDefinitionProvider(selector: DocumentSelector, provider: TypeDefinitionProvider): Disposable = js.native
  def registerHoverProvider(selector: DocumentSelector, provider: HoverProvider): Disposable = js.native
  def registerDocumentHighlightProvider(selector: DocumentSelector, provider: DocumentHighlightProvider): Disposable = js.native
  def registerDocumentSymbolProvider(selector: DocumentSelector, provider: DocumentSymbolProvider): Disposable = js.native
  def registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider): Disposable = js.native
  def registerReferenceProvider(selector: DocumentSelector, provider: ReferenceProvider): Disposable = js.native
  def registerRenameProvider(selector: DocumentSelector, provider: RenameProvider): Disposable = js.native
  def registerDocumentFormattingEditProvider(selector: DocumentSelector, provider: DocumentFormattingEditProvider): Disposable = js.native
  def registerDocumentRangeFormattingEditProvider(selector: DocumentSelector, provider: DocumentRangeFormattingEditProvider): Disposable = js.native
  def registerOnTypeFormattingEditProvider(selector: DocumentSelector, provider: OnTypeFormattingEditProvider, firstTriggerCharacter: String, moreTriggerCharacter: String*): Disposable = js.native
  def registerSignatureHelpProvider(selector: DocumentSelector, provider: SignatureHelpProvider, triggerCharacters: String*): Disposable = js.native
  def registerDocumentLinkProvider(selector: DocumentSelector, provider: DocumentLinkProvider): Disposable = js.native
  def registerColorProvider(selector: DocumentSelector, provider: DocumentColorProvider): Disposable = js.native
  def setLanguageConfiguration(language: String, configuration: LanguageConfiguration): Disposable = js.native
}

}

@js.native
trait SourceControlInputBox extends js.Object {
  var value: String = js.native
  var placeholder: String = js.native
}

@js.native
trait QuickDiffProvider extends js.Object {
  def provideOriginalResource(uri: Uri, token: CancellationToken): ProviderResult[Uri] = js.native
}

@js.native
trait SourceControlResourceThemableDecorations extends js.Object {
  def iconPath: String | Uri = js.native
}

@js.native
trait SourceControlResourceDecorations extends SourceControlResourceThemableDecorations {
  def strikeThrough: Boolean = js.native
  def faded: Boolean = js.native
  def tooltip: String = js.native
  def light: SourceControlResourceThemableDecorations = js.native
  def dark: SourceControlResourceThemableDecorations = js.native
}

@js.native
trait SourceControlResourceState extends js.Object {
  def resourceUri: Uri = js.native
  def command: Command = js.native
  def decorations: SourceControlResourceDecorations = js.native
}

@js.native
trait SourceControlResourceGroup extends js.Object {
  def id: String = js.native
  var label: String = js.native
  var hideWhenEmpty: Boolean = js.native
  var resourceStates: js.Array[SourceControlResourceState] = js.native
  def dispose(): Unit = js.native
}

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

package scm {

@js.native
@JSGlobal("vscode.scm")
object Scm extends js.Object {
  val inputBox: SourceControlInputBox = js.native
  def createSourceControl(id: String, label: String, rootUri: Uri ): SourceControl = js.native
}

}

@js.native
trait DebugConfiguration extends js.Object {
  var `type`: String = js.native
  var name: String = js.native
  var request: String = js.native
  @JSBracketAccess
  def apply(key: String): js.Any = js.native
  @JSBracketAccess
  def update(key: String, v: js.Any): Unit = js.native
}

@js.native
trait DebugSession extends js.Object {
  def id: String = js.native
  def `type`: String = js.native
  def name: String = js.native
  def customRequest(command: String, args: js.Any ): Thenable[js.Any] = js.native
}

@js.native
trait DebugSessionCustomEvent extends js.Object {
  var session: DebugSession = js.native
  var event: String = js.native
  var body: js.Any = js.native
}

@js.native
trait DebugConfigurationProvider extends js.Object {
  def provideDebugConfigurations(folder: WorkspaceFolder | Unit, token: CancellationToken ): ProviderResult[js.Array[DebugConfiguration]] = js.native
  def resolveDebugConfiguration(folder: WorkspaceFolder | Unit, debugConfiguration: DebugConfiguration, token: CancellationToken ): ProviderResult[DebugConfiguration] = js.native
}

@js.native
trait DebugConsole extends js.Object {
  def append(value: String): Unit = js.native
  def appendLine(value: String): Unit = js.native
}

package debug {

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

}

package extensions {

@js.native
@JSGlobal("vscode.extensions")
object Extensions extends js.Object {
  // def getExtension(extensionId: String): Extension[js.Any] | Unit = js.native
  def getExtension[T](extensionId: String): Extension[T] | Unit = js.native
  def all: js.Array[Extension[js.Any]] = js.native
}

@js.native
@JSGlobal("vscode")
object Vscode extends js.Object {
  val version: String = js.native
  
}

}

