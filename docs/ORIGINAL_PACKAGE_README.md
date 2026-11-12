# Rise 6.9.9 ソースコード

Rise Launcher 2.6で取得したクライアント本体から、最新版の復元ソースを生成しています。
ランチャーはPlayer nameの初期値User、UIアニメーション、非同期Config読み込み、ログ更新の改善を含む最新版です。
Ornithe版・Arcadium対応用のコードは含めていません。

## 読み始める場所

- `reference/modules.md`: モジュール・モード一覧とソースへのリンク。
- `sources/deobfuscated/rise/module/Module.java`: モジュールの有効化・イベント・設定。
- `sources/deobfuscated/rise/module/ModuleManager.java`: 登録処理。
- `sources/deobfuscated/rise/ui/clickgui/ModernClickGui.java`: Modern GUI。
- `sources/deobfuscated/rise/ui/clickgui/DropdownClickGui.java`: Dropdown GUI。
- `sources/deobfuscated/rise/value/`: 設定値の基盤。
- `sources/raw/`: 元のクラス名による6.9.9の逆コンパイル結果。
- `sources/launcher/`: 提供された2.6ランチャーの逆コンパイル結果。
- `launcher/src/`: 現在のランチャーと起動・Config連携処理。
- `launcher/src/rise/local/ui/`: アニメーションとUI共通処理。
- `launcher/native/`: Raw Mouse InputのC++実装。
- `launcher/resources/`: クライアントの版情報と同梱CAS Config。

本体は4125クラスを復元し、154個のモジュールクラスと279個のモードを索引化しています。
実行時に登録されるモジュール数は検証時146個です。索引には未登録のクラスも含まれます。
クラス名を482個整理しています。モード名が確定していない箇所は元の識別子を残しています。
対応表は `reference/class-mappings.tsv` と `reference/member-mappings.tsv` にあります。
入力のハッシュと版情報は `reference/source-version.json` を参照してください。

## 復元コードについて

本体は逆コンパイルした参照用コードです。そのままjavacで本体全体を再ビルドできる元の開発プロジェクトではありません。
暗号化文字列、複雑な制御フロー、JNIのnative宣言が残っています。ネイティブ実装全体をJavaへ復元したものではありません。
逆コンパイル時の診断は `reference/source-diagnostics.json` に記録しています。

## ランチャーのビルド

Windows x64、JDK 21以上、Visual Studio C++ Build Tools、Pythonが必要です。
このZIPにはゲーム実行用Jar、Javaランタイム、個人設定、アカウント、ワールド、ログ、作業キャッシュを含めていません。
次の入力を元の相対パスに別途配置してください。

- `artifacts/client-restored.jar`: 6.9.9の復元済みJar。
- `artifacts/libraries.jar`: クライアントの依存ライブラリ。
- 元のランチャー用ネイティブライブラリとMinecraft 1.8アセット。

```powershell
New-Item -ItemType Directory -Force work/agent-classes
javac --release 17 -cp 'tools/asm-9.9.jar;tools/asm-tree-9.9.jar;tools/asm-analysis-9.9.jar' -d work/agent-classes tools/CleanBytecode.java
.\launcher\build.ps1
```

1ファイルEXEは `launcher/build-portable.ps1` で生成します。ランチャーは既存のユーザー設定を保持します。
初期設定の例は `launcher/settings.properties.example`、Configの初期適用は `launcher/src/rise/local/config/ConfigRuntime.java` です。
検証結果は `reference/standalone-update-2.6.json` と `reference/launcher-motion.json` にあります。
