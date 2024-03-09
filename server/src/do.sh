#!/bin/bash

# Javaファイルのコンパイル
javac Main.java

# コンパイルが成功したかを確認
if [ $? -eq 0 ]; then
    # Javaプログラムの実行
    java Main
else
    echo "コンパイルエラーが発生しました。修正してください。"
fi
