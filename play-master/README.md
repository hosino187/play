## play2.6 Practice!
play2.6の勉強用リポジトリ

## 環境構築

1. Java8以上がインストールされていることを確認
```
確認コマンド　↓1.8以上ならOK
> java -version 
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
```
もし未インストールの場合は下記参照   
http://qiita.com/RichardImaokaJP/items/a1bc723437f4be420cd2

2. 当プロジェクトをクローンする
```
https://github.com/kawashimayu/play.git
```

## アプリケーション実行
1. プロジェクトをクローンしたフォルダへ移動  
2. SBT起動  
```
(linux & mac) $sh ./sbt/bin/sbt
(Windows) >sbt\bin\sbt.bat
```  
3. 実行  
```
[play2.6] $ run
```
4. ↓にアクセスして何か出ればOK  
  http://localhost:9000/
5. Ctrl + C で終了

## DBコンソール起動
※ H2DBはコネクションを1つしか貼れないので、アプリケーション実行中はDBコンソール起動できません。   
また、DBコンソール起動中はアプリケーション起動できないです( ；∀；) <超不便   
そのため、DBの中身を見るときはアプリケショーンを終了してからじゃないと見れない

1. プロジェクトをクローンしたフォルダへ移動  
2. SBT起動  
```
(linux & mac) $sh ./sbt/bin/sbt
(Windows) >sbt\bin\sbt.bat
```  
3. H2 Console起動!
```
[play2.6] $ h2-browse
```
4. ↓にアクセスして何か出ればOK  
  http://localhost:8082/   
```
↓↓↓↓↓ログイン情報↓↓↓↓↓
[Saved Settings] Generic H2(Embedded)
[Setting Name] Generic H2(Embedded)
--------------------------------------------
[Driver Class] org.h2.Driver
[JDBC URL] jdbc:h2:file:~/play
[User Name] sa
[Password] (空)
```  
5. Ctrl + C で終了
